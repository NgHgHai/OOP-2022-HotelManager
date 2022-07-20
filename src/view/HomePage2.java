package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField.AbstractFormatter;
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

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;

import controller.Controller;
import model.ARoom;
import model.CheckIn;
import model.HotelManager;
import model.Observable;
import model.Observer;
import model.Room;

public class HomePage2 extends JFrame implements Observer {
	HomePage homePage;
	Observable hotelObs;// model
	Controller controller;

	private JTable tableGuest, tableRooms;
	private JTextField txtCardNumber;
	private JTextField txtCVCCode;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtPassportNo;
	private JTextField txtCity;
	private JTextField txtNationality;
	private JTextField txtRoomID;
	private JTextField txtRoomNumber;

	JDatePanelImpl panelDate;
	JDatePanelImpl panelDate1;

	JPanel panel;
	private int roomCapacity;

	private JLabel lblCity;
	private Date checkInDate;
	private Date checkOutDate;
	private String roomType;
	private String nameUser = "";
	private String roomId = "";

	// nho khai bao cac bien can thiet thanh bien toan cuc
	JButton btnGuest;
	JButton btnClear = new JButton("Clear");
	JButton btnRooms;
	JButton btnLogOut;
	JButton btnCheckOut;
	JButton btnSearch = new JButton("Search");
	JButton btnSubmit = new JButton("Submit");
	JButton btnCheckOut_command = new JButton("Check out");
	JButton btnCheckIn;// ?

	String currentPanel = ""; // 1= checkInPanel , 2 =CheckOutPanel, 3= guestTablePanel, 4= roomTablePanel
	private String commandToChoosePanel;

	ArrayList<CheckIn> listCheckIn = new ArrayList<>();
	ArrayList<ARoom> listRoom = new ArrayList<>();

	public HomePage2(String commandToChoosePanel, Observable hotelObs, Controller controller, HomePage homePage) {
		this.hotelObs = hotelObs;
		this.controller = controller;
		hotelObs.addObs(this);
		this.homePage = homePage;
		this.commandToChoosePanel = commandToChoosePanel;
		update();
		init();
		// addActionListener
		actionListener(this);
	}

	public void setCommandToChoosePanel(String s) {
		remove(panel);
		this.commandToChoosePanel = s;
		init();
	}

	private void init() {
		getContentPane().setBackground(State.background);
		setBounds(100, 100, 1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		setVisible(true);

		JPanel pnlTop = new JPanel();
		pnlTop.setLayout(null);
		pnlTop.setBackground(State.background);
		pnlTop.setBounds(10, 10, 1165, 90);
		getContentPane().add(pnlTop);

		JPanel pnlLeft = new JPanel();
		pnlLeft.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnlLeft.setBackground(new Color(135, 206, 250));
		pnlLeft.setBounds(10, 100, 200, 550);
		getContentPane().add(pnlLeft);

		JPanel pnlAccount = new JPanel();
		pnlAccount.setBounds(960, 10, 170, 60);
		pnlAccount.setBackground(State.background);
		pnlTop.add(pnlAccount);
		pnlAccount.setLayout(null);

		JLabel lblAvtCus = new JLabel("");
		lblAvtCus.setIcon(new ImageIcon("libs/iconHuman.png"));
		lblAvtCus.setBounds(0, 0, 42, 50);
		pnlAccount.add(lblAvtCus);

		JLabel lblNameCus = new JLabel(nameUser);
		lblNameCus.setForeground(Color.WHITE);
		lblNameCus.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameCus.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNameCus.setBounds(52, 0, 108, 24);
		pnlAccount.add(lblNameCus);

		btnLogOut = new JButton("<html><u>Log Out</u></html>");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBounds(62, 27, 89, 23);
		btnLogOut.setFocusable(false);
		pnlAccount.add(btnLogOut);
		btnLogOut.setBackground(State.background);
		pnlTop.add(pnlAccount);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(State.logo_small);
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

		btnCheckOut = new JButton("Check Out");
		btnCheckOut.setBackground(new Color(176, 224, 230));
		btnCheckOut.setBounds(10, 178, 180, 71);
		btnCheckOut.setBackground(new Color(175, 238, 238));
		btnCheckOut.setFont(new Font("Serif", Font.PLAIN, 30));
		btnCheckOut.setFocusable(false);

		btnRooms = new JButton("Rooms");
		btnRooms.setBounds(10, 298, 180, 76);
		btnRooms.setBackground(new Color(175, 238, 238));
		btnRooms.setFont(new Font("Serif", Font.PLAIN, 30));
		btnRooms.setFocusable(false);

		btnGuest = new JButton("Guest");
		btnGuest.setBounds(10, 418, 180, 76);
		btnGuest.setBackground(new Color(175, 238, 238));
		btnGuest.setFont(new Font("Serif", Font.PLAIN, 30));
		btnGuest.setFocusable(false);

		pnlLeft.setLayout(null);
		pnlLeft.add(btnCheckIn);
		pnlLeft.add(btnCheckOut);
		pnlLeft.add(btnRooms);
		pnlLeft.add(btnGuest);
		// logo action
		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this, homePage));
		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this, homePage));

		if ("checkIn".equals(commandToChoosePanel)) {
			createCheckInPanel();
		}
		if ("checkOut".equals(commandToChoosePanel)) {
			createCheckOutPanel();
		}
		if ("room".equals(commandToChoosePanel)) {
			createRoomTablePanel();
		}
		if ("guest".equals(commandToChoosePanel)) {
			createGuestTablePanel();
		}

