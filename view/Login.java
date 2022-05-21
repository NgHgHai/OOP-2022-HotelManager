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
	private JTextField txtEnterUsername;
	private JTextField txtEnterPassword;

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

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 564, 539);
		panel.setBackground(new Color(72, 61, 139));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("GROUP 17");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 21));
		lblNewLabel_7.setBounds(288, 130, 108, 27);
		panel.add(lblNewLabel_7);

		txtEnterUsername = new JTextField();
		txtEnterUsername.setText("Enter Username");
		txtEnterUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == txtEnterUsername) {
					txtEnterUsername.setText("");
				}
			}

		});

		txtEnterUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEnterUsername.setColumns(10);
		txtEnterUsername.setBounds(100, 222, 409, 44);
		panel.add(txtEnterUsername);

		txtEnterPassword = new JTextField();
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == txtEnterPassword) {
					txtEnterPassword.setText("");
				}
			}

		});
		txtEnterPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEnterPassword.setColumns(10);
		txtEnterPassword.setBounds(100, 311, 409, 44);
		panel.add(txtEnterPassword);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/libs/user.png")));
		lblNewLabel.setBounds(45, 223, 45, 43);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/libs/key.png")));
		lblNewLabel_1.setBounds(55, 311, 35, 44);
		panel.add(lblNewLabel_1);

		JButton btnNewButton_2 = new JButton("LOGIN");
		btnNewButton_2.setBackground(new Color(72, 61, 139));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_2.setBounds(217, 422, 136, 44);
		btnNewButton_2.setBorder(new LineBorder(Color.WHITE, 3));
		panel.add(btnNewButton_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/libs/logo-big.png")));
		lblNewLabel_3.setBounds(56, -40, 263, 251);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(69, 11, 321, 200);
		frame.getContentPane().add(lblNewLabel_2);

	}
}
