package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class HomePage2 extends JFrame {
	private JTable table;
	private double count = 2;
	private JFrame frame = new JFrame();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	JPanel panel;
	JButton btnCenter;
	JButton btnGuest;
	JButton btnRooms;
	JButton btnCheckOut;
	static JButton btnCheckIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage2 window = new HomePage2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public HomePage2() {
		initialize();
		frame.add(CheckInPanel());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void change(JPanel panelChange, String string) {
		btnCenter.setText(string);
		frame.remove(panel);
		frame.getContentPane().add(panelChange);

	}

	public JPanel CheckInPanel() {
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnRoomData = new JButton("Room Data");
		btnRoomData.setEnabled(false);
		btnRoomData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRoomData.setFocusable(false);
		btnRoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnRoomData.setBounds(670, 210, 140, 36);
		panel.add(btnRoomData);

		JButton btnPayment = new JButton("Payment");
		btnPayment.setEnabled(false);
		btnPayment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPayment.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnPayment.setBounds(680, 32, 130, 36);
		panel.add(btnPayment);

		
//		Personal Data"
		JButton button_PersonalData = new JButton("Personal Data");
		button_PersonalData.setEnabled(false);
		button_PersonalData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_PersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		button_PersonalData.setBounds(170, 38, 150, 36);
		panel.add(button_PersonalData);

		JButton btnCancel = new JButton("Clear");
		btnCancel.setBackground(SystemColor.controlShadow);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setFocusable(false);
		btnCancel.setBounds(700, 504, 100, 35);
		panel.add(btnCancel);

		JPanel panelRoomData = new JPanel();
		panelRoomData.setLayout(null);
		panelRoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelRoomData.setBounds(520, 49, 420, 155);
		panel.add(panelRoomData);

		JLabel labelRoomID = new JLabel("Room ID:");
		labelRoomID.setBounds(129, 156, 61, 22);
		panelRoomData.add(labelRoomID);

		JLabel labelName = new JLabel("Name");
		labelName.setBounds(200, 156, 48, 22);
		panelRoomData.add(labelName);

		JLabel labelNameCredit = new JLabel("Credit Card Information:");
		labelNameCredit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNameCredit.setBounds(20, 30, 215, 22);
		panelRoomData.add(labelNameCredit);

		JLabel labelCard = new JLabel("Card Number");
		labelCard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelCard.setBounds(20, 60, 130, 31);
		panelRoomData.add(labelCard);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(160, 63, 250, 30);
		panelRoomData.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 104, 250, 30);
		panelRoomData.add(textField_1);

		JLabel labelName_8 = new JLabel("CVC Code");
		labelName_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName_8.setBounds(20, 100, 100, 30);
		panelRoomData.add(labelName_8);

		JPanel panel_PersonalData = new JPanel();
		panel_PersonalData.setLayout(null);
		panel_PersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_PersonalData.setBounds(10, 49, 490, 450);
		panel.add(panel_PersonalData);

		JLabel labelName1 = new JLabel("Name");
		labelName1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName1.setBounds(10, 35, 110, 30);
		panel_PersonalData.add(labelName1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(140, 35, 340, 30);
		panel_PersonalData.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(140, 95, 340, 30);
		panel_PersonalData.add(textField_3);

		JLabel labelName_1 = new JLabel("Phone");
		labelName_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName_1.setBounds(10, 95, 110, 30);
		panel_PersonalData.add(labelName_1);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(140, 155, 340, 30);
		panel_PersonalData.add(textField_4);

		JLabel labelName_2 = new JLabel("Email");
		labelName_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName_2.setBounds(10, 155, 110, 30);
		panel_PersonalData.add(labelName_2);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(140, 215, 340, 30);
		panel_PersonalData.add(textField_5);

		JLabel labelName_3 = new JLabel("Adress");
		labelName_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName_3.setBounds(10, 215, 110, 30);
		panel_PersonalData.add(labelName_3);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(140, 395, 340, 30);
		panel_PersonalData.add(textField_6);

		JLabel labelName_4 = new JLabel("City");
		labelName_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName_4.setBounds(10, 275, 110, 30);
		panel_PersonalData.add(labelName_4);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(140, 275, 340, 30);
		panel_PersonalData.add(textField_7);

		JLabel labelName_5 = new JLabel("Nationality");
		labelName_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName_5.setBounds(10, 335, 110, 30);
		panel_PersonalData.add(labelName_5);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(140, 335, 340, 30);
		panel_PersonalData.add(textField_8);

		JLabel labelName_6 = new JLabel("Passport No");
		labelName_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelName_6.setBounds(10, 395, 110, 30);
		panel_PersonalData.add(labelName_6);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(520, 224, 420, 275);
		panel.add(panel_4);

		JLabel lblNewLabel_3_1 = new JLabel("Room Type");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(20, 30, 124, 25);
		panel_4.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("Room Capacity");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(20, 70, 159, 25);
		panel_4.add(lblNewLabel_3_1_1);

		JButton btnNewButton_4 = new JButton("DELETE");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(49, 403, 85, 21);
		panel_4.add(btnNewButton_4);

		JButton btnNewButton_4_1 = new JButton("ADD");
		btnNewButton_4_1.setBounds(49, 346, 85, 21);
		panel_4.add(btnNewButton_4_1);

		JButton btnNewButton_4_2 = new JButton("EDIT");
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4_2.setBounds(290, 346, 85, 21);
		panel_4.add(btnNewButton_4_2);

		JButton btnNewButton_4_3 = new JButton("SAVE");
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4_3.setBounds(290, 403, 85, 21);
		panel_4.add(btnNewButton_4_3);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Economy");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(160, 30, 96, 21);
		panel_4.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Normal");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBounds(260, 30, 85, 21);
		panel_4.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("VIP");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBounds(342, 30, 56, 21);
		panel_4.add(rdbtnNewRadioButton_2);

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNewRadioButton);
		btnGroup.add(rdbtnNewRadioButton_1);
		btnGroup.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSingle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnSingle.setBounds(163, 70, 70, 21);
		panel_4.add(rdbtnSingle);

		JRadioButton rdbtnDouble = new JRadioButton("Double");
		rdbtnDouble.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDouble.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnDouble.setBounds(255, 70, 85, 21);
		panel_4.add(rdbtnDouble);

		JRadioButton rdbtnTriple = new JRadioButton("Triple");
		rdbtnTriple.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTriple.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnTriple.setBounds(340, 70, 70, 21);
		panel_4.add(rdbtnTriple);

		ButtonGroup btnGroup1 = new ButtonGroup();
		btnGroup1.add(rdbtnSingle);
		btnGroup1.add(rdbtnDouble);
		btnGroup1.add(rdbtnTriple);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Check in date");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1.setBounds(23, 120, 159, 25);
		panel_4.add(lblNewLabel_3_1_1_1);

		JLabel lblNewLabel_3_1_1_2 = new JLabel("Check out date");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_1_2.setBounds(20, 170, 160, 25);
		panel_4.add(lblNewLabel_3_1_1_2);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(175, 120, 200, 30);
		panel_4.add(textField_9);

		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("Room ID:");
		lblNewLabel_3_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_1_2_1.setBounds(20, 220, 96, 25);
		panel_4.add(lblNewLabel_3_1_1_2_1);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(175, 170, 200, 30);
		panel_4.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(112, 220, 100, 30);
		panel_4.add(textField_11);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(0, 191, 255));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(300, 220, 100, 35);
		panel_4.add(btnSearch);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(60, 179, 113));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubmit.setFocusable(false);
		btnSubmit.setBounds(820, 504, 100, 35);
		panel.add(btnSubmit);

		return panel;
	}

	public JPanel CheckOutPanel() {
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		frame.add(panel);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(250, 160, 450, 230);
		panel.add(panel_4);

		JLabel lblNewLabel_1 = new JLabel("Room number");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(34, 75, 123, 68);
		panel_4.add(lblNewLabel_1);
		textField = new JTextField("Room number");
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == textField) {
					textField.setText("");
				}
			}
		});
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(210, 95, 225, 26);
		panel_4.add(textField);
		textField.setColumns(10);

		JButton btn1 = new JButton("Clear");
		btn1.setBackground(new Color(112, 128, 144));
		btn1.setFont(new Font("Serif", Font.PLAIN, 20));
		btn1.setBounds(200, 170, 110, 35);
		btn1.setFocusable(false);
		panel_4.add(btn1);

		JButton btn2 = new JButton("Check out");
		btn2.setBackground(new Color(220, 20, 60));
		btn2.setFont(new Font("Serif", Font.PLAIN, 20));
		btn2.setBounds(315, 170, 120, 35);
		btn2.setFocusable(false);
		panel_4.add(btn2);
		textField.addMouseListener(new MouseAdapter() {
		});
		return panel;
	}

	public JPanel GuestTablePanel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);

		table = new JTable();
		table.setFont(new Font("Time New Roman", Font.BOLD, 11));
		table.setLocation(5, 55);
		table.setSize(950, 490);
		panel.add(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ "RoomID", "Name", "Email", "Address", "City", "Nationlity", "Passport", "Phone", "Days",
								"Fees" },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "RoomID", "Name", "Email", "New column", "New column", "New column", "Passport", "Phone",
						"Days", "Fees" }));

		return panel;
	}

	public JPanel RoomTablePanel() {
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		table = new JTable();
		table.setFont(new Font("Time New Roman", Font.BOLD, 11));
		table.setBounds(5, 50, 950, 490);
		panel.add(table);
		table.setModel(
				new DefaultTableModel(
						new Object[][] {
								{ "ID", "RoomType", "Room Capacity", "Check-in Date", "Check-out Date",
										"is Available?" },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, { null, null, null, null, null, null },
								{ null, null, null, null, null, null }, },
						new String[] { "RoomID", "Name", "Email", "New column", "New column", "New column" }));

		return panel;
	}

	private void initialize() {
		// test up date
//		frame.getContentPane().setBackground(new Color(72, 61, 139));
		frame.getContentPane().setBackground(new Color(32,83,117));
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);

		btnCenter = new JButton("Check In");
		btnCenter.setFont(new Font("Serif", Font.BOLD, 30));
		btnCenter.setBounds(510, 65, 200, 70);
		btnCenter.setFocusable(false);
		btnCenter.setBackground(new Color(135, 206, 250));
		frame.getContentPane().add(btnCenter);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
