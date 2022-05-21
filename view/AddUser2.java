package view;

import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//import giuaKi.HomePage;

public class AddUser2 extends JFrame {

	private JFrame frame;
	private JTextField txtEnterNewUername;
	private JTextField txtEnterNewPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser2 window = new AddUser2();
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
	public AddUser2() {
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
		panel.setBounds(10, 10, 564, 90);
		panel.setBackground(new Color(72, 61, 139));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(AddUser2.class.getResource("/libs/logo-small.png")));
		lblNewLabel_6.setBounds(173, -28, 128, 128);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("GROUP17");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("UTM Cooper Black", Font.BOLD, 18));
		lblNewLabel_7.setBounds(252, 38, 98, 27);
		panel.add(lblNewLabel_7);

		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 10, 91, 21);
		btnNewButton_1.setBackground(new Color(72, 61, 139));
		btnNewButton_1.setFocusable(false);
		panel.add(btnNewButton_1);

		txtEnterNewUername = new JTextField();
		txtEnterNewUername.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterNewUername.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEnterNewUername.setText("Enter new username");

		txtEnterNewUername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == txtEnterNewUername) {
					txtEnterNewUername.setText("");
				}
			}

		});
		txtEnterNewUername.setBounds(107, 207, 415, 44);
		frame.getContentPane().add(txtEnterNewUername);
		txtEnterNewUername.setColumns(10);

		txtEnterNewPassword = new JTextField();
		txtEnterNewPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEnterNewPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterNewPassword.setText("Enter new password");
		txtEnterNewPassword.setBounds(107, 296, 415, 44);
		txtEnterNewPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == txtEnterNewPassword) {
					txtEnterNewPassword.setText("");
				}
			}

		});
		frame.getContentPane().add(txtEnterNewPassword);
		txtEnterNewPassword.setColumns(10);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AddUser2.class.getResource("/libs/user.png")));
		lblNewLabel.setBounds(54, 207, 46, 43);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AddUser2.class.getResource("/libs/key.png")));
		lblNewLabel_1.setBounds(65, 296, 35, 44);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.setBackground(new Color(72, 61, 139));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(223, 451, 134, 44);
		frame.getContentPane().add(btnNewButton_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Receptionist");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox.setBounds(223, 378, 142, 43);
		frame.getContentPane().add(chckbxNewCheckBox);
	}
}
