package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Controller;
import model.Observable;

public class AddUser extends JFrame {
	Observable hotelObs;
	Setting setting;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JButton btnBack;
	private Controller controller;
	private JButton btnSave;
	private JCheckBox cbReceptionist;

	public AddUser(Observable hotelObs, Controller controller, Setting setting) {
		// add obs
		this.hotelObs = hotelObs;
		this.setting = setting;
		this.controller = controller;

		init();
		// addActionListener
		actionListener();
	}

	private void init() {
		setBounds(100, 100, 600, 600);
		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel pnlTop = new JPanel();
		pnlTop.setLayout(null);
		pnlTop.setBounds(10, 10, 564, 90);
		pnlTop.setBackground(State.background);
		getContentPane().add(pnlTop);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(State.logo_small);
		lblLogo.setBounds(173, -28, 128, 128);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(252, 38, 98, 27);
		pnlTop.add(lblGroup17);

		btnBack = new JButton("<Back");
		btnBack.setForeground(Color.WHITE);

		btnBack.setBounds(25, 10, 81, 27);
		btnBack.setBackground(State.background);
		btnBack.setFocusable(false);
		pnlTop.add(btnBack);

		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsername.setText("Enter new username");

		txtUsername.setBounds(107, 207, 415, 44);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtPassword.setText("Enter new password");
		txtPassword.setBounds(107, 296, 415, 44);

		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);

		JLabel lblIconUser = new JLabel("");
		lblIconUser.setIcon(new ImageIcon("libs/user.png"));
		lblIconUser.setBounds(54, 207, 46, 43);
		getContentPane().add(lblIconUser);

		JLabel lblIconKey = new JLabel("");
		lblIconKey.setIcon(new ImageIcon("libs/key.png"));
		lblIconKey.setBounds(65, 296, 35, 44);
		getContentPane().add(lblIconKey);

		btnSave = new JButton("SAVE");
		btnSave.setBackground(State.background);
		btnSave.setFocusable(false);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 23));

		btnSave.setBounds(223, 451, 134, 44);
		getContentPane().add(btnSave);

		cbReceptionist = new JCheckBox("Receptionist");
		cbReceptionist.setFont(new Font("Tahoma", Font.BOLD, 16));
		cbReceptionist.setBounds(223, 378, 142, 43);
		getContentPane().add(cbReceptionist);

		// text action
		txtUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == txtUsername) {
					txtUsername.setText("");
				}
			}
		});

		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == txtPassword) {
					txtPassword.setText("");
				}
			}
		});
		// logo action
		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this, setting.homePage));
		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this, setting.homePage));
	}

	private void actionListener() {
		// back
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				setting.setVisible(true);
				setting.setLocationRelativeTo(null);
			}
		});
		// save
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (controller.addAccount(txtUsername.getText(), txtPassword.getText(), cbReceptionist.isSelected())) {
					JOptionPane.showMessageDialog(null, "Your account has been created sucessfully", "Congratulations",
							JOptionPane.INFORMATION_MESSAGE);
//					System.out.println("tao tai khoang thanh cong");
				} else {
					JOptionPane.showMessageDialog(null, "This account already exists on your device", "Error",
							JOptionPane.ERROR_MESSAGE);
//				System.out.println("that bai , tai khoan da ton tai");
				}
			}
		});

	}

}
