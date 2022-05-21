package windowBuilder;

import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class second extends JFrame {

	private JFrame frame;
	private JButton addUser_button, deleteUser_button, deleteRoom_button, addRoom_button, viewAllUser_button, back_button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second window = new second();
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
	public second() {
		initialize();

	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 564, 90);
		panel.setBackground(new Color(72, 61, 139));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		back_button = new JButton("<Back");
		back_button.setForeground(Color.WHITE);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		back_button.setBounds(21, 10, 89, 23);
		back_button.setBackground(new Color(72, 61, 139));
		back_button.setFocusable(false);
		panel.add(back_button);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(second.class.getResource("/libs/logo-small.png")));
		lblNewLabel_2.setBounds(224, -6, 100, 77);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("GROUP 17");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(234, 61, 123, 29);
		panel.add(lblNewLabel_3);
		
		viewAllUser_button = new JButton("View All User");
		viewAllUser_button.setBounds(452, 69, 112, 21);
		viewAllUser_button.setFocusable(false);
		panel.add(viewAllUser_button);
		viewAllUser_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 111, 564, 439);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(421, 235, 190, 40);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));

		addUser_button = new JButton("");
		addUser_button.setIcon(new ImageIcon(second.class.getResource("/libs/add-user.png")));
		addUser_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addUser_button.setBackground(new Color(135, 206, 250));
		addUser_button.setFocusable(false);
		addUser_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		addUser_button.setBounds(88, 49, 190, 164);
		panel_1.add(addUser_button);

		deleteUser_button = new JButton("");
		deleteUser_button.setIcon(new ImageIcon(second.class.getResource("/libs/remove-user.png")));
		deleteUser_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		deleteUser_button.setFocusable(false);
		deleteUser_button.setBackground(new Color(135, 206, 250));
		deleteUser_button.setBounds(288, 49, 190, 164);
		panel_1.add(deleteUser_button);
		
		deleteRoom_button = new JButton("");
		deleteRoom_button.setFocusable(false);
		deleteRoom_button.setIcon(new ImageIcon(second.class.getResource("/libs/delete-room.png")));
		deleteRoom_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteRoom_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		deleteRoom_button.setBackground(new Color(135, 206, 250));
		deleteRoom_button.setBounds(288, 235, 190, 164);
		panel_1.add(deleteRoom_button);

//		JLabel lblNewLabel_4_1 = new JLabel("");
//		lblNewLabel_4_1.setIcon(new ImageIcon(second.class.getResource("/windowBuilder/add.png")));
//		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_4_1.setBackground(Color.CYAN);
//		lblNewLabel_4_1.setBounds(86, 250, 200, 135);
//		panel_1.add(lblNewLabel_4_1);

		addRoom_button = new JButton("");
		addRoom_button.setIcon(new ImageIcon(second.class.getResource("/libs/add-room.png")));
		addRoom_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		addRoom_button.setFocusable(false);
		addRoom_button.setBackground(new Color(135, 206, 250));
		addRoom_button.setBounds(88, 235, 190, 164);
		panel_1.add(addRoom_button);
		
		JLabel lblNewLabel_1 = new JLabel("Add User");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(88, 10, 190, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Delete User");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(288, 10, 190, 40);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Delete Room");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(288, 399, 190, 40);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Add Room");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBounds(88, 399, 190, 40);
		panel_1.add(lblNewLabel_1_1_2);

	}
}
