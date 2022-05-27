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
					window.setVisible(true);
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

		setBounds(100, 100, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel top_panel = new JPanel();
		top_panel.setBounds(10, 10, 564, 90);
		top_panel.setBackground(State.background);
		getContentPane().add(top_panel);
		top_panel.setLayout(null);

		back_button = new JButton("<Back");
		back_button.setForeground(Color.WHITE);
	
		back_button.setBounds(21, 10, 89, 23);
		back_button.setBackground(State.background);
		back_button.setFocusable(false);
		top_panel.add(back_button);

		JLabel label_Logo = new JLabel("");
		label_Logo.setIcon(State.logo_small);
		label_Logo.setBounds(224, -6, 100, 77);
		top_panel.add(label_Logo);

		JLabel label_group17 = new JLabel("GROUP 17");
		label_group17.setFont(new Font("Serif", Font.BOLD, 18));

		label_group17.setForeground(Color.WHITE);
		label_group17.setBounds(234, 61, 123, 29);
		top_panel.add(label_group17);

		viewAllUser_button = new JButton("View All User");
		viewAllUser_button.setBounds(452, 69, 112, 21);
		viewAllUser_button.setFocusable(false);
		top_panel.add(viewAllUser_button);
	

		JPanel panel_main = new JPanel();
		panel_main.setBackground(Color.LIGHT_GRAY);
		panel_main.setBounds(10, 111, 564, 439);
		getContentPane().add(panel_main);
		panel_main.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(421, 235, 190, 40);
		panel_main.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));

		addUser_button = new JButton("");
		addUser_button.setIcon(new ImageIcon("libs/add-user.png"));
	
		addUser_button.setBackground(new Color(135, 206, 250));
		addUser_button.setFocusable(false);
		addUser_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		addUser_button.setBounds(88, 49, 190, 164);
		panel_main.add(addUser_button);

		deleteUser_button = new JButton("");
		deleteUser_button.setIcon(new ImageIcon("libs/remove-user.png"));
		deleteUser_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		deleteUser_button.setFocusable(false);
		deleteUser_button.setBackground(new Color(135, 206, 250));
		deleteUser_button.setBounds(288, 49, 190, 164);
		panel_main.add(deleteUser_button);

		deleteRoom_button = new JButton("");
		deleteRoom_button.setFocusable(false);
		deleteRoom_button.setIcon(new ImageIcon("libs/delete-room.png"));
	
		deleteRoom_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		deleteRoom_button.setBackground(new Color(135, 206, 250));
		deleteRoom_button.setBounds(288, 235, 190, 164);
		panel_main.add(deleteRoom_button);

		addRoom_button = new JButton("");
		addRoom_button.setIcon(new ImageIcon("libs/add-room.png"));
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
		
		
		
		//addActionListener	
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		viewAllUser_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		addUser_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		deleteRoom_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		viewAllUser_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame viewUserFrame = new ViewUser();
				if (isVisible()) {
					setVisible(false);
				}
				viewUserFrame.setVisible(true);
				viewUserFrame.setLocationRelativeTo(viewUserFrame);
				viewUserFrame.setSize(600, 600);
			}
		});

		addUser_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame addUserFrame = new AddUser();
				if (isVisible()) {
					setVisible(false);
				}
				addUserFrame.setVisible(true);
				addUserFrame.setLocationRelativeTo(addUserFrame);
				addUserFrame.setSize(600, 600);
			}
		});
		deleteUser_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame deleteUserFrame = new DeleteUser();
				if (isVisible()) {
					setVisible(false);
				}
				deleteUserFrame.setVisible(true);
				deleteUserFrame.setLocationRelativeTo(deleteUserFrame);
				deleteUserFrame.setSize(570, 550);
			}
		});

		addRoom_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame addRoomFrame = new AddRoom();
				if (isVisible()) {
					setVisible(false);
				}
				addRoomFrame.setVisible(true);
				addRoomFrame.setLocationRelativeTo(addRoomFrame);
				addRoomFrame.setSize(1200, 700);
			}
		});
		deleteRoom_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame deleteRoomFrame = new DeleteRoom();
				if (isVisible()) {
					setVisible(false);
				}
				deleteRoomFrame.setVisible(true);
				deleteRoomFrame.setLocationRelativeTo(deleteRoomFrame);
				deleteRoomFrame.setSize(570, 550);
			}
		});
		
		back_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame homePageFrame = new HomePage();
				if (isVisible()) {
					setVisible(false);
				}
				homePageFrame.setVisible(true);
				homePageFrame.setLocationRelativeTo(homePageFrame);
				homePageFrame.setSize(1200, 700);
			}
		});
		

	
		
		label_group17.addMouseListener(State.retureHomePage(label_group17, this));

		label_Logo.addMouseListener(State.retureHomePage(label_Logo, this));
		
	}
}
