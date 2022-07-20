package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.Controller;
import model.CheckIn;
import model.HotelManager;
import model.Observable;
import model.Observer;
import model.Room;

import java.awt.Font;
import java.awt.SystemColor;

public class Bill extends JFrame implements Observer {
	HomePage2 homePage2;
	private Observable hotelObs;
	private Controller controller;

	private JFrame frame;
	private JTextField name_TextField;

	// dinh dang lai cho nay di, nhin no kho chiu lam
	private JLabel roomType_label, roomCapacity_label, checkInDate_label, checkOutDate_label, roomID_label,
			numberOfNights_label, nightCost_label, totalPrice_label, name_label;
	private JButton btn_Cancel, btn_Pay;
	private JTextField phone_TextField, mail_TextField, addRess_TextField, city_TextField, nationality_TextField,
			passport_textField, cvcCode_textField, cardNumber_textField;
	private JTextField[] arr = { phone_TextField, mail_TextField, addRess_TextField, city_TextField,
			nationality_TextField, passport_textField, cvcCode_textField, cardNumber_textField };
	// *

	// nho khai bao cac bien can thiet thanh bien toan cuc
	JButton button_RoomData;

	public Bill(Observable hotelObs, Controller controller, HomePage2 homePage2) {
		this.hotelObs = hotelObs;
		this.controller = controller;
		this.homePage2 = homePage2;
		// add obs
		hotelObs.addObs(this);

		init();
		update();
		// addActionListener
		actionListener();

	}

