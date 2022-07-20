package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import model.Observable;
import model.Observer;

public class Login extends JFrame {
	private Observable hotelObs;
	private Controller controller;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JButton btnLogin;

	public Login(Observable hotelObs, Controller controller) {
		this.hotelObs = hotelObs;
		this.controller = controller;
		init();
		actionListener();
	}

	private void init() {
		setBounds(100, 100, 600, 600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPanel pnlMain = new JPanel();
		pnlMain.setLayout(null);
		pnlMain.setBounds(10, 11, 564, 539);
		pnlMain.setBackground(State.background);
		getContentPane().add(pnlMain);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 21));
		lblGroup17.setBounds(295, 130, 108, 27);
		pnlMain.add(lblGroup17);

		txtUsername = new JTextField();
		txtUsername.setText("admin");
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setColumns(10);
		txtUsername.setBounds(100, 222, 409, 44);
		pnlMain.add(txtUsername);

		txtPassword = new JTextField();
		txtPassword.setText("admin");
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtPassword.setColumns(10);
		txtPassword.setBounds(100, 311, 409, 44);
		pnlMain.add(txtPassword);

		JLabel lblIconUser = new JLabel("");
		lblIconUser.setIcon(new ImageIcon("libs/user.png"));
		lblIconUser.setBounds(45, 223, 45, 43);
		pnlMain.add(lblIconUser);

		JLabel lblIconKey = new JLabel("");
		lblIconKey.setIcon(new ImageIcon("libs/key.png"));
		lblIconKey.setBounds(55, 311, 35, 44);
		pnlMain.add(lblIconKey);

		btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(State.background);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFocusable(false);

		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnLogin.setBounds(217, 422, 136, 44);
		btnLogin.setBorder(new LineBorder(Color.WHITE, 3));
		pnlMain.add(btnLogin);

		JLabel lblLogin = new JLabel("");
		lblLogin.setIcon(State.logo_big);
		lblLogin.setBounds(65, -40, 263, 251);
		pnlMain.add(lblLogin);

		// text action
		txtUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getSource() == txtUsername) {
					txtUsername.setText("");
				}
			}
		});

		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == txtPassword) {
					txtPassword.setText("");
				}
			}
		});
	}

	private void actionListener() {
		// push the button Login
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnLogin)) {
					checkAccount();
				}
			}
		});
		// key "enter" (if select the button "login" push it )// hai pha
		btnLogin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					checkAccount();
				}
			}
		});
	}

	private void checkAccount() {
		if (controller.isAccount(txtUsername.getText(), txtPassword.getText())) {
			setVisible(false);

			JFrame homePageFrame = new HomePage(hotelObs, controller, this);
			homePageFrame.setVisible(true);
			homePageFrame.setLocationRelativeTo(null);
			JFrame homePageFrame2 = new HomePage(hotelObs, controller, this);
			homePageFrame2.setVisible(true);
			homePageFrame2.setLocationRelativeTo(null);
//			JFrame homePageFrame3 = new HomePage(hotelObs, controller, this);
//			homePageFrame3.setVisible(true);
//			homePageFrame3.setLocationRelativeTo(null);
//			JFrame homePageFrame4 = new HomePage(hotelObs, controller, this);
//			homePageFrame4.setVisible(true);
//			homePageFrame4.setLocationRelativeTo(null);
//			JFrame homePageFrame5 = new HomePage(hotelObs, controller, this);
//			homePageFrame5.setVisible(true);
//			homePageFrame5.setLocationRelativeTo(null);
		} else {
			JOptionPane.showMessageDialog(null, "User name or password is incorect", "Error",
					JOptionPane.ERROR_MESSAGE);
//		System.out.println("sai tk + mk");
		}
	}
}
