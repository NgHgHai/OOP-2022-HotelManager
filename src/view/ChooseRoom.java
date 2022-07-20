package view;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Controller;
import model.ARoom;
import model.Observable;
import model.Observer;
import model.Room;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

public class ChooseRoom extends JFrame implements Observer {
	Observable hotelObs;
	HomePage2 homePage2;
	Controller controller;

	String roomType;
	int roomCapacity;

	String roomId;

	private JTable tableViewChooseRoom;
	private JButton btnBack;
	private JTextField txtIDChoose;
	private JButton btnChooseRoom;

	ArrayList<Room> listChooseRoom = new ArrayList<Room>();
	String[][] viewListChooseRoom;

	String id = "";

	public ChooseRoom(Observable hotelObs, Controller controller, HomePage2 homePage2, String roomType,
			int roomCapacity) {
		// add obs
		this.controller = controller;
		this.hotelObs = hotelObs;
		this.roomType = roomType;
		this.roomCapacity = roomCapacity;
		this.homePage2 = homePage2;
		hotelObs.addObs(this);
		init();
		update();
		actionListener();
	}

	/**
	 * Create the application.
	 */
	public ChooseRoom() {
		init();
	}

	private void init() {
		setVisible(true);
		setResizable(false);
		setBounds(100, 100, 600, 600);
		getContentPane().setLayout(null);

		JPanel pnlTop = new JPanel();
		pnlTop.setLayout(null);
		pnlTop.setBounds(10, 10, 564, 90);
		pnlTop.setBackground(new Color(32, 83, 117));
		getContentPane().add(pnlTop);

		btnBack = new JButton("<Back");
		btnBack.setForeground(Color.WHITE);

		btnBack.setBounds(25, 10, 81, 27);
		btnBack.setBackground(new Color(32, 83, 117));

		btnBack.setFocusable(false);
		pnlTop.add(btnBack);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("libs/logo-small.png"));
		lblLogo.setBounds(173, -28, 128, 128);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(252, 38, 98, 27);
		pnlTop.add(lblGroup17);

		btnChooseRoom = new JButton("OK");
		btnChooseRoom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChooseRoom.setBounds(487, 10, 67, 27);
		btnChooseRoom.setFocusable(false);
		pnlTop.add(btnChooseRoom);

		txtIDChoose = new JTextField();
		txtIDChoose.setHorizontalAlignment(SwingConstants.CENTER);
		txtIDChoose.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtIDChoose.setBounds(413, 10, 64, 27);
		pnlTop.add(txtIDChoose);
		txtIDChoose.setColumns(10);
		txtIDChoose.setEditable(false);

		JPanel pnlViewUser = new JPanel();
		pnlViewUser.setLayout(null);
		pnlViewUser.setBackground(Color.LIGHT_GRAY);
		pnlViewUser.setBounds(10, 111, 564, 439);
		getContentPane().add(pnlViewUser);
		// ===============================================

		tableViewChooseRoom = new JTable();
		tableViewChooseRoom.setBackground(Color.WHITE);
		tableViewChooseRoom.setFont(new Font("Time New Roman", Font.BOLD, 11));
		tableViewChooseRoom.setBounds(0, 0, 564, 439);
		tableViewChooseRoom.setModel(
				new DefaultTableModel(viewListChooseRoom, new String[] { "ID", "View", "Room Type", "Room Capacity" }));
		pnlViewUser.add(tableViewChooseRoom);

	}

	@Override
	public void update() {

		table();
	}

	private void table() {
		for (Room n : controller.searchRoomChoose(roomType, roomCapacity)) {
			listChooseRoom.add(n);
		}
		if (controller.searchRoomChoose(roomType, roomCapacity).size() == 0) {
			JOptionPane.showMessageDialog(null, "Room does not exist");
		}

		viewListChooseRoom = new String[listChooseRoom.size() + 1][4];
		viewListChooseRoom[0][0] = "ID";
		viewListChooseRoom[0][1] = "View";
		viewListChooseRoom[0][2] = "Room Type";
		viewListChooseRoom[0][3] = "Room Capacity";

		for (int i = 0; i < listChooseRoom.size(); i++) {
			viewListChooseRoom[i + 1][0] = listChooseRoom.get(i).getId();
			viewListChooseRoom[i + 1][1] = listChooseRoom.get(i).getType().getView();
			viewListChooseRoom[i + 1][2] = listChooseRoom.get(i).getType().getName();
			viewListChooseRoom[i + 1][3] = listChooseRoom.get(i).getCapacity() + "";
		}
		tableViewChooseRoom.setModel(
				new DefaultTableModel(viewListChooseRoom, new String[] { "ID", "View", "Room Type", "Room Capacity" }));

	}

	private void actionListener() {
		tableViewChooseRoom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTable table = (JTable) e.getSource();
				if (table.getSelectedRow() != 0)
					txtIDChoose.setText(viewListChooseRoom[table.getSelectedRow()][0]);
			}
		});
		btnChooseRoom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homePage2.setTxtRoomID(txtIDChoose.getText());
				setVisible(false);
				homePage2.setVisible(true);
				homePage2.setLocationRelativeTo(null);
			}
		});

		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				homePage2.setVisible(true);
				homePage2.setLocationRelativeTo(null);
			}
		});

	}

}