package windowBuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Confirmtation {

	private JFrame frame;
	private JTextField name_TextField;
	private JTextField phone_textField;
	private JTextField email_textField;
	private JTextField address_textField;
	private JTextField city_TextField;
	private JTextField Nationality_textField;
	private JTextField passport_textField;
	private JTextField cardNumber_textField;
	private JTextField cvcCode_textField;
	private JLabel roomType_label, roomCapacity_label, checkInDate_label, checkOutDate, roomID_label,
			numberOfNights_label, nightCost_label, totalPrice_label;
	private JButton btnCancel, btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirmtation window = new Confirmtation();
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
	public Confirmtation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 10, 960, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panelPrice = new JPanel();
		panelPrice.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelPrice.setBounds(507, 329, 415, 123);
		panel.add(panelPrice);
		panelPrice.setLayout(null);

		JLabel labelName_6_11 = new JLabel("Number of nights:");
		labelName_6_11.setBounds(22, 26, 101, 22);
		panelPrice.add(labelName_6_11);

		JLabel labelName_6_12 = new JLabel("Night cost:");
		labelName_6_12.setBounds(22, 58, 87, 22);
		panelPrice.add(labelName_6_12);

		JLabel labelName_6_13 = new JLabel("Total price:");
		labelName_6_13.setBounds(22, 90, 87, 22);
		panelPrice.add(labelName_6_13);

		numberOfNights_label = new JLabel("Name");
		numberOfNights_label.setBounds(144, 26, 164, 22);
		panelPrice.add(numberOfNights_label);

		nightCost_label = new JLabel("Name");
		nightCost_label.setBounds(144, 58, 164, 22);
		panelPrice.add(nightCost_label);

		totalPrice_label = new JLabel("Name");
		totalPrice_label.setBounds(144, 90, 164, 22);
		panelPrice.add(totalPrice_label);

		btnCancel = new JButton("Cancel");
		btnCancel.setFocusable(false);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(742, 482, 85, 21);
		panel.add(btnCancel);

		btnSave = new JButton("Save");
		btnSave.setBackground(Color.GREEN);
		btnSave.setFocusable(false);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(837, 482, 85, 21);
		panel.add(btnSave);

		JButton button_RoomData = new JButton("Room Data");
		button_RoomData.setFocusable(false);
		button_RoomData.setEnabled(false);
		button_RoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		button_RoomData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_RoomData.setBounds(646, 125, 100, 30);
		panel.add(button_RoomData);

		JPanel panelRoomData = new JPanel();
		panelRoomData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelRoomData.setBounds(507, 136, 415, 183);
		panel.add(panelRoomData);
		panelRoomData.setLayout(null);

		JLabel labelName_6_2 = new JLabel("Room type:");
		labelName_6_2.setBounds(24, 29, 95, 22);
		panelRoomData.add(labelName_6_2);

		JLabel labelName_6_3 = new JLabel("Room capacity:");
		labelName_6_3.setBounds(24, 61, 95, 22);
		panelRoomData.add(labelName_6_3);

		JLabel labelName_6_4 = new JLabel("Check in date:");
		labelName_6_4.setBounds(24, 96, 95, 22);
		panelRoomData.add(labelName_6_4);

		JLabel labelName_6_5 = new JLabel("Check out date:");
		labelName_6_5.setBounds(24, 128, 95, 22);
		panelRoomData.add(labelName_6_5);

		roomType_label = new JLabel("type");
		roomType_label.setBounds(131, 29, 198, 22);
		panelRoomData.add(roomType_label);

		roomCapacity_label = new JLabel("capacity");
		roomCapacity_label.setBounds(129, 61, 200, 22);
		panelRoomData.add(roomCapacity_label);

		checkInDate_label = new JLabel("dd/mm/yyyy");
		checkInDate_label.setBounds(131, 96, 198, 22);
		panelRoomData.add(checkInDate_label);

		checkOutDate = new JLabel("dd/mm/yyyy");
		checkOutDate.setBounds(129, 128, 200, 22);
		panelRoomData.add(checkOutDate);

		JLabel labelName_6_10 = new JLabel("Room ID:");
		labelName_6_10.setBounds(129, 156, 61, 22);
		panelRoomData.add(labelName_6_10);

		roomID_label = new JLabel("01");
		roomID_label.setBounds(200, 156, 48, 22);
		panelRoomData.add(roomID_label);

		JButton button_Confirm = new JButton("Confirmtation");
		button_Confirm.setFocusable(false);

		button_Confirm.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		button_Confirm.setBackground(new Color(135, 206, 250));
		button_Confirm.setBounds(305, 48, 306, 55);
		panel.add(button_Confirm);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBorder(null);
		panel_1.setBounds(1, 0, 945, 82);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JButton button_PersonalData = new JButton("Personal Data");
		button_PersonalData.setFocusable(false);
		button_PersonalData.setEnabled(false);
		button_PersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		button_PersonalData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_PersonalData.setBounds(183, 125, 100, 30);
		panel.add(button_PersonalData);

		JPanel panel_PersonalData = new JPanel();
		panel_PersonalData.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_PersonalData.setBounds(1, 136, 491, 367);
		panel.add(panel_PersonalData);
		panel_PersonalData.setLayout(null);

		JLabel labelName = new JLabel("Name");
		labelName.setBounds(10, 30, 48, 22);
		panel_PersonalData.add(labelName);

		name_TextField = new JTextField();
		name_TextField.setText("Name A");
		name_TextField.setBounds(90, 32, 360, 20);
		panel_PersonalData.add(name_TextField);
		name_TextField.setColumns(10);

		phone_textField = new JTextField();
		phone_textField.setText("0123456");
		phone_textField.setColumns(10);
		phone_textField.setBounds(90, 62, 360, 20);
		panel_PersonalData.add(phone_textField);

		JLabel labelName_1 = new JLabel("Phone");
		labelName_1.setBounds(10, 60, 48, 22);
		panel_PersonalData.add(labelName_1);

		email_textField = new JTextField();
		email_textField.setText("abc@gmail.com");
		email_textField.setColumns(10);
		email_textField.setBounds(90, 94, 360, 20);
		panel_PersonalData.add(email_textField);

		JLabel labelName_2 = new JLabel("Email");
		labelName_2.setBounds(10, 92, 48, 22);
		panel_PersonalData.add(labelName_2);

		address_textField = new JTextField();
		address_textField.setText("23/A/B/C");
		address_textField.setColumns(10);
		address_textField.setBounds(90, 124, 360, 30);
		panel_PersonalData.add(address_textField);

		JLabel labelName_3 = new JLabel("Adress");
		labelName_3.setBounds(10, 127, 48, 22);
		panel_PersonalData.add(labelName_3);

		city_TextField = new JTextField();
		city_TextField.setText("ABC");
		city_TextField.setColumns(10);
		city_TextField.setBounds(90, 164, 360, 20);
		panel_PersonalData.add(city_TextField);

		JLabel labelName_4 = new JLabel("City");
		labelName_4.setBounds(10, 162, 48, 22);
		panel_PersonalData.add(labelName_4);

		Nationality_textField = new JTextField();
		Nationality_textField.setText("abc");
		Nationality_textField.setColumns(10);
		Nationality_textField.setBounds(90, 197, 360, 20);
		panel_PersonalData.add(Nationality_textField);

		JLabel labelName_5 = new JLabel("Nationality");
		labelName_5.setBounds(10, 195, 70, 22);
		panel_PersonalData.add(labelName_5);

		passport_textField = new JTextField();
		passport_textField.setText("123");
		passport_textField.setColumns(10);
		passport_textField.setBounds(90, 227, 360, 20);
		panel_PersonalData.add(passport_textField);

		JLabel labelName_6 = new JLabel("Passport No");
		labelName_6.setBounds(10, 225, 70, 22);
		panel_PersonalData.add(labelName_6);

		cardNumber_textField = new JTextField();
		cardNumber_textField.setText("147");
		cardNumber_textField.setColumns(10);
		cardNumber_textField.setBounds(90, 282, 360, 20);
		panel_PersonalData.add(cardNumber_textField);

		JLabel labelName_7 = new JLabel("Card Number");
		labelName_7.setBounds(10, 276, 85, 31);
		panel_PersonalData.add(labelName_7);

		cvcCode_textField = new JTextField();
		cvcCode_textField.setText("123");
		cvcCode_textField.setColumns(10);
		cvcCode_textField.setBounds(90, 312, 360, 20);
		panel_PersonalData.add(cvcCode_textField);

		JLabel labelName_8 = new JLabel("CVC Code");
		labelName_8.setBounds(10, 307, 215, 29);
		panel_PersonalData.add(labelName_8);

		JLabel labelName_6_1 = new JLabel("Credit Card Information:");
		labelName_6_1.setBounds(20, 250, 175, 22);
		
		panel_PersonalData.add(labelName_6_1);
		button_Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}
}
