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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewUser extends JFrame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewUser window = new ViewUser();
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
	public ViewUser() {
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
		panel.setLayout(null);
		panel.setBounds(10, 10, 564, 90);
//		panel.setBackground(new Color(72, 61, 139));
		panel.setBackground(new Color(32,83,117));
		frame.getContentPane().add(panel);

		JButton btnNewButton_1 = new JButton("<Back");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton_1.setBounds(25, 10, 81, 27);
//		btnNewButton_1.setBackground(new Color(72, 61, 139));
		btnNewButton_1.setBackground(new Color(32,83,117));
		
		btnNewButton_1.setFocusable(false);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(HomePage.class.getResource("/libs/logo-small.png")));
		lblNewLabel_6.setBounds(173, -28, 128, 128);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("GROUP 17");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 18));
		lblNewLabel_7.setBounds(252, 38, 98, 27);
		panel.add(lblNewLabel_7);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 111, 564, 439);
		frame.getContentPane().add(panel_1);

		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Time New Roman", Font.BOLD, 11));
		table.setBounds(0, 0, 564, 439);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "User Name", "Password", "Admin Status" }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, },
				new String[] { "User Name", "Password", "Admin Status" }));
		panel_1.add(table);
	}

}
