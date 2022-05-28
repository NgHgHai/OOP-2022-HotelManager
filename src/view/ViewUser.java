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

	private JTable tableViewUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewUser window = new ViewUser();
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
	public ViewUser() {

		setBounds(100, 100, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel north_panel = new JPanel();
		north_panel.setLayout(null);
		north_panel.setBounds(10, 10, 564, 90);
		north_panel.setBackground(new Color(32, 83, 117));
		getContentPane().add(north_panel);

		JButton back_button = new JButton("<Back");
		back_button.setForeground(Color.WHITE);

		back_button.setBounds(25, 10, 81, 27);
		back_button.setBackground(new Color(32, 83, 117));

		back_button.setFocusable(false);
		north_panel.add(back_button);

		JLabel iconLogo_label = new JLabel("");
		iconLogo_label.setIcon(new ImageIcon("libs/logo-small.png"));
		iconLogo_label.setBounds(173, -28, 128, 128);
		north_panel.add(iconLogo_label);

		JLabel group17_label = new JLabel("GROUP 17");
		group17_label.setForeground(Color.WHITE);
		group17_label.setFont(new Font("Serif", Font.BOLD, 18));
		group17_label.setBounds(252, 38, 98, 27);
		north_panel.add(group17_label);

		JPanel table_panel = new JPanel();
		table_panel.setLayout(null);
		table_panel.setBackground(Color.LIGHT_GRAY);
		table_panel.setBounds(10, 111, 564, 439);
		getContentPane().add(table_panel);

		tableViewUser = new JTable();
		tableViewUser.setBackground(Color.WHITE);
		tableViewUser.setFont(new Font("Time New Roman", Font.BOLD, 11));
		tableViewUser.setBounds(0, 0, 564, 439);
		tableViewUser.setModel(new DefaultTableModel(
				new Object[][] { { "User Name", "Password", "Admin Status" }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, },
				new String[] { "User Name", "Password", "Admin Status" }));
		table_panel.add(tableViewUser);

		// addActionListener
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		back_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame refreshFrame = new Setting();
				if (isVisible()) {
					setVisible(false);
				}
				refreshFrame.setVisible(true);
				refreshFrame.setLocationRelativeTo(refreshFrame);
				refreshFrame.setSize(600, 600);
			}
		});

		group17_label.addMouseListener(State.retureHomePage(group17_label, this));

		iconLogo_label.addMouseListener(State.retureHomePage(iconLogo_label, this));

	}

}
