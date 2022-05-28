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

public class DeleteRoom extends JFrame {
	private JTextField txtID;
	JPanel panel;
	static JButton btnCheckIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteRoom window = new DeleteRoom();
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
	public DeleteRoom() {

		setBounds(500, 10, 570, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		txtID = new JTextField("ID");
	
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

		JButton btnDeleteRoom = new JButton("Delete room");
		btnDeleteRoom.setBackground(State.red_button);
		btnDeleteRoom.setFont(new Font("Serif", Font.PLAIN, 20));
		btnDeleteRoom.setBounds(300, 170, 135, 35);
		btnDeleteRoom.setFocusable(false);
		pnlDeleteRoom.add(btnDeleteRoom);
		
		txtID.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (e.getSource() == txtID) {
					txtID.setText("");
				}
			}
		});
		
		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this));

		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this));


	}
}