//		------------------------------

	}

	public JPanel createCheckInPanel() {
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		getContentPane().add(panel);
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
		rdbtnEconomy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource().equals(rdbtnEconomy)) {
					roomType = rdbtnEconomy.getText();
				}
			}
		});
		pnlRoomData.add(rdbtnEconomy);

		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNormal.setBounds(260, 30, 85, 21);
		rdbtnNormal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource().equals(rdbtnNormal)) {
					roomType = rdbtnNormal.getText();
				}
			}
		});
		pnlRoomData.add(rdbtnNormal);

		JRadioButton rdbtnVIP = new JRadioButton("VIP");
		rdbtnVIP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnVIP.setBounds(342, 30, 56, 21);
		rdbtnVIP.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource().equals(rdbtnVIP)) {
					roomType = rdbtnVIP.getText();
				}
			}
		});
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
		rdbtnSingle.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource().equals(rdbtnSingle)) {
					roomCapacity = rdbtnSingle.getText().equals("Single") ? 1 : 0;

				}
			}
		});
		pnlRoomData.add(rdbtnSingle);

		JRadioButton rdbtnDouble = new JRadioButton("Double");
		rdbtnDouble.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDouble.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnDouble.setBounds(255, 70, 85, 21);
		rdbtnDouble.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource().equals(rdbtnDouble)) {
					roomCapacity = rdbtnDouble.getText().equals("Double") ? 2 : 0;

				}
			}
		});
		pnlRoomData.add(rdbtnDouble);

		JRadioButton rdbtnTriple = new JRadioButton("Triple");
		rdbtnTriple.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTriple.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnTriple.setBounds(340, 70, 70, 21);
		rdbtnTriple.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource().equals(rdbtnTriple)) {
					roomCapacity = rdbtnTriple.getText().equals("Triple") ? 3 : 0;
				}
			}
		});
		pnlRoomData.add(rdbtnTriple);

		ButtonGroup btnGroupRoomCapacity = new ButtonGroup();
		btnGroupRoomCapacity.add(rdbtnSingle);
		btnGroupRoomCapacity.add(rdbtnDouble);
		btnGroupRoomCapacity.add(rdbtnTriple);

		JLabel lblCheckInDate = new JLabel("Check in date");
		lblCheckInDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheckInDate.setBounds(20, 120, 159, 25);
		pnlRoomData.add(lblCheckInDate);

		JDatePickerImpl datePicker;
		SqlDateModel model = new SqlDateModel();
		Properties p = new Properties();
		model.setSelected(true);
		p.put("text.day", "Day");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl panle = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(panle, new AbstractFormatter() {

			@Override
			public String valueToString(Object value) throws ParseException {
				if (value != null) {
					Calendar ca1 = (Calendar) value;
					SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
					String strDate = format.format(ca1.getTime());
					checkInDate = ca1.getTime();
					return strDate;
				}
				return "Today:";
			}

			@Override
			public Object stringToValue(String text) throws ParseException {
				return "";
			}
		});
		datePicker.setBounds(175, 120, 200, 30);

		pnlRoomData.add(datePicker);
		pnlRoomData.setVisible(false);

		JLabel lblCheckOutDate = new JLabel("Check out date");
		lblCheckOutDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheckOutDate.setBounds(20, 170, 160, 25);
		pnlRoomData.add(lblCheckOutDate);

		JDatePickerImpl datePicker1;
		SqlDateModel model1 = new SqlDateModel();
		Properties p1 = new Properties();
		model1.setSelected(true);

		p1.put("text.day", "Day");
		p1.put("text.month", "Month");
		p1.put("text.year", "Year");
		JDatePanelImpl panle1 = new JDatePanelImpl(model1, p1);
		datePicker1 = new JDatePickerImpl(panle1, new AbstractFormatter() {

			@Override
			public String valueToString(Object value) throws ParseException {

				if (value != null) {
					Calendar ca2 = (Calendar) value;
					SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
					String strDate1 = format1.format(ca2.getTime());
					checkOutDate = ca2.getTime();
					return strDate1;
				}
				return "";
			}

			@Override
			public Object stringToValue(String text) throws ParseException {
				return "";
			}
		});
		datePicker1.setBounds(175, 170, 200, 30);

		pnlRoomData.add(datePicker1);
		pnlRoomData.setVisible(true);

		JLabel lblRoomID = new JLabel("Room ID:");
		lblRoomID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRoomID.setBounds(20, 220, 96, 25);
		pnlRoomData.add(lblRoomID);

		txtRoomID = new JTextField(roomId);
		txtRoomID.setColumns(10);
		txtRoomID.setBounds(112, 220, 100, 30);
		pnlRoomData.add(txtRoomID);
		txtRoomID.setEditable(false);

		btnSearch.setBackground(State.blue_button);
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(300, 220, 100, 35);
		pnlRoomData.add(btnSearch);

		// submit
		btnSubmit.setBackground(State.green_button);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubmit.setFocusable(false);
		btnSubmit.setBounds(820, 504, 100, 35);
		panel.add(btnSubmit);
		panle.setVisible(true);
		return panel;
	}

	public JPanel createCheckOutPanel() {
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel pnlCheckOut = new JPanel();
		pnlCheckOut.setLayout(null);
		pnlCheckOut.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlCheckOut.setBounds(250, 160, 450, 230);
		panel.add(pnlCheckOut);

		JLabel lblRoomNumber = new JLabel("Room ID");
		lblRoomNumber.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblRoomNumber.setBounds(30, 70, 140, 70);
		pnlCheckOut.add(lblRoomNumber);
		txtRoomNumber = new JTextField("Room ID");
		txtRoomNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource() == txtRoomNumber) {
					txtRoomNumber.setText("");
				}
			}
		});
		txtRoomNumber.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtRoomNumber.setBounds(200, 95, 235, 30);
		pnlCheckOut.add(txtRoomNumber);
		txtRoomNumber.setColumns(10);

		btnClear.setBackground(State.clear_button);
		btnClear.setFont(new Font("Serif", Font.PLAIN, 20));
		btnClear.setBounds(200, 170, 110, 35);
		btnClear.setFocusable(false);
		pnlCheckOut.add(btnClear);

		btnCheckOut_command.setBackground(State.red_button);
		btnCheckOut_command.setFont(new Font("Serif", Font.PLAIN, 20));
		btnCheckOut_command.setBounds(315, 170, 120, 35);
		btnCheckOut_command.setFocusable(false);

		pnlCheckOut.add(btnCheckOut_command);