//		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBackground(new Color(32,83,117));
		panel_1.setBounds(10, 10, 1165, 90);
		frame.getContentPane().add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(10, 100, 200, 550);
		frame.getContentPane().add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(960, 10, 170, 60);
//		panel_3.setBackground(new Color(72, 61, 139));
		panel_3.setBackground(new Color(32,83,117));
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePage2.class.getResource("/libs/iconHuman.png")));
		lblNewLabel.setBounds(0, 0, 42, 50);
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("KH1");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(52, 0, 108, 24);
		panel_3.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("<html><u>Log Out</u></html>");
		btnNewButton.setBackground(Color.YELLOW);
//		btnNewButton.setBorder((Border) Color.WHITE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(62, 27, 89, 23);
		btnNewButton.setFocusable(false);
		panel_3.add(btnNewButton);
		btnNewButton.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_3);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(HomePage2.class.getResource("/libs/logo-small.png")));
		lblNewLabel_6.setBounds(23, -22, 100, 112);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("GROUP 17");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("UTM Cooper Black", Font.BOLD, 18));
		lblNewLabel_7.setBounds(106, 24, 137, 48);
		panel_1.add(lblNewLabel_7);

		btnCheckIn = new JButton("Check In");
		btnCheckIn.setBounds(10, 54, 180, 71);
		btnCheckIn.setBackground(new Color(175, 238, 238));
		btnCheckIn.setFont(new Font("Serif", Font.PLAIN, 30));
		btnCheckIn.setFocusable(false);
		btnCheckIn.addMouseListener(Adapter());

		btnCheckOut = new JButton("Check Out");
		btnCheckOut.setBackground(new Color(176, 224, 230));
		btnCheckOut.setBounds(10, 178, 180, 71);
		btnCheckOut.setBackground(new Color(175, 238, 238));
		btnCheckOut.setFont(new Font("Serif", Font.PLAIN, 30));
		btnCheckOut.setFocusable(false);
		btnCheckOut.addMouseListener(Adapter());

		btnRooms = new JButton("Rooms");
		btnRooms.setBounds(10, 298, 180, 76);
		btnRooms.setBackground(new Color(175, 238, 238));
		btnRooms.setFont(new Font("Serif", Font.PLAIN, 30));
		btnRooms.setFocusable(false);
		btnRooms.addMouseListener(Adapter());

		btnGuest = new JButton("Guest");
		btnGuest.setBounds(10, 418, 180, 76);
		btnGuest.setBackground(new Color(175, 238, 238));
		btnGuest.setFont(new Font("Serif", Font.PLAIN, 30));
		btnGuest.setFocusable(false);
		btnGuest.addMouseListener(Adapter());

		panel_2.setLayout(null);
		panel_2.add(btnCheckIn);
		panel_2.add(btnCheckOut);
		panel_2.add(btnRooms);
		panel_2.add(btnGuest);

	}

	private MouseListener Adapter() {
		// TODO Auto-generated method stub
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				frame.remove(panel);
				if (e.getSource() == btnGuest) {
					btnCenter.setText(btnGuest.getText());
					frame.getContentPane().add(GuestTablePanel());
				}
				if (e.getSource() == btnRooms) {
					btnCenter.setText(btnRooms.getText());
					frame.getContentPane().add(RoomTablePanel());
				}
				if (e.getSource() == btnCheckIn) {
					btnCenter.setText(btnCheckIn.getText());
					frame.getContentPane().add(CheckInPanel());
				}
				if (e.getSource() == btnCheckOut) {
					btnCenter.setText(btnCheckOut.getText());
					frame.getContentPane().add(CheckOutPanel());
				}
				frame.repaint();
			}
		};
	}
}
