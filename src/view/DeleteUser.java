package view;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class DeleteUser {
	private JFrame frame;
	private JTextField txtName;
	JPanel panel;
	static JButton btnCheckIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteUser window = new DeleteUser();
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
	public DeleteUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 10, 570, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelMain = new JPanel();
		frame.getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);

		JButton btnDeleteUser = new JButton("Delete user");
		btnDeleteUser.setFont(new Font("Serif", Font.BOLD, 25));
		btnDeleteUser.setBounds(195, 75, 180, 50);
		panelMain.add(btnDeleteUser);
		btnDeleteUser.setFocusable(false);
		btnDeleteUser.setBackground(new Color(135, 206, 250));
		btnDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(State.background);
		pnlTop.setBorder(null);
		pnlTop.setBounds(0, 0, 570, 100);
		panelMain.add(pnlTop);
		pnlTop.setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(State.logo_small);
		lblLogo.setBounds(0, -22, 100, 112);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(85, 24, 137, 48);
		pnlTop.add(lblGroup17);
		;

		JPanel pnlDeleteUser = new JPanel();
		pnlDeleteUser.setLayout(null);
		pnlDeleteUser.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlDeleteUser.setBounds(55, 190, 450, 230);
		panelMain.add(pnlDeleteUser);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblName.setBounds(60, 70, 95, 70);
		pnlDeleteUser.add(lblName);
		txtName = new JTextField("Name");
		txtName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == txtName) {
					txtName.setText("");
				}
			}
		});
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtName.setBounds(200, 85, 235, 40);
		pnlDeleteUser.add(txtName);
		txtName.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(State.clear_button);
		btnClear.setFont(new Font("Serif", Font.PLAIN, 20));
		btnClear.setBounds(200, 170, 110, 35);
		btnClear.setFocusable(false);
		pnlDeleteUser.add(btnClear);

		JButton btnCheckout = new JButton("Check out");
		btnCheckout.setBackground(State.red_button);
		btnCheckout.setFont(new Font("Serif", Font.PLAIN, 20));
		btnCheckout.setBounds(315, 170, 120, 35);
		btnCheckout.setFocusable(false);
		pnlDeleteUser.add(btnCheckout);

	}
}
