package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controller.Controller;

public class DeleteRoom extends JFrame {
	Setting setting;
	private JTextField txtID;
	JPanel panel;
	static JButton btnCheckIn;

	JButton btnBack;
	JButton btnDeleteRoom;
	private Controller controller;

	public DeleteRoom(Controller controller, Setting setting) {
		this.setting = setting;
		this.controller = controller;
		init();
		// addActionListener
		actionListener();

	}

	private void actionListener() {
		btnDeleteRoom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnDeleteRoom)) {
					try {
						// ====
						int a = Integer.parseInt(txtID.getText());
						String id = txtID.getText();
						if (controller.removeRoom(id)) {
							JOptionPane.showMessageDialog(null, "remove");
						} else {
							JOptionPane.showMessageDialog(null, "Room does not exist!");
						}

					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "kieu String");
					}
				}
			}
		});

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				setting.setVisible(true);
				setting.setLocationRelativeTo(null);
			}
		});

	}

	private void init() {
		setBounds(500, 10, 600, 600);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelMain = new JPanel();
		getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);
//		-----------------------------		

		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(State.background);
		pnlTop.setBorder(null);
		pnlTop.setBounds(0, 0, 570, 100);
		panelMain.add(pnlTop);
		pnlTop.setLayout(null);

		btnBack = new JButton("<Back");
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
//		------------------------------------------

		JPanel pnlDeleteRoom = new JPanel();
		pnlDeleteRoom.setLayout(null);
		pnlDeleteRoom.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlDeleteRoom.setBounds(55, 190, 450, 230);
		panelMain.add(pnlDeleteRoom);

		JLabel lblName = new JLabel("ID");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblName.setBounds(60, 70, 95, 70);
		pnlDeleteRoom.add(lblName);
		txtID = new JTextField();

		txtID.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtID.setBounds(200, 85, 235, 40);
		pnlDeleteRoom.add(txtID);
		txtID.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(State.clear_button);
		btnClear.setFont(new Font("Serif", Font.PLAIN, 20));
		btnClear.setBounds(200, 170, 95, 35);
		btnClear.setFocusable(false);
		pnlDeleteRoom.add(btnClear);

		btnDeleteRoom = new JButton("Delete room");
		btnDeleteRoom.setBackground(State.red_button);
		btnDeleteRoom.setFont(new Font("Serif", Font.PLAIN, 20));
		btnDeleteRoom.setBounds(300, 170, 135, 35);
		btnDeleteRoom.setFocusable(false);
		pnlDeleteRoom.add(btnDeleteRoom);

		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this, setting.homePage));
		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this, setting.homePage));

		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtID.setText("");
			}
		});

	}
}
