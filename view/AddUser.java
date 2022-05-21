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

public class AddUser extends JFrame {

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
					AddUser window = new AddUser();
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
	public AddUser() {
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

		JPanel north_panel = new JPanel();
		north_panel.setBounds(10, 10, 564, 90);
		north_panel.setBackground(new Color(72, 61, 139));
		frame.getContentPane().add(north_panel);
		north_panel.setLayout(null);

		JLabel iconLogo_label = new JLabel("");
		iconLogo_label.setIcon(new ImageIcon(AddUser.class.getResource("/libs/logo-small.png")));
		iconLogo_label.setBounds(173, -28, 128, 128);
		north_panel.add(iconLogo_label);

		JLabel group17_label = new JLabel("GROUP17");
		group17_label.setForeground(Color.WHITE);
		group17_label.setBackground(Color.WHITE);
		group17_label.setFont(new Font("UTM Cooper Black", Font.BOLD, 18));
		group17_label.setBounds(252, 38, 98, 27);
		north_panel.add(group17_label);

		JButton back_button = new JButton("Back");
		back_button.setForeground(Color.WHITE);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		back_button.setBounds(10, 10, 91, 21);
		back_button.setBackground(new Color(72, 61, 139));
		back_button.setFocusable(false);
		north_panel.add(back_button);

		name_textField = new JTextField();
		name_textField.setHorizontalAlignment(SwingConstants.LEFT);
		name_textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		name_textField.setText("Enter new username");

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
		name_textField.setBounds(107, 207, 415, 44);
		frame.getContentPane().add(name_textField);
		name_textField.setColumns(10);

		password_textField = new JTextField();
		password_textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		password_textField.setHorizontalAlignment(SwingConstants.LEFT);
		password_textField.setText("Enter new password");
		password_textField.setBounds(107, 296, 415, 44);
		password_textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == password_textField) {
					password_textField.setText("");
				}
			}

		});
		frame.getContentPane().add(password_textField);
		password_textField.setColumns(10);

		JLabel iconName_label = new JLabel("");
		iconName_label.setIcon(new ImageIcon(AddUser.class.getResource("/libs/user.png")));
		iconName_label.setBounds(54, 207, 46, 43);
		frame.getContentPane().add(iconName_label);

		JLabel iconPassword_label = new JLabel("");
		iconPassword_label.setIcon(new ImageIcon(AddUser.class.getResource("/libs/key.png")));
		iconPassword_label.setBounds(65, 296, 35, 44);
		frame.getContentPane().add(iconPassword_label);

		JButton save_button = new JButton("SAVE");
		save_button.setBackground(new Color(72, 61, 139));
		save_button.setFocusable(false);
		save_button.setForeground(Color.WHITE);
		save_button.setFont(new Font("Tahoma", Font.PLAIN, 23));
		save_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		save_button.setBounds(223, 451, 134, 44);
		frame.getContentPane().add(save_button);

		JCheckBox receptionist_checkBox = new JCheckBox("Receptionist");
		receptionist_checkBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		receptionist_checkBox.setBounds(223, 378, 142, 43);
		frame.getContentPane().add(receptionist_checkBox);
	}
}
