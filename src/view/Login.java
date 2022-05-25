package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import giuaKi.HomePage;
public class Login {

	private JFrame frame;
	private JTextField name_textField;
	private JTextField password_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel background_panel = new JPanel();
		background_panel.setLayout(null);
		background_panel.setBounds(10, 11, 564, 539);
		background_panel.setBackground(State.background);
		frame.getContentPane().add(background_panel);

		JLabel group17_label = new JLabel("GROUP 17");
		group17_label.setForeground(Color.WHITE);
		group17_label.setFont(new Font("Serif", Font.BOLD, 21));
		group17_label.setBounds(288, 130, 108, 27);
		background_panel.add(group17_label);

		name_textField = new JTextField();
		name_textField.setText("Enter Username");
		name_textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		name_textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == name_textField) {
					name_textField.setText("");
				}
			}

		});

		name_textField.setHorizontalAlignment(SwingConstants.LEFT);
//		name_textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		name_textField.setColumns(10);
		name_textField.setBounds(100, 222, 409, 44);
		background_panel.add(name_textField);

		password_textField = new JTextField();
		password_textField.setText("Enter Password");
		password_textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		password_textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == password_textField) {
					password_textField.setText("");
				}
			}

		});
		password_textField.setHorizontalAlignment(SwingConstants.LEFT);
		password_textField.setColumns(10);
		password_textField.setBounds(100, 311, 409, 44);
		background_panel.add(password_textField);

		JLabel iconName_label = new JLabel("");
		iconName_label.setIcon(new ImageIcon(Login.class.getResource("/libs/user.png")));
		iconName_label.setBounds(45, 223, 45, 43);
		background_panel.add(iconName_label);

		JLabel iconPassword_label = new JLabel("");
		iconPassword_label.setIcon(new ImageIcon(Login.class.getResource("/libs/key.png")));
		iconPassword_label.setBounds(55, 311, 35, 44);
		background_panel.add(iconPassword_label);

		JButton login_button = new JButton("LOGIN");
		login_button.setBackground(State.background);
		login_button.setForeground(Color.WHITE);
		login_button.setFocusable(false);
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		login_button.setFont(new Font("Tahoma", Font.PLAIN, 23));
		login_button.setBounds(217, 422, 136, 44);
		login_button.setBorder(new LineBorder(Color.WHITE, 3));
		background_panel.add(login_button);

		JLabel iconLogo_label = new JLabel("");
		iconLogo_label.setIcon(new ImageIcon(Login.class.getResource("/libs/logo-big.png")));
		iconLogo_label.setBounds(56, -40, 263, 251);
		background_panel.add(iconLogo_label);

	}
}