//		txtRoomNumber.addMouseListener(new MouseAdapter() {
//		});

		return panel;
	}

	public JPanel createGuestTablePanel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(215, 100, 960, 550);
		getContentPane().add(panel);

		String[][] viewGuestList = new String[listCheckIn.size() + 1][10];
		viewGuestList[0][0] = "RoomID";
		viewGuestList[0][1] = "Name";
		viewGuestList[0][2] = "Email";
		viewGuestList[0][3] = "Address";
		viewGuestList[0][4] = "City";
		viewGuestList[0][5] = "Nationlity";
		viewGuestList[0][6] = "Passport";
		viewGuestList[0][7] = "Phone";
		viewGuestList[0][8] = "Days";
		viewGuestList[0][9] = "Fees";
		for (int i = 0; i < listCheckIn.size(); i++) {
//			if(!listCheckIn.get(i).isPay()) {

			viewGuestList[i + 1][0] = listCheckIn.get(i).getRoom().getId();
			viewGuestList[i + 1][1] = listCheckIn.get(i).getPersonalData().getName();
			viewGuestList[i + 1][2] = listCheckIn.get(i).getPersonalData().getEmail();
			viewGuestList[i + 1][3] = listCheckIn.get(i).getPersonalData().getAddress();
			viewGuestList[i + 1][4] = listCheckIn.get(i).getPersonalData().getCity();
			viewGuestList[i + 1][5] = listCheckIn.get(i).getPersonalData().getNationality();
			viewGuestList[i + 1][6] = listCheckIn.get(i).getPersonalData().getPassportNo();
			viewGuestList[i + 1][7] = listCheckIn.get(i).getPersonalData().getPhone();
			viewGuestList[i + 1][8] = listCheckIn.get(i).getDateBetweenTwoDate() + "";
			viewGuestList[i + 1][9] = listCheckIn.get(i).getCost() + "";
//			}

		}

		tableGuest = new JTable();
		tableGuest.setFont(new Font("Time New Roman", Font.BOLD, 11));
		tableGuest.setLocation(5, 55);
		tableGuest.setSize(950, 490);
		tableGuest.enable(false);
		panel.add(tableGuest);
		tableGuest.setModel(new DefaultTableModel(viewGuestList, new String[] { "RoomID", "Name", "Email", "New column",
				"New column", "New column", "Passport", "Phone", "Days", "Fees" }));

		return panel;
	}

	public JPanel createRoomTablePanel() {
		panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		getContentPane().add(panel);
		panel.setLayout(null);
//================================================

		String[][] viewRoomList = new String[listRoom.size() + 1][7];
		viewRoomList[0][0] = "Num";
		viewRoomList[0][1] = "RoomID";
		viewRoomList[0][2] = "Room Type";
		viewRoomList[0][3] = "Room Capacity";
		viewRoomList[0][4] = "Name";
		viewRoomList[0][5] = "State";
		viewRoomList[0][6] = "is Available?";
		for (int i = 0; i < listRoom.size(); i++) {
			Room room = (Room) listRoom.get(i);
			viewRoomList[i + 1][0] = i + 1 + "";
			viewRoomList[i + 1][1] = room.getId();
			viewRoomList[i + 1][2] = room.getType().getName();
			viewRoomList[i + 1][3] = room.getCapacity() + "";
			viewRoomList[i + 1][4] = room.getName();
			viewRoomList[i + 1][5] = room.getRoomState();
			viewRoomList[i + 1][6] = room.isAvailable() + "";

		}

		tableRooms = new JTable();
		tableRooms.setFont(new Font("Time New Roman", Font.BOLD, 11));
		tableRooms.setBounds(5, 50, 950, 490);
		tableRooms.enable(false);
		panel.add(tableRooms);
		tableRooms.setModel(new DefaultTableModel(viewRoomList,
				new String[] { "RoomID", "Room Type", "Room Capacity", "Name", "State", "is Available?", "" }));

		return panel;
	}

	private void actionListener(HomePage2 homePage2) {

		// addActionListener
		// search
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (controller.searchRoomChoose(roomType, roomCapacity).size() == 0) {
					JOptionPane.showMessageDialog(null, "Room does not exist");
				} else
					new ChooseRoom(hotelObs, controller, homePage2, roomType, roomCapacity);
			}
		});
		// logout
		btnLogOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame loginFrame = homePage.login;
				if (isVisible()) {
					setVisible(false);
				}
				loginFrame.setVisible(true);
				loginFrame.setLocationRelativeTo(null);
			}
		});
		// btnClear
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtPhone.setText("");
				txtEmail.setText("");
				txtAddress.setText("");
				txtCity.setText("");
				txtNationality.setText("");
				txtPassportNo.setText("");
				txtCardNumber.setText("");
				txtCVCCode.setText("");
				txtRoomNumber.setText("");
			}
		});

		// submit
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnSubmit)) {
					int output = JOptionPane.showConfirmDialog(null, "Save information ? ", "HomePage2",
							JOptionPane.YES_NO_OPTION);
					if (output == JOptionPane.YES_OPTION) {
						if (controller.saveCheckIn(txtName.getText(), txtPhone.getText(), txtEmail.getText(),
								txtAddress.getText(), txtCity.getText(), txtNationality.getText(),
								txtPassportNo.getText(), txtCardNumber.getText(), txtCVCCode.getText(), roomType,
								roomCapacity, checkInDate, checkOutDate, txtRoomID.getText())) {
							JOptionPane.showOptionDialog(null, "Check in success", "Congratulations",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {},
									null);
							setVisible(false);
							homePage.setVisible(true);
							homePage.setLocationRelativeTo(null);
						} else {
							JOptionPane.showMessageDialog(null, "Check in fail", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});
		// CheckOut
//		btnCheckOut_command.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JFrame confirmtationFrame = new Bill(hotelObs, controller, homePage2);
//				confirmtationFrame.setVisible(true);
//				confirmtationFrame.setLocationRelativeTo(null);
//			}
//		});
		btnCheckOut_command.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//
				if (controller.checkOut(txtRoomNumber.getText())) {
					JFrame bill = new Bill(hotelObs, controller, homePage2);
					bill.setVisible(true);
					bill.setLocationRelativeTo(null);
				} else {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});

		btnCheckIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!currentPanel.equals("1")) {
					remove(panel); // xoa panel cu
					createCheckInPanel();
					repaint();// ve lai
					currentPanel = "1";
				}
			}
		});
		btnCheckOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!currentPanel.equals("2")) {
					remove(panel); // xoa panel cu
					createCheckOutPanel();
					repaint();// ve lai
					currentPanel = "2";
				}
			}
		});

		btnGuest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (controller.getUser().hasRight("guest")) {
					if (!currentPanel.equals("3")) {
						remove(panel); // xoa panel cu
						createGuestTablePanel();
						repaint();// ve lai
						currentPanel = "3";
					}
				} else
					JOptionPane.showMessageDialog(null, "sorry, this place only allows admins");
			}
		});
		btnRooms.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!currentPanel.equals("4")) {
					remove(panel); // xoa panel cu
					createRoomTablePanel();
					repaint();// ve lai
					currentPanel = "4";
				}
			}
		});
	}

	// ======

	@Override
	public void update() {
		// viet update tai day
		HotelManager manager = (HotelManager) hotelObs;
		this.nameUser = manager.getNameUser();

		this.listCheckIn = manager.getCheckIns();
		// cac hoa don da tra roi thi khong hien thi nua
		for (int i = 0; i < listCheckIn.size(); i++) {
			if (listCheckIn.get(i).isPay()) {
				listCheckIn.remove(listCheckIn.get(i));
			}
		}

//		System.out.println(listCheckIn.size()+ "Size");
		this.listCheckIn.sort(new Comparator<CheckIn>() {

			@Override
			public int compare(CheckIn o1, CheckIn o2) {
				return o1.getRoom().getId().compareTo(o2.getRoom().getId());
			}
		});

		this.listRoom.removeAll(listRoom);
		this.listRoom.addAll(manager.getRooms());
		this.listRoom.sort(new Comparator<ARoom>() {

			@Override
			public int compare(ARoom o1, ARoom o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
	}

	public void setTxtRoomID(String roomId) {
		txtRoomID.setText(roomId);
	}

}
