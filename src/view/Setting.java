package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Setting extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JButton addUser_button, deleteUser_button, deleteRoom_button, addRoom_button, viewAllUser_button,
			back_button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting window = new Setting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Setting() {
		initialize();

	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel top_panel = new JPanel();
		top_panel.setBounds(10, 10, 564, 90);
		top_panel.setBackground(new Color(72, 61, 139));
		frame.getContentPane().add(top_panel);
		top_panel.setLayout(null);

		back_button = new JButton("<Back");
		back_button.setForeground(Color.WHITE);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		back_button.setBounds(21, 10, 89, 23);
		back_button.setBackground(new Color(72, 61, 139));
		back_button.setFocusable(false);
		top_panel.add(back_button);

		JLabel label_Logo = new JLabel("");
		label_Logo.setIcon(new ImageIcon(Setting.class.getResource("/libs/logo-small.png")));
		label_Logo.setBounds(224, -6, 100, 77);
		top_panel.add(label_Logo);

		JLabel label_group17 = new JLabel("GROUP 17");
		label_group17.setFont(new Font("UTM Cooper Black", Font.BOLD, 18));

		label_group17.setForeground(Color.WHITE);
		label_group17.setBounds(234, 61, 123, 29);
		top_panel.add(label_group17);

		viewAllUser_button = new JButton("View All User");
		viewAllUser_button.setBounds(452, 69, 112, 21);
		viewAllUser_button.setFocusable(false);
		top_panel.add(viewAllUser_button);
		viewAllUser_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JPanel panel_main = new JPanel();
		panel_main.setBackground(Color.LIGHT_GRAY);
		panel_main.setBounds(10, 111, 564, 439);
		frame.getContentPane().add(panel_main);
		panel_main.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(421, 235, 190, 40);
		panel_main.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));

		addUser_button = new JButton("");
		addUser_button.setIcon(new ImageIcon(Setting.class.getResource("/libs/add-user.png")));
		addUser_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addUser_button.setBackground(new Color(135, 206, 250));
		addUser_button.setFocusable(false);
		addUser_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		addUser_button.setBounds(88, 49, 190, 164);
		panel_main.add(addUser_button);

		deleteUser_button = new JButton("");
		deleteUser_button.setIcon(new ImageIcon(Setting.class.getResource("/libs/remove-user.png")));
		deleteUser_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		deleteUser_button.setFocusable(false);
		deleteUser_button.setBackground(new Color(135, 206, 250));
		deleteUser_button.setBounds(288, 49, 190, 164);
		panel_main.add(deleteUser_button);

		deleteRoom_button = new JButton("");
		deleteRoom_button.setFocusable(false);
		deleteRoom_button.setIcon(new ImageIcon(Setting.class.getResource("/libs/delete-room.png")));
		deleteRoom_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteRoom_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		deleteRoom_button.setBackground(new Color(135, 206, 250));
		deleteRoom_button.setBounds(288, 235, 190, 164);
		panel_main.add(deleteRoom_button);

		addRoom_button = new JButton("");
		addRoom_button.setIcon(new ImageIcon(Setting.class.getResource("/libs/add-room.png")));
		addRoom_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		addRoom_button.setFocusable(false);
		addRoom_button.setBackground(new Color(135, 206, 250));
		addRoom_button.setBounds(88, 235, 190, 164);
		panel_main.add(addRoom_button);

		JLabel label_addUser = new JLabel("Add User");
		label_addUser.setHorizontalAlignment(SwingConstants.CENTER);
		label_addUser.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_addUser.setBounds(88, 10, 190, 40);
		panel_main.add(label_addUser);

		JLabel label_deleteUser = new JLabel("Delete User");
		label_deleteUser.setHorizontalAlignment(SwingConstants.CENTER);
		label_deleteUser.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_deleteUser.setBounds(288, 10, 190, 40);
		panel_main.add(label_deleteUser);

		JLabel label_deleteRoom = new JLabel("Delete Room");
		label_deleteRoom.setHorizontalAlignment(SwingConstants.CENTER);
		label_deleteRoom.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_deleteRoom.setBounds(288, 399, 190, 40);
		panel_main.add(label_deleteRoom);

		JLabel label_addRoom = new JLabel("Add Room");
		label_addRoom.setHorizontalAlignment(SwingConstants.CENTER);
		label_addRoom.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_addRoom.setBounds(88, 399, 190, 40);
		panel_main.add(label_addRoom);

	}
}
