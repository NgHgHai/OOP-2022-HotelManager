package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class AddRoom extends JFrame {
	private JTable table;
	private JTextField txtCost;
	private JTextField txtName;

	/**
	 * * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRoom window = new AddRoom();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddRoom() {

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

		JButton btnBack = new JButton("<Back");
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

		JLabel lblGetId = new JLabel("...................");
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

		JRadioButton rdbtnEconnomy = new JRadioButton("Economy");
		rdbtnEconnomy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnEconnomy.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEconnomy.setBounds(30, 130, 130, 30);
		pnlAddRoom.add(rdbtnEconnomy);

		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNormal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNormal.setBounds(190, 130, 130, 30);
		pnlAddRoom.add(rdbtnNormal);

		JRadioButton rdbtnVIP = new JRadioButton("VIP");
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

		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSingle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnSingle.setBounds(20, 240, 130, 30);
		pnlAddRoom.add(rdbtnSingle);

		JRadioButton rdbtnDouble = new JRadioButton("Double");
		rdbtnDouble.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDouble.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDouble.setBounds(190, 240, 130, 30);
		pnlAddRoom.add(rdbtnDouble);

		JRadioButton rdbtnTriple = new JRadioButton("Triple");
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

		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(80, 383, 90, 40);
		pnlAddRoom.add(btnAdd);
		btnAdd.setFocusable(false);

		JButton btnEdit = new JButton("EDIT");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit.setBounds(185, 383, 90, 40);
		pnlAddRoom.add(btnEdit);
		btnEdit.setFocusable(false);

		JButton btnSave = new JButton("SAVE");
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
		table.setModel(new DefaultTableModel(new Object[][] { { "RID", "RName", "RType", "Status", "Cost" },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "RID", "RName", "RType", "Status", "Cost" }));
		table.setBounds(10, 10, 635, 444);
		pnlTableAddRoom.add(table);

		JButton btnRefresh = new JButton("Sort");
		btnRefresh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnRefresh.setBounds(977, 14, 141, 36);
		pnlContent.add(btnRefresh);
		btnRefresh.setFocusable(false);

		// addActionListener

		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this));

		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this));

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame settingFrame = new Setting();
				if (isVisible()) {
					setVisible(false);
				}
				settingFrame.setVisible(true);
				settingFrame.setLocationRelativeTo(settingFrame);
				settingFrame.setSize(600, 600);
			}
		});
	}

}