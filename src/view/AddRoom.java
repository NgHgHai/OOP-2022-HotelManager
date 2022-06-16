package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controller.Controller;
import model.ARoom;
import model.AType;
import model.Economy;
import model.Normal;
import model.Observable;
import model.Observer;
import model.Room;
import model.VIP;

public class AddRoom extends JFrame implements Observer {
	Observable hotelObs;
	Setting setting;

	private JTable table;
	private JTextField txtCost, txtName;
	private JLabel lblGetId;
	private JRadioButton rdbtnEconnomy, rdbtnNormal, rdbtnVIP, rdbtnSingle, rdbtnDouble, rdbtnTriple;
	// nho dua cac nut can thiet len thanh bien toan cuc.
	private JButton btnBack, btnAdd, btnEdit, btnSave;
	private Controller controller;
	private String type;
	private int capacity = 0;
	private String roomState = "Clean";
	private boolean available = true;
	private String[][] arr;

	public AddRoom(Observable hotelObs, Controller controller, Setting setting) {
		// add obs
		this.hotelObs = hotelObs;
		this.setting = setting;
		this.controller = controller;
		hotelObs.addObs(this);

		init();
		// addActionListener
		actionListener();

	}

	private void actionListener() {

		// ===== back
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				setting.setVisible(true);
				setting.setLocationRelativeTo(null);

			}
		});
		rdbtnEconnomy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(rdbtnEconnomy)) {
					type = rdbtnEconnomy.getText();
				}
			}
		});
		rdbtnNormal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(rdbtnNormal)) {
					type = rdbtnNormal.getText();
				}
			}
		});
		rdbtnVIP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(rdbtnVIP)) {
					type = rdbtnVIP.getText();
				}
			}
		});
		rdbtnSingle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(rdbtnSingle)) {
					capacity = 1;
				}
			}
		});
		rdbtnDouble.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(rdbtnDouble)) {
					capacity = 2;
				}
			}
		});
		rdbtnTriple.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(rdbtnTriple)) {
					capacity = 3;
				}
			}
		});
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = lblGetId.getText();
				String name = txtName.getText();
				double cost = 0;
				try {
					cost = Double.parseDouble(txtCost.getText());
					if (controller.addRoom(id, name, roomState, cost, available, type, capacity)) {
						JOptionPane.showMessageDialog(null, "Add room sucessfully.");

					} else {
						JOptionPane.showMessageDialog(null, "Error!");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Invalid room cost input ");
					// TODO: handle exception
				}

			}
		});
		// viet them cac action cua cac nut khac o day
		//
		//

	}

	private void init() {
		setResizable(false);
		getContentPane().setBackground(State.background);
		setBounds(100, 100, 1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

//		phần logo
		JButton btnCenter = new JButton("Add Room");
		btnCenter.setBackground(new Color(135, 206, 250));
		btnCenter.setFont(new Font("Serif", Font.BOLD, 30));
		btnCenter.setFocusable(false);

		btnCenter.setBounds(510, 65, 200, 70);
		getContentPane().add(btnCenter);

		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(State.background);
		pnlTop.setBounds(10, 10, 1165, 90);
		getContentPane().add(pnlTop);
		pnlTop.setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(State.logo_small);
		lblLogo.setBounds(23, -22, 100, 112);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(106, 24, 137, 48);
		pnlTop.add(lblGroup17);

		btnBack = new JButton("<Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setForeground(Color.WHITE);

		btnBack.setBounds(1020, 25, 90, 30);
		btnBack.setBackground(State.background);
		btnBack.setFocusable(false);
		pnlTop.add(btnBack);

//		phần nội dung

		JPanel pnlContent = new JPanel();
		pnlContent.setLayout(null);
		pnlContent.setBackground(SystemColor.control);
		pnlContent.setBounds(10, 100, 1165, 550);
		getContentPane().add(pnlContent);

		JLabel lblID = new JLabel("ID:");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblID.setBounds(25, 25, 72, 18);
		pnlContent.add(lblID);

		lblGetId = new JLabel("");
		lblGetId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetId.setBounds(53, 21, 106, 27);
		pnlContent.add(lblGetId);

//---------------------------------------------
		JPanel pnlAddRoom = new JPanel();
		pnlAddRoom.setLayout(null);
		pnlAddRoom.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlAddRoom.setBounds(10, 75, 480, 464);
		pnlContent.add(pnlAddRoom);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblName.setBounds(10, 10, 140, 40);
		pnlAddRoom.add(lblName);

		txtName = new JTextField();
		txtName.setBounds(160, 15, 280, 34);
		pnlAddRoom.add(txtName);
		txtName.setColumns(10);

		JLabel lblRoomType = new JLabel("Room Type");
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRoomType.setBounds(10, 70, 170, 40);
		pnlAddRoom.add(lblRoomType);

		rdbtnEconnomy = new JRadioButton("Economy");
		rdbtnEconnomy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnEconnomy.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEconnomy.setBounds(30, 130, 130, 30);
		pnlAddRoom.add(rdbtnEconnomy);

		rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNormal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNormal.setBounds(190, 130, 130, 30);
		pnlAddRoom.add(rdbtnNormal);

		rdbtnVIP = new JRadioButton("VIP");
		rdbtnVIP.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnVIP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnVIP.setBounds(340, 130, 130, 30);
		pnlAddRoom.add(rdbtnVIP);

		ButtonGroup btnRoomType = new ButtonGroup();
		btnRoomType.add(rdbtnEconnomy);
		btnRoomType.add(rdbtnNormal);
		btnRoomType.add(rdbtnVIP);

		JLabel lblRoomCapacity = new JLabel("Room Capacity");
		lblRoomCapacity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRoomCapacity.setBounds(10, 180, 170, 40);
		pnlAddRoom.add(lblRoomCapacity);

		JLabel lblCost = new JLabel("Cost");
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCost.setBounds(10, 306, 140, 40);
		pnlAddRoom.add(lblCost);

		rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSingle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnSingle.setBounds(20, 240, 130, 30);
		pnlAddRoom.add(rdbtnSingle);

		rdbtnDouble = new JRadioButton("Double");
		rdbtnDouble.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDouble.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDouble.setBounds(190, 240, 130, 30);
		pnlAddRoom.add(rdbtnDouble);

		rdbtnTriple = new JRadioButton("Triple");
		rdbtnTriple.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTriple.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnTriple.setBounds(340, 240, 130, 30);
		pnlAddRoom.add(rdbtnTriple);

		ButtonGroup btnRoomCapacity = new ButtonGroup();
		btnRoomCapacity.add(rdbtnSingle);
		btnRoomCapacity.add(rdbtnDouble);
		btnRoomCapacity.add(rdbtnTriple);

		txtCost = new JTextField();
		txtCost.setColumns(10);
		txtCost.setBounds(160, 310, 280, 34);
		pnlAddRoom.add(txtCost);

		btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(80, 383, 90, 40);
		pnlAddRoom.add(btnAdd);
		btnAdd.setFocusable(false);

		btnEdit = new JButton("EDIT");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit.setBounds(185, 383, 90, 40);
		pnlAddRoom.add(btnEdit);
		btnEdit.setFocusable(false);

		btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave.setBounds(290, 383, 90, 40);
		pnlAddRoom.add(btnSave);
		btnSave.setFocusable(false);

//-------------------
		JPanel pnlTableAddRoom = new JPanel();
		pnlTableAddRoom.setLayout(null);
		pnlTableAddRoom.setBounds(500, 75, 655, 464);
		pnlContent.add(pnlTableAddRoom);

		table = new JTable();
		table.setFont(new Font("Time New Roman", Font.BOLD, 12));
		table();
		table.setBounds(10, 10, 635, 444);
		pnlTableAddRoom.add(table);

		JButton btnRefresh = new JButton("Sort");
		btnRefresh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnRefresh.setBounds(977, 14, 141, 36);
		pnlContent.add(btnRefresh);
		btnRefresh.setFocusable(false);

		// logo action
		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this, setting.homePage));
		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this, setting.homePage));

	}

	public void table() {
		Object[] listRoom = controller.getRooms().toArray();
		arr = new String[controller.totalRoom() + 1][7];
		arr[0][0] = "Num";
		arr[0][1] = "ID";
		arr[0][2] = "Name";
		arr[0][3] = "Type";
		arr[0][4] = "Capacity";
		arr[0][5] = "Status";
		arr[0][6] = "Cost";
		for (int i = 0; i < arr.length - 1; i++) {
			Room room = (Room) listRoom[i];
			arr[i + 1][0] = i + 1 + "";
			arr[i + 1][1] = room.getId();
			arr[i + 1][2] = room.getName();
			arr[i + 1][3] = room.getType().getName();
			arr[i + 1][4] = room.getCapacity() + "";
			arr[i + 1][5] = room.getRoomState();
			arr[i + 1][6] = room.getCost() + "";
		}
		table.setModel(
				new DefaultTableModel(arr, new String[] { "Num", "ID", "Name", "Type", "Capacity", "State", "Cost" }));
		table.setEnabled(false);
	}

	@Override
	public void update() {
		// update viet o day
		table();
	}

}