	private void actionListener() {
		// ======
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btn_Cancel)) {
					setVisible(false);
				}
			}
		});
		// ======
		button_RoomData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(button_RoomData)) {
					setVisible(false);
				}
			}
		});
		btn_Pay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(btn_Pay)) {
					controller.paid(roomID_label.getText());
//					roomID_label.getText()
					JOptionPane.showMessageDialog(null, "Complete.");

				}
			}
		});

	}

	private void init() {
		setResizable(false);
//		setUndecorated(true);
		setBounds(500, 10, 745, 635);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel_main = new JPanel();
		getContentPane().add(panel_main, BorderLayout.CENTER);
		panel_main.setLayout(null);

		JPanel panel_Price = new JPanel();
		panel_Price.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_Price.setBounds(459, 367, 272, 147);
		panel_main.add(panel_Price);
		panel_Price.setLayout(null);

		JLabel labelName_6_11 = new JLabel("Number of nights:");
		labelName_6_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_11.setBounds(22, 26, 123, 22);
		panel_Price.add(labelName_6_11);

		JLabel labelName_6_12 = new JLabel("Night cost:");
		labelName_6_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_12.setBounds(22, 55, 75, 22);
		panel_Price.add(labelName_6_12);

		JLabel labelName_6_13 = new JLabel("Total price:");
		labelName_6_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_13.setBounds(22, 110, 123, 22);
		panel_Price.add(labelName_6_13);

		numberOfNights_label = new JLabel("1");
		numberOfNights_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numberOfNights_label.setBounds(155, 26, 34, 22);
		panel_Price.add(numberOfNights_label);

		nightCost_label = new JLabel("100");
		nightCost_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nightCost_label.setBounds(155, 55, 50, 22);
		panel_Price.add(nightCost_label);

		totalPrice_label = new JLabel("100");
		totalPrice_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		totalPrice_label.setBounds(155, 110, 50, 22);
		panel_Price.add(totalPrice_label);

		JLabel totalPrice_label_1_1 = new JLabel("$");
		totalPrice_label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		totalPrice_label_1_1.setBounds(146, 110, 21, 22);
		panel_Price.add(totalPrice_label_1_1);

		JLabel totalPrice_label_1_1_1 = new JLabel("$");
		totalPrice_label_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		totalPrice_label_1_1_1.setBounds(146, 55, 21, 22);
		panel_Price.add(totalPrice_label_1_1_1);

		btn_Cancel = new JButton("Cancel");
		btn_Cancel.setBackground(State.clear_button);
		btn_Cancel.setFocusable(false);

		btn_Cancel.setBounds(485, 537, 100, 35);
		panel_main.add(btn_Cancel);

		btn_Pay = new JButton("Pay");
		btn_Pay.setBackground(State.green_button);
		btn_Pay.setFocusable(false);

		btn_Pay.setBounds(603, 537, 100, 35);
		panel_main.add(btn_Pay);

		button_RoomData = new JButton("Room Data");
		button_RoomData.setFocusable(false);
		button_RoomData.setEnabled(false);
		button_RoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		button_RoomData.setBounds(541, 125, 100, 30);
		panel_main.add(button_RoomData);

		JPanel panel_RoomData = new JPanel();
		panel_RoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_RoomData.setBounds(459, 133, 272, 224);
		panel_main.add(panel_RoomData);
		panel_RoomData.setLayout(null);

		JLabel labelName_6_2 = new JLabel("Room type:");
		labelName_6_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_2.setBounds(10, 58, 109, 22);
		panel_RoomData.add(labelName_6_2);

		JLabel labelName_6_3 = new JLabel("Room capacity:");
		labelName_6_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_3.setBounds(10, 90, 109, 22);
		panel_RoomData.add(labelName_6_3);

		JLabel labelName_6_4 = new JLabel("Check in date:");
		labelName_6_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_4.setBounds(10, 125, 109, 22);
		panel_RoomData.add(labelName_6_4);

		JLabel labelName_6_5 = new JLabel("Check out date:");
		labelName_6_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_5.setBounds(10, 157, 109, 22);
		panel_RoomData.add(labelName_6_5);

		roomType_label = new JLabel("type");
		roomType_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		roomType_label.setBounds(131, 58, 126, 22);
		panel_RoomData.add(roomType_label);

		roomCapacity_label = new JLabel("capacity");
		roomCapacity_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		roomCapacity_label.setBounds(129, 90, 128, 22);
		panel_RoomData.add(roomCapacity_label);

		checkInDate_label = new JLabel("dd/mm/yyyy");
		checkInDate_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkInDate_label.setBounds(131, 125, 126, 22);
		panel_RoomData.add(checkInDate_label);

		checkOutDate_label = new JLabel("dd/mm/yyyy");
		checkOutDate_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkOutDate_label.setBounds(129, 157, 128, 22);
		panel_RoomData.add(checkOutDate_label);

		JLabel labelName_6_10 = new JLabel("Room ID:");
		labelName_6_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_10.setBounds(39, 192, 88, 22);
		panel_RoomData.add(labelName_6_10);

		roomID_label = new JLabel("01");
		roomID_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		roomID_label.setBounds(139, 192, 48, 22);
		panel_RoomData.add(roomID_label);

		name_label = new JLabel("name");
		name_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name_label.setBounds(131, 26, 126, 22);
		panel_RoomData.add(name_label);

		JLabel labelName_6_2_1 = new JLabel("Room name:");
		labelName_6_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_2_1.setBounds(10, 26, 109, 22);
		panel_RoomData.add(labelName_6_2_1);

		JButton button_Confirm = new JButton("Bill");
		button_Confirm.setFont(new Font("Serif", Font.BOLD, 25));
		button_Confirm.setBounds(272, 58, 200, 70);
		panel_main.add(button_Confirm);
		button_Confirm.setFocusable(false);
		button_Confirm.setBackground(new Color(135, 206, 250));

		JPanel top_panel = new JPanel();
		top_panel.setBackground(State.background);
		top_panel.setBorder(null);
		top_panel.setBounds(0, 0, 745, 90);
		panel_main.add(top_panel);
		top_panel.setLayout(null);

		JLabel label_logo = new JLabel("");
		label_logo.setIcon(State.logo_small);
		label_logo.setBounds(23, -22, 100, 112);
		top_panel.add(label_logo);

		JLabel label_group17 = new JLabel("GROUP 17");
		label_group17.setForeground(Color.WHITE);
		label_group17.setFont(new Font("Serif", Font.BOLD, 18));
		label_group17.setBounds(106, 24, 137, 48);
		top_panel.add(label_group17);

		JButton button_PersonalData = new JButton("Personal Data");
		button_PersonalData.setFocusable(false);
		button_PersonalData.setEnabled(false);
		button_PersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_main.add(button_PersonalData);

		JPanel panel_PersonalData = new JPanel();
		panel_PersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_PersonalData.setBounds(1, 136, 438, 453);
		panel_main.add(panel_PersonalData);
		panel_PersonalData.setLayout(null);

		JLabel labelName = new JLabel("Name");
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName.setBounds(10, 38, 48, 22);
		panel_PersonalData.add(labelName);

		name_TextField = new JTextField();
		name_TextField.setBounds(98, 32, 330, 30);
		panel_PersonalData.add(name_TextField);
		name_TextField.setColumns(10);

		JLabel labelName_1 = new JLabel("Phone");
		labelName_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_1.setBounds(10, 79, 48, 22);
		panel_PersonalData.add(labelName_1);

		JLabel labelName_2 = new JLabel("Email");
		labelName_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_2.setBounds(10, 119, 48, 22);
		panel_PersonalData.add(labelName_2);

		JLabel labelName_3 = new JLabel("Adress");
		labelName_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_3.setBounds(10, 159, 48, 22);
		panel_PersonalData.add(labelName_3);

		JLabel labelName_4 = new JLabel("City");
		labelName_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_4.setBounds(10, 198, 48, 22);
		panel_PersonalData.add(labelName_4);

		JLabel labelName_5 = new JLabel("Nationality");
		labelName_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_5.setBounds(10, 238, 70, 22);
		panel_PersonalData.add(labelName_5);

		JLabel labelName_7 = new JLabel("Card Number");
		labelName_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelName_7.setBounds(10, 398, 90, 31);
		panel_PersonalData.add(labelName_7);

		JLabel labelName_8 = new JLabel("CVC Code");
		labelName_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_8.setBounds(10, 359, 70, 29);
		panel_PersonalData.add(labelName_8);

		JLabel labelName_6_1 = new JLabel("Credit Card Information:");
		labelName_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_6_1.setBounds(20, 320, 175, 22);
		panel_PersonalData.add(labelName_6_1);

		JLabel labelName_7_1 = new JLabel("Passport No");
		labelName_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName_7_1.setBounds(10, 272, 76, 31);
		panel_PersonalData.add(labelName_7_1);

		phone_TextField = new JTextField();
		phone_TextField.setColumns(10);
		phone_TextField.setBounds(98, 72, 330, 30);
		panel_PersonalData.add(phone_TextField);

		mail_TextField = new JTextField();
		mail_TextField.setColumns(10);
		mail_TextField.setBounds(98, 112, 330, 30);
		panel_PersonalData.add(mail_TextField);

		addRess_TextField = new JTextField();
		addRess_TextField.setColumns(10);
		addRess_TextField.setBounds(98, 152, 330, 30);
		panel_PersonalData.add(addRess_TextField);

		city_TextField = new JTextField();
		city_TextField.setColumns(10);
		city_TextField.setBounds(98, 192, 330, 30);
		panel_PersonalData.add(city_TextField);

		nationality_TextField = new JTextField();
		nationality_TextField.setColumns(10);
		nationality_TextField.setBounds(98, 232, 330, 30);
		panel_PersonalData.add(nationality_TextField);

		passport_textField = new JTextField();
		passport_textField.setColumns(10);
		passport_textField.setBounds(98, 272, 330, 30);
		panel_PersonalData.add(passport_textField);

		cvcCode_textField = new JTextField();
		cvcCode_textField.setColumns(10);
		cvcCode_textField.setBounds(98, 355, 330, 30);
		panel_PersonalData.add(cvcCode_textField);

		cardNumber_textField = new JTextField();
		cardNumber_textField.setColumns(10);
		cardNumber_textField.setBounds(98, 395, 330, 30);
		panel_PersonalData.add(cardNumber_textField);

		button_PersonalData.setBounds(169, 125, 100, 30);

		// logo action
		label_group17.addMouseListener(State.retureHomePage(label_group17, this, homePage2.homePage));
		label_logo.addMouseListener(State.retureHomePage(label_logo, this, homePage2.homePage));

	}

	public void data() {
		HotelManager manager = (HotelManager) hotelObs;
		CheckIn checkIn = manager.getCheckIn();
		name_TextField.setText(checkIn.getPersonalData().getName());
		phone_TextField.setText(checkIn.getPersonalData().getPhone());
		mail_TextField.setText(checkIn.getPersonalData().getEmail());
		addRess_TextField.setText(checkIn.getPersonalData().getAddress());
		city_TextField.setText(checkIn.getPersonalData().getCity());
		nationality_TextField.setText(checkIn.getPersonalData().getNationality());
		passport_textField.setText(checkIn.getPersonalData().getPassportNo());
		cvcCode_textField.setText(checkIn.getPayment().getCVC_Code());
		cardNumber_textField.setText(checkIn.getPayment().getCardNumber());
		name_label.setText(checkIn.getRoom().getName());
		Room room = (Room) checkIn.getRoom();
		roomType_label.setText(room.getType().getName());
		roomCapacity_label.setText(room.getCapacity() + "");
		checkInDate_label.setText(checkIn.getCheckInDate().getDate() + "/" + checkIn.getCheckInDate().getMonth() + "/"
				+ checkIn.getCheckInDate().getYear());
		checkOutDate_label.setText(checkIn.getCheckOutDate().getDate() + "/" + checkIn.getCheckOutDate().getMonth()
				+ "/" + checkIn.getCheckOutDate().getYear());
		roomID_label.setText(checkIn.getRoom().getId());
		numberOfNights_label.setText(checkIn.getDateBetweenTwoDate() + "");
		nightCost_label.setText(room.getCost() + "");
		totalPrice_label.setText(checkIn.getCost() + "");
	}

	@Override
	public void update() {
		// viet update o day
		data();
	}
}
