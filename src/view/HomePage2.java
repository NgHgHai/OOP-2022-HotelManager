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

import javax.swing.AbstractButton;
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
	private JTable tableGuest, tableRooms;
	private double count = 2;
	private JFrame frame = new JFrame();
	private JTextField txtCardNumber;
	private JTextField txtCVCCode;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtPassportNo;
	private JTextField txtCity;
	private JTextField txtNationality;
	private JTextField txtCheckInDate;
	private JTextField txtCheckOutDate;
	private JTextField txtRoomID;
	private JTextField txtRoomNumber;
	JPanel panel;
	JButton btnCenter;
	JButton btnGuest;
	JButton btnRooms;
	JButton btnCheckOut;
	static JButton btnCheckIn;
	private JLabel lblCity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage2 window = new HomePage2("checkOut");
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

	public HomePage2(String s) {
		initialize();
		if ("checkIn".equals(s)) {
			frame.add(CheckInPanel());
		}
		if ("checkOut".equals(s)) {
			frame.add(CheckOutPanel());
		}
		if ("room".equals(s)) {
			frame.add(RoomTablePanel());
		}
		if ("guest".equals(s)) {
			frame.add(GuestTablePanel());
		}
		
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
		btnCenter.setText("Check In");
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

//		Personal Data"
		JButton buttonPersonalData = new JButton("Personal Data");
		buttonPersonalData.setEnabled(false);
		buttonPersonalData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonPersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		buttonPersonalData.setBounds(170, 38, 150, 36);
		panel.add(buttonPersonalData);

		JPanel pnlPersonalData = new JPanel();
		pnlPersonalData.setLayout(null);
		pnlPersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlPersonalData.setBounds(10, 49, 490, 450);
		panel.add(pnlPersonalData);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(10, 35, 110, 30);
		pnlPersonalData.add(lblName);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(140, 35, 340, 30);
		pnlPersonalData.add(txtName);

		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(140, 95, 340, 30);
		pnlPersonalData.add(txtPhone);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhone.setBounds(10, 95, 110, 30);
		pnlPersonalData.add(lblPhone);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(140, 155, 340, 30);
		pnlPersonalData.add(txtEmail);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(10, 155, 110, 30);
		pnlPersonalData.add(lblEmail);

		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(140, 215, 340, 30);
		pnlPersonalData.add(txtAddress);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(10, 215, 110, 30);
		pnlPersonalData.add(lblAddress);

		txtPassportNo = new JTextField();
		txtPassportNo.setColumns(10);
		txtPassportNo.setBounds(140, 395, 340, 30);
		pnlPersonalData.add(txtPassportNo);

		lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCity.setBounds(10, 275, 110, 30);
		pnlPersonalData.add(lblCity);

		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(140, 275, 340, 30);
		pnlPersonalData.add(txtCity);

		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNationality.setBounds(10, 335, 110, 30);
		pnlPersonalData.add(lblNationality);

		txtNationality = new JTextField();
		txtNationality.setColumns(10);
		txtNationality.setBounds(140, 335, 340, 30);
		pnlPersonalData.add(txtNationality);

		JLabel lblPassportNo = new JLabel("Passport No");
		lblPassportNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassportNo.setBounds(10, 395, 110, 30);
		pnlPersonalData.add(lblPassportNo);

//		Payment

		JButton btnPayment = new JButton("Payment");
		btnPayment.setEnabled(false);
		btnPayment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPayment.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnPayment.setBounds(680, 38, 130, 36);
		panel.add(btnPayment);


		JPanel pnlPaymet = new JPanel();
		pnlPaymet.setLayout(null);
		pnlPaymet.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlPaymet.setBounds(520, 49, 420, 155);
		panel.add(pnlPaymet);


		JLabel lblCardInformation = new JLabel("Credit Card Information:");
		lblCardInformation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCardInformation.setBounds(20, 30, 215, 22);
		pnlPaymet.add(lblCardInformation);

		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCardNumber.setBounds(20, 60, 130, 31);
		pnlPaymet.add(lblCardNumber);

		txtCardNumber = new JTextField();
		txtCardNumber.setColumns(10);
		txtCardNumber.setBounds(160, 63, 250, 30);
		pnlPaymet.add(txtCardNumber);

		txtCVCCode = new JTextField();
		txtCVCCode.setColumns(10);
		txtCVCCode.setBounds(160, 104, 250, 30);
		pnlPaymet.add(txtCVCCode);

		JLabel lblCVCCode = new JLabel("CVC Code");
		lblCVCCode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCVCCode.setBounds(20, 100, 100, 30);
		pnlPaymet.add(lblCVCCode);

//	RoomData	
		JButton btnRoomData = new JButton("Room Data");
		btnRoomData.setEnabled(false);
		btnRoomData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRoomData.setFocusable(false);
		btnRoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnRoomData.setBounds(670, 215, 140, 36);
		panel.add(btnRoomData);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(SystemColor.controlShadow);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setFocusable(false);
		btnClear.setBounds(700, 504, 100, 35);
		panel.add(btnClear);

		JLabel labelRoomID = new JLabel("Room ID:");
		labelRoomID.setBounds(129, 156, 61, 22);
		pnlPaymet.add(labelRoomID);

		JLabel labelName = new JLabel("Name");
		labelName.setBounds(200, 156, 48, 22);
		pnlPaymet.add(labelName);

		JPanel pnlRoomData = new JPanel();
		pnlRoomData.setLayout(null);
		pnlRoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlRoomData.setBounds(520, 224, 420, 275);
		panel.add(pnlRoomData);

		JLabel lblRoomeType = new JLabel("Room Type");
		lblRoomeType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRoomeType.setBounds(20, 30, 124, 25);
		pnlRoomData.add(lblRoomeType);

		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEconomy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnEconomy.setBounds(160, 30, 96, 21);
		pnlRoomData.add(rdbtnEconomy);

		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNormal.setBounds(260, 30, 85, 21);
		pnlRoomData.add(rdbtnNormal);

		JRadioButton rdbtnVIP = new JRadioButton("VIP");
		rdbtnVIP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnVIP.setBounds(342, 30, 56, 21);
		pnlRoomData.add(rdbtnVIP);

		ButtonGroup btnGroupRoomType = new ButtonGroup();
		btnGroupRoomType.add(rdbtnEconomy);
		btnGroupRoomType.add(rdbtnNormal);
		btnGroupRoomType.add(rdbtnVIP);

		JLabel lblRoomCapacity = new JLabel("Room Capacity");
		lblRoomCapacity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRoomCapacity.setBounds(20, 70, 159, 25);
		pnlRoomData.add(lblRoomCapacity);

		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSingle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnSingle.setBounds(163, 70, 70, 21);
		pnlRoomData.add(rdbtnSingle);

		JRadioButton rdbtnDouble = new JRadioButton("Double");
		rdbtnDouble.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDouble.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnDouble.setBounds(255, 70, 85, 21);
		pnlRoomData.add(rdbtnDouble);

		JRadioButton rdbtnTriple = new JRadioButton("Triple");
		rdbtnTriple.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTriple.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnTriple.setBounds(340, 70, 70, 21);
		pnlRoomData.add(rdbtnTriple);

		ButtonGroup btnGroupRoomCapacity = new ButtonGroup();
		btnGroupRoomCapacity.add(rdbtnSingle);
		btnGroupRoomCapacity.add(rdbtnDouble);
		btnGroupRoomCapacity.add(rdbtnTriple);

		JLabel lblCheckInDate = new JLabel("Check in date");
		lblCheckInDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheckInDate.setBounds(20, 120, 159, 25);
		pnlRoomData.add(lblCheckInDate);

		txtCheckInDate = new JTextField();
		txtCheckInDate.setBounds(175, 120, 200, 30);
		pnlRoomData.add(txtCheckInDate);

		JLabel lblCheckOutDate = new JLabel("Check out date");
		lblCheckOutDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheckOutDate.setBounds(20, 170, 160, 25);
		pnlRoomData.add(lblCheckOutDate);

		txtCheckOutDate = new JTextField();
		txtCheckOutDate.setBounds(175, 170, 200, 30);
		pnlRoomData.add(txtCheckOutDate);

		JLabel lblRoomID = new JLabel("Room ID:");
		lblRoomID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRoomID.setBounds(20, 220, 96, 25);
		pnlRoomData.add(lblRoomID);

		txtRoomID = new JTextField();
		txtRoomID.setColumns(10);
		txtRoomID.setBounds(112, 220, 100, 30);
		pnlRoomData.add(txtRoomID);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(0, 191, 255));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(300, 220, 100, 35);
		pnlRoomData.add(btnSearch);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(State.yes_button);
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
		btnCenter.setText("Check Out");
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel pnlCheckOut = new JPanel();
		pnlCheckOut.setLayout(null);
		pnlCheckOut.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlCheckOut.setBounds(250, 160, 450, 230);
		panel.add(pnlCheckOut);

		JLabel lblRoomNumber = new JLabel("Room number");
		lblRoomNumber.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblRoomNumber.setBounds(30, 70, 140, 70);
		pnlCheckOut.add(lblRoomNumber);
		txtRoomNumber = new JTextField("Room number");
		txtRoomNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == txtRoomNumber) {
					txtRoomNumber.setText("");
				}
			}
		});
		txtRoomNumber.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtRoomNumber.setBounds(210, 95, 235, 30);
		pnlCheckOut.add(txtRoomNumber);
		txtRoomNumber.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(State.no_button);
		btnClear.setFont(new Font("Serif", Font.PLAIN, 20));
		btnClear.setBounds(200, 170, 110, 35);
		btnClear.setFocusable(false);
		pnlCheckOut.add(btnClear);

		JButton btnCheckout = new JButton("Check out");
		btnCheckout.setBackground(new Color(220, 20, 60));
		btnCheckout.setFont(new Font("Serif", Font.PLAIN, 20));
		btnCheckout.setBounds(315, 170, 120, 35);
		btnCheckout.setFocusable(false);
		pnlCheckOut.add(btnCheckout);
		txtRoomNumber.addMouseListener(new MouseAdapter() {
		});

		return panel;
	}

	public JPanel GuestTablePanel() {
		btnCenter.setText("Guest");
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);

		tableGuest = new JTable();
		tableGuest.setFont(new Font("Time New Roman", Font.BOLD, 11));
		tableGuest.setLocation(5, 55);
		tableGuest.setSize(950, 490);
		panel.add(tableGuest);
		tableGuest.setModel(new DefaultTableModel(
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
		btnCenter.setText("Room");
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		tableRooms = new JTable();
		tableRooms.setFont(new Font("Time New Roman", Font.BOLD, 11));
		tableRooms.setBounds(5, 50, 950, 490);
		panel.add(tableRooms);
		tableRooms
				.setModel(new DefaultTableModel(
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

		frame.getContentPane().setBackground(State.background);

		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);

		btnCenter = new JButton("null");
		btnCenter.setFont(new Font("Serif", Font.BOLD, 30));
		btnCenter.setBounds(510, 65, 200, 70);
		btnCenter.setFocusable(false);
		btnCenter.setBackground(new Color(135, 206, 250));
		frame.getContentPane().add(btnCenter);


		JPanel pnlTop = new JPanel();
		pnlTop.setLayout(null);
		pnlTop.setBackground(State.background);
		pnlTop.setBounds(10, 10, 1165, 90);
		frame.getContentPane().add(pnlTop);


		JPanel pnlLeft = new JPanel();
		pnlLeft.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnlLeft.setBackground(new Color(135, 206, 250));
		pnlLeft.setBounds(10, 100, 200, 550);
		frame.getContentPane().add(pnlLeft);


		JPanel pnlAccount = new JPanel();
		pnlAccount.setBounds(960, 10, 170, 60);
		pnlAccount.setBackground(State.background);
		pnlTop.add(pnlAccount);
		pnlAccount.setLayout(null);


		JLabel lblAvtCus = new JLabel("");
		lblAvtCus.setIcon(new ImageIcon(HomePage2.class.getResource("/libs/iconHuman.png")));
		lblAvtCus.setBounds(0, 0, 42, 50);
		pnlAccount.add(lblAvtCus);

		JLabel lblNameCus = new JLabel("KH1");
		lblNameCus.setForeground(Color.WHITE);
		lblNameCus.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameCus.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNameCus.setBounds(52, 0, 108, 24);
		pnlAccount.add(lblNameCus);

		JButton btnLogOut = new JButton("<html><u>Log Out</u></html>");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBounds(62, 27, 89, 23);
		btnLogOut.setFocusable(false);
		pnlAccount.add(btnLogOut);
		btnLogOut.setBackground(State.background);
		pnlTop.add(pnlAccount);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(HomePage2.class.getResource("/libs/logo-small.png")));
		lblLogo.setBounds(23, -22, 100, 112);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(106, 24, 137, 48);
		pnlTop.add(lblGroup17);

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

		pnlLeft.setLayout(null);
		pnlLeft.add(btnCheckIn);
		pnlLeft.add(btnCheckOut);
		pnlLeft.add(btnRooms);
		pnlLeft.add(btnGuest);

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
//					btnCenter.setText(btnGuest.getText());
					frame.getContentPane().add(GuestTablePanel());
				}
				if (e.getSource() == btnRooms) {
//					btnCenter.setText(btnRooms.getText());
					frame.getContentPane().add(RoomTablePanel());
				}
				if (e.getSource() == btnCheckIn) {
//					btnCenter.setText(btnCheckIn.getText());
					frame.getContentPane().add(CheckInPanel());
				}
				if (e.getSource() == btnCheckOut) {
//					btnCenter.setText(btnCheckOut.getText());
					frame.getContentPane().add(CheckOutPanel());
				}
				frame.repaint();
			}
		};
	}
}
