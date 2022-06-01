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

		JPanel pnlTop = new JPanel();
		pnlTop.setLayout(null);
		pnlTop.setBounds(10, 10, 564, 90);
		pnlTop.setBackground(new Color(32, 83, 117));
		getContentPane().add(pnlTop);

		JButton btnBack = new JButton("<Back");
		btnBack.setForeground(Color.WHITE);

		btnBack.setBounds(25, 10, 81, 27);
		btnBack.setBackground(new Color(32, 83, 117));

		btnBack.setFocusable(false);
		pnlTop.add(btnBack);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("libs/logo-small.png"));
		lblLogo.setBounds(173, -28, 128, 128);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(252, 38, 98, 27);
		pnlTop.add(lblGroup17);

		JPanel pnlViewUser = new JPanel();
		pnlViewUser.setLayout(null);
		pnlViewUser.setBackground(Color.LIGHT_GRAY);
		pnlViewUser.setBounds(10, 111, 564, 439);
		getContentPane().add(pnlViewUser);

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
		pnlViewUser.add(tableViewUser);

		// addActionListener

		btnBack.addActionListener(new ActionListener() {

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

		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this));

		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this));

	}

}
