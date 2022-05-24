package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class AddRoom extends JFrame {
	private JFrame frame;
	private JTextField txtSaa;
	private JTable table;
	private JTextField textField_1;

	/**
	 * * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRoom window = new AddRoom();
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
	public AddRoom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(32,83,117));
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnCenter = new JButton("Add Room");
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
		panel.setLayout(null);
		panel.setBackground(SystemColor.control);
		panel.setBounds(10, 100, 1165, 550);
		frame.getContentPane().add(panel);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(10, 75, 480, 464);
		panel.add(panel_4);

		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(10, 10, 140, 40);
		panel_4.add(lblNewLabel_2);

		txtSaa = new JTextField();
		txtSaa.setBounds(160, 15, 280, 34);
		panel_4.add(txtSaa);
		txtSaa.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Room Type");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(10, 70, 170, 40);
		panel_4.add(lblNewLabel_3);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Economy");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(30, 130, 130, 30);
		panel_4.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Normal");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(190, 130, 130, 30);
		panel_4.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("VIP");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(340, 130, 130, 30);
		panel_4.add(rdbtnNewRadioButton_2);

		ButtonGroup btnGroup1 = new ButtonGroup();
		btnGroup1.add(rdbtnNewRadioButton);
		btnGroup1.add(rdbtnNewRadioButton_1);
		btnGroup1.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_3_1 = new JLabel("Room Capacity");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3_1.setBounds(10, 180, 170, 40);
		panel_4.add(lblNewLabel_3_1);

		JLabel lblNewLabel_4 = new JLabel("Cost");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(10, 280, 140, 40);
		panel_4.add(lblNewLabel_4);

		JButton btnNewButton_4 = new JButton("DELETE");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(80, 410, 90, 40);
		panel_4.add(btnNewButton_4);
		btnNewButton_4.setFocusable(false);

		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSingle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnSingle.setBounds(20, 240, 130, 30);
		panel_4.add(rdbtnSingle);

		JRadioButton rdbtnDouble = new JRadioButton("Double");
		rdbtnDouble.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDouble.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDouble.setBounds(190, 240, 130, 30);
		panel_4.add(rdbtnDouble);

		JRadioButton rdbtnTriple = new JRadioButton("Triple");
		rdbtnTriple.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTriple.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnTriple.setBounds(340, 240, 130, 30);
		panel_4.add(rdbtnTriple);

		ButtonGroup btnGroup2 = new ButtonGroup();
		btnGroup2.add(rdbtnSingle);
		btnGroup2.add(rdbtnDouble);
		btnGroup2.add(rdbtnTriple);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 290, 280, 34);
		panel_4.add(textField_1);

		JButton btnNewButton_4_1 = new JButton("ADD");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4_1.setBounds(80, 350, 90, 40);
		panel_4.add(btnNewButton_4_1);
		btnNewButton_4_1.setFocusable(false);

		JButton btnNewButton_4_2 = new JButton("EDIT");
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4_2.setBounds(290, 350, 90, 40);
		panel_4.add(btnNewButton_4_2);
		btnNewButton_4_2.setFocusable(false);

		JButton btnNewButton_4_3 = new JButton("SAVE");
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4_3.setBounds(290, 410, 90, 40);
		panel_4.add(btnNewButton_4_3);
		btnNewButton_4_3.setFocusable(false);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(500, 75, 655, 464);
		panel.add(panel_2);

		table = new JTable();
		table.setFont(new Font("Time New Roman", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(new Object[][] { { "RNum", "RName", "RType", "Status", "Price" },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "RNum", "RName", "RType", "Status", "Price" }));
		table.setBounds(10, 10, 635, 444);
		panel_2.add(table);

		JButton btnNewButton_2 = new JButton("Refresh");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(977, 14, 141, 36);
		panel.add(btnNewButton_2);
		btnNewButton_2.setFocusable(false);

		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 25, 72, 18);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("...................");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(53, 21, 106, 27);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBackground(new Color(32,83,117));
		panel_1.setBounds(10, 10, 1165, 90);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(HomePage.class.getResource("/libs/logo-small.png")));
		lblNewLabel_6.setBounds(23, -22, 100, 112);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("GROUP 17");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("UTM Cooper Black", Font.BOLD, 18));
		lblNewLabel_7.setBounds(106, 24, 137, 48);
		panel_1.add(lblNewLabel_7);

	}
}
