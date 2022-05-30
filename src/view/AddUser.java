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

public class AddUser extends JFrame {

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
					window.setVisible(true);
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

		setBounds(100, 100, 600, 600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel north_panel = new JPanel();
		north_panel.setLayout(null);
		north_panel.setBounds(10, 10, 564, 90);
		north_panel.setBackground(State.background);
		getContentPane().add(north_panel);

		JLabel iconLogo_label = new JLabel("");
		iconLogo_label.setIcon(State.logo_small);
		iconLogo_label.setBounds(173, -28, 128, 128);
		north_panel.add(iconLogo_label);

		JLabel group17_label = new JLabel("GROUP 17");
		group17_label.setForeground(Color.WHITE);
		group17_label.setFont(new Font("Serif", Font.BOLD, 18));
		group17_label.setBounds(252, 38, 98, 27);
		north_panel.add(group17_label);

		JButton back_button = new JButton("<Back");
		back_button.setForeground(Color.WHITE);
	
		back_button.setBounds(25, 10, 81, 27);
		back_button.setBackground(State.background);
		back_button.setFocusable(false);
		north_panel.add(back_button);

		name_textField = new JTextField();
		name_textField.setHorizontalAlignment(SwingConstants.LEFT);
		name_textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		name_textField.setText("Enter new username");

	
		name_textField.setBounds(107, 207, 415, 44);
		getContentPane().add(name_textField);
		name_textField.setColumns(10);

		password_textField = new JTextField();
		password_textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password_textField.setHorizontalAlignment(SwingConstants.LEFT);
		password_textField.setText("Enter new password");
		password_textField.setBounds(107, 296, 415, 44);
	
		getContentPane().add(password_textField);
		password_textField.setColumns(10);

		JLabel iconName_label = new JLabel("");
		iconName_label.setIcon(new ImageIcon("libs/user.png"));
		iconName_label.setBounds(54, 207, 46, 43);
		getContentPane().add(iconName_label);

		JLabel iconPassword_label = new JLabel("");
		iconPassword_label.setIcon(new ImageIcon("libs/key.png"));
		iconPassword_label.setBounds(65, 296, 35, 44);
		getContentPane().add(iconPassword_label);

		JButton save_button = new JButton("SAVE");
		save_button.setBackground(State.background);
		save_button.setFocusable(false);
		save_button.setForeground(Color.WHITE);
		save_button.setFont(new Font("Tahoma", Font.PLAIN, 23));
	
		save_button.setBounds(223, 451, 134, 44);
		getContentPane().add(save_button);

		JCheckBox receptionist_checkBox = new JCheckBox("Receptionist");
		receptionist_checkBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		receptionist_checkBox.setBounds(223, 378, 142, 43);
		getContentPane().add(receptionist_checkBox);

//		addActionListener
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
		
		password_textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == password_textField) {
					password_textField.setText("");
				}
			}

		});
		
		save_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	

		group17_label.addMouseListener(State.retureHomePage(group17_label, this));

		iconLogo_label.addMouseListener(State.retureHomePage(iconLogo_label, this));

		back_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame settingFrame = new Setting();
				if (isVisible()) {
					setVisible(false);
				}
				settingFrame.setVisible(true);
				settingFrame.setLocationRelativeTo(settingFrame);
				settingFrame.setSize(600, 600);
			}
		});
	}
}
