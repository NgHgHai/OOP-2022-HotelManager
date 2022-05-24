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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {
	private JFrame frame;
//	private HomePage2 homePage2 = new HomePage2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 700);
		frame.setResizable(false);
//		frame.getContentPane().setBackground(new Color(72, 61, 139));
		frame.getContentPane().setBackground(new Color(32,83,117));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnCenter = new JButton("Home Page");
		btnCenter.setBackground(new Color(135, 206, 250));
		btnCenter.setFont(new Font("Serif", Font.BOLD, 30));
		btnCenter.setFocusable(false);
		btnCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCenter.setBounds(510, 65, 200, 70);
		frame.getContentPane().add(btnCenter);

		JPanel panel = new JPanel();
		panel.setBounds(215, 100, 960, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(135, 206, 250));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_5.setBounds(540, 60, 300, 200);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Rooms");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_1.setBounds(10, 145, 280, 40);
		panel_5.add(lblNewLabel_1);

		JButton btnCheckIn_1 = new JButton("");
		btnCheckIn_1.setIcon(new ImageIcon(HomePage.class.getResource("/libs/room.png")));
		btnCheckIn_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCheckIn_1.setBackground(new Color(135, 206, 250));
		btnCheckIn_1.setBounds(10, 10, 280, 135);
		btnCheckIn_1.setFocusable(false);
		btnCheckIn_1.setBorder(null);
		panel_5.add(btnCheckIn_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(135, 206, 250));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_6.setBounds(100, 320, 300, 200);
		panel.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblCheckOut = new JLabel("Check  Out");
		lblCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckOut.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblCheckOut.setBounds(10, 145, 280, 40);
		panel_6.add(lblCheckOut);

		JButton btnCheckIn_2 = new JButton("");
		btnCheckIn_2.setIcon(new ImageIcon(HomePage.class.getResource("/libs/log-out.png")));
		btnCheckIn_2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCheckIn_2.setBackground(new Color(135, 206, 250));
		btnCheckIn_2.setBounds(10, 10, 280, 135);
		btnCheckIn_2.setFocusable(false);
		btnCheckIn_2.setBorder(null);
		panel_6.add(btnCheckIn_2);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(135, 206, 250));
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_7.setBounds(540, 320, 300, 200);
		panel.add(panel_7);

		JLabel lblGuest = new JLabel("Guest");
		lblGuest.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuest.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblGuest.setBounds(10, 145, 280, 40);
		panel_7.add(lblGuest);

		JButton btnCheckIn_2_2_1 = new JButton("");
		btnCheckIn_2_2_1.setIcon(new ImageIcon(HomePage.class.getResource("/libs/guest.png")));
		btnCheckIn_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCheckIn_2_2_1.setFocusable(false);
		btnCheckIn_2_2_1.setBorder(null);
		btnCheckIn_2_2_1.setBackground(new Color(135, 206, 250));
		btnCheckIn_2_2_1.setBounds(10, 10, 280, 135);
		panel_7.add(btnCheckIn_2_2_1);

		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_5_1.setBackground(new Color(135, 206, 250));
		panel_5_1.setBounds(100, 60, 300, 200);
		panel.add(panel_5_1);

		JLabel lblNewLabel_1_1 = new JLabel("Check In");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_1_1.setBounds(10, 145, 280, 40);
		panel_5_1.add(lblNewLabel_1_1);

		JButton btnCheckIn_1_1 = new JButton("");
		btnCheckIn_1_1.setIcon(new ImageIcon(HomePage.class.getResource("/libs/log-in.png")));
		btnCheckIn_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCheckIn_1_1.setFocusable(false);
		btnCheckIn_1_1.setBorder(null);
		btnCheckIn_1_1.setBackground(new Color(135, 206, 250));
		btnCheckIn_1_1.setBounds(10, 10, 280, 135);
		panel_5_1.add(btnCheckIn_1_1);

		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBackground(new Color(32,83,117));
		panel_1.setBounds(10, 10, 1165, 90);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("Setting");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 25));
		btnNewButton.setIcon(new ImageIcon(HomePage.class.getResource("/libs/iconSetting.png")));
//		btnNewButton.setBackground(new Color(72, 61, 139));
		btnNewButton.setBackground(new Color(32,83,117));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(960, 10, 170, 70);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		panel_1.add(btnNewButton);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(HomePage.class.getResource("/libs/logo-small.png")));
		lblNewLabel_6.setBounds(23, -22, 100, 112);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("GROUP 17");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("UTM Cooper Black", Font.BOLD, 18));
		lblNewLabel_7.setBounds(106, 24, 137, 48);
		panel_1.add(lblNewLabel_7);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(10, 100, 200, 550);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(175, 238, 238));
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4_1.setBounds(10, 40, 180, 100);
		panel_2.add(panel_4_1);

		JLabel lblNewLabel_2 = new JLabel(
				".............................................................................");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(75, 35, 95, 13);
		panel_4_1.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel(
				".............................................................................");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(75, 67, 95, 13);
		panel_4_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setBounds(9, 29, 61, 22);
		panel_4_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblNewLabel_3_1 = new JLabel("Rank:");
		lblNewLabel_3_1.setBounds(10, 58, 61, 22);
		panel_4_1.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JPanel panel_4_1_3 = new JPanel();
		panel_4_1_3.setBackground(new Color(175, 238, 238));
		panel_4_1_3.setLayout(null);
		panel_4_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4_1_3.setBounds(30, 300, 140, 50);
		panel_2.add(panel_4_1_3);

		JLabel lblNewLabel_3_1_1 = new JLabel("Available Rooms");
		lblNewLabel_3_1_1.setBounds(12, 12, 123, 22);
		panel_4_1_3.add(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(new Color(175, 238, 238));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4_1_1.setBounds(10, 180, 180, 150);
		panel_2.add(panel_4_1_1);

		JLabel lblNewLabel_5 = new JLabel("99/100");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(25, 45, 135, 55);
		panel_4_1_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));

		JPanel panel_4_1_3_1 = new JPanel();
		panel_4_1_3_1.setBackground(new Color(175, 238, 238));
		panel_4_1_3_1.setLayout(null);
		panel_4_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4_1_3_1.setBounds(30, 480, 140, 50);
		panel_2.add(panel_4_1_3_1);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Reserved Rooms");
		lblNewLabel_3_1_1_1.setBounds(11, 12, 129, 22);
		panel_4_1_3_1.add(lblNewLabel_3_1_1_1);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JPanel panel_4_1_2 = new JPanel();
		panel_4_1_2.setBackground(new Color(175, 238, 238));
		panel_4_1_2.setBounds(10, 360, 180, 150);
		panel_2.add(panel_4_1_2);
		panel_4_1_2.setLayout(null);
		panel_4_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		JLabel lblNewLabel_5_1 = new JLabel("1/100");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5_1.setBounds(25, 45, 135, 55);
		panel_4_1_2.add(lblNewLabel_5_1);
	}
}