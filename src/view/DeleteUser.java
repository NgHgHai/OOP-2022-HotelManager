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

public class DeleteUser extends JFrame {
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
	public DeleteUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(500, 10, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelMain = new JPanel();
		getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);
//		----------------------------
		
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(State.background);
		pnlTop.setBorder(null);
		pnlTop.setBounds(0, 0, 570, 100);
		panelMain.add(pnlTop);
		pnlTop.setLayout(null);
		
		JButton btnBack = new JButton("<Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setForeground(Color.WHITE);
	
		btnBack.setBounds(25, 35, 90, 30);
		btnBack.setBackground(State.background);
		btnBack.setFocusable(false);
		pnlTop.add(btnBack);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(State.logo_small);
		lblLogo.setBounds(185, -22, 100, 112);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(265, 25, 137, 48);
		pnlTop.add(lblGroup17);		
//		---------------------------

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
	
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtName.setBounds(200, 85, 235, 40);
		pnlDeleteUser.add(txtName);
		txtName.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(State.clear_button);
		btnClear.setFont(new Font("Serif", Font.PLAIN, 20));
		btnClear.setBounds(200, 170, 95, 35);
		btnClear.setFocusable(false);
		pnlDeleteUser.add(btnClear);

		JButton btnDeleteID = new JButton("Delete user");
		btnDeleteID.setBackground(State.red_button);
		btnDeleteID.setFont(new Font("Serif", Font.PLAIN, 20));
		btnDeleteID.setBounds(300, 170, 135, 35);
		btnDeleteID.setFocusable(false);
		pnlDeleteUser.add(btnDeleteID);
		
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
		
		btnBack.addActionListener(new ActionListener() {

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
		
		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this));

		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this));

		btnBack.addActionListener(new ActionListener() {

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
