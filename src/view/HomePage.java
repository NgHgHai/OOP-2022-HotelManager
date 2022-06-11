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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.Controller;
import model.HotelManager;
import model.Observable;
import model.Observer;

public class HomePage extends JFrame implements Observer, ActionListener {
	Login login;
	private Observable hotelObs;
	private Controller controller;

	private int allRoom = 0;
	private int avaiRoom = 0;
	private HomePage2 homePage2Frame;

	private JButton btnGuest;
	private JButton btnCheckOut;
	private JButton btnRooms;
	private JButton btnLogOut;
	private JButton btnSetting;
	private JButton btnCheckIn;

	public HomePage(Observable hotelObs, Controller controller, Login login) {
		// add obs
		this.hotelObs = hotelObs;
		this.controller = controller;
		hotelObs.addObs(this);
		this.login = login;

		update();
		init();// khoi tao

	}

	private void init() {
		setBounds(100, 100, 1200, 700);
		setResizable(false);
		getContentPane().setBackground(State.background);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnCenter = new JButton("Home Page");
		btnCenter.setBackground(new Color(135, 206, 250));
		btnCenter.setFont(new Font("Serif", Font.BOLD, 30));
		btnCenter.setFocusable(false);
		btnCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCenter.setBounds(510, 65, 200, 70);
		getContentPane().add(btnCenter);

//----------------------------------------------------
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(State.background);
		pnlTop.setBounds(10, 10, 1165, 90);
		getContentPane().add(pnlTop);
		pnlTop.setLayout(null);

		btnSetting = new JButton("Setting");
		btnSetting.setFont(new Font("Serif", Font.BOLD, 25));
		btnSetting.setIcon(new ImageIcon("libs/iconSetting.png"));
		btnSetting.setBackground(new Color(32, 83, 117));
		btnSetting.setForeground(Color.WHITE);
		btnSetting.setBounds(960, 10, 170, 70);
		btnSetting.setFocusable(false);
		btnSetting.setBorder(null);
		pnlTop.add(btnSetting);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(State.logo_small);
		lblLogo.setBounds(23, -22, 100, 112);
		pnlTop.add(lblLogo);

		JLabel lblGroup17 = new JLabel("GROUP 17");
		lblGroup17.setForeground(Color.WHITE);
		lblGroup17.setFont(new Font("Serif", Font.BOLD, 18));
		lblGroup17.setBounds(106, 24, 137, 48);
		pnlTop.add(lblGroup17);
//		----------------------------------

		JPanel pnlLeft = new JPanel();
		pnlLeft.setBackground(new Color(135, 206, 250));
		pnlLeft.setBounds(10, 100, 200, 550);
		getContentPane().add(pnlLeft);
		pnlLeft.setLayout(null);

		JPanel pnlInfor = new JPanel();
		pnlInfor.setBackground(new Color(175, 238, 238));
		pnlInfor.setLayout(null);
		pnlInfor.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlInfor.setBounds(10, 20, 180, 100);
		pnlLeft.add(pnlInfor);

		JLabel lblGetName = new JLabel(".............................................................................");
		lblGetName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGetName.setBounds(75, 35, 95, 13);
		pnlInfor.add(lblGetName);

		JLabel lblGetRank = new JLabel(".............................................................................");
		lblGetRank.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGetRank.setBounds(75, 67, 95, 13);
		pnlInfor.add(lblGetRank);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(9, 29, 61, 22);
		pnlInfor.add(lblName);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblRank = new JLabel("Rank:");
		lblRank.setBounds(10, 58, 61, 22);
		pnlInfor.add(lblRank);
		lblRank.setFont(new Font("Tahoma", Font.BOLD, 18));

		JPanel pnlContructorAvailableRooms = new JPanel();
		pnlContructorAvailableRooms.setBackground(new Color(175, 238, 238));
		pnlContructorAvailableRooms.setLayout(null);
		pnlContructorAvailableRooms.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlContructorAvailableRooms.setBounds(30, 260, 140, 50);
		pnlLeft.add(pnlContructorAvailableRooms);

		JLabel lblAvailableRooms = new JLabel("Available Rooms");
		lblAvailableRooms.setBounds(12, 12, 123, 22);
		pnlContructorAvailableRooms.add(lblAvailableRooms);
		lblAvailableRooms.setFont(new Font("Tahoma", Font.BOLD, 14));

		JPanel pnlAvailableRooms = new JPanel();
		pnlAvailableRooms.setBackground(new Color(175, 238, 238));
		pnlAvailableRooms.setLayout(null);
		pnlAvailableRooms.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlAvailableRooms.setBounds(10, 140, 180, 150);
		pnlLeft.add(pnlAvailableRooms);

		JLabel lblGetAvailableRooms = new JLabel(avaiRoom + " / " + allRoom);
		lblGetAvailableRooms.setHorizontalAlignment(SwingConstants.CENTER);
		lblGetAvailableRooms.setForeground(new Color(0, 0, 0));
		lblGetAvailableRooms.setBounds(25, 45, 135, 55);
		pnlAvailableRooms.add(lblGetAvailableRooms);
		lblGetAvailableRooms.setFont(new Font("Tahoma", Font.BOLD, 25));

		JPanel pnlContructoReservedRooms = new JPanel();
		pnlContructoReservedRooms.setBackground(new Color(175, 238, 238));
		pnlContructoReservedRooms.setLayout(null);
		pnlContructoReservedRooms.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlContructoReservedRooms.setBounds(30, 440, 140, 50);
		pnlLeft.add(pnlContructoReservedRooms);

		JLabel lblReservedRooms = new JLabel("Reserved Rooms");
		lblReservedRooms.setBounds(11, 12, 129, 22);
		pnlContructoReservedRooms.add(lblReservedRooms);
		lblReservedRooms.setFont(new Font("Tahoma", Font.BOLD, 14));

		JPanel pnlReservedRooms = new JPanel();
		pnlReservedRooms.setBackground(new Color(175, 238, 238));
		pnlReservedRooms.setBounds(10, 320, 180, 150);
		pnlLeft.add(pnlReservedRooms);
		pnlReservedRooms.setLayout(null);
		pnlReservedRooms.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		JLabel lblGetReservedRooms = new JLabel((allRoom - avaiRoom) + " / " + allRoom);
		lblGetReservedRooms.setHorizontalAlignment(SwingConstants.CENTER);
		lblGetReservedRooms.setForeground(Color.BLACK);
		lblGetReservedRooms.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGetReservedRooms.setBounds(25, 45, 135, 55);
		pnlReservedRooms.add(lblGetReservedRooms);

		btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBounds(51, 505, 89, 23);
		btnLogOut.setFocusable(false);
		btnLogOut.setBackground(State.red_button);
		pnlLeft.add(btnLogOut);

//		---------------------------------		
		JPanel pnlRight = new JPanel();
		pnlRight.setBounds(215, 100, 960, 550);
		getContentPane().add(pnlRight);
		pnlRight.setLayout(null);

		JPanel pnlCheckIn = new JPanel();
		pnlCheckIn.setLayout(null);
		pnlCheckIn.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlCheckIn.setBackground(new Color(135, 206, 250));
		pnlCheckIn.setBounds(100, 60, 300, 200);
		pnlRight.add(pnlCheckIn);

		JLabel lblCheckIn = new JLabel("Check In");
		lblCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckIn.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblCheckIn.setBounds(10, 145, 280, 40);
		pnlCheckIn.add(lblCheckIn);

		btnCheckIn = new JButton("");
		btnCheckIn.setIcon(new ImageIcon("libs/log-in.png"));
		btnCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		btnCheckIn.setFocusable(false);
		btnCheckIn.setBorder(null);
		btnCheckIn.setBackground(new Color(135, 206, 250));
		btnCheckIn.setBounds(10, 10, 280, 135);
		pnlCheckIn.add(btnCheckIn);

		JPanel pnlRooms = new JPanel();
		pnlRooms.setBackground(new Color(135, 206, 250));
		pnlRooms.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlRooms.setBounds(540, 60, 300, 200);
		pnlRight.add(pnlRooms);
		pnlRooms.setLayout(null);

		JLabel lblRooms = new JLabel("Rooms");
		lblRooms.setHorizontalAlignment(SwingConstants.CENTER);
		lblRooms.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblRooms.setBounds(10, 145, 280, 40);
		pnlRooms.add(lblRooms);

		btnRooms = new JButton("");
		btnRooms.setIcon(new ImageIcon("libs/room.png"));
		btnRooms.setHorizontalAlignment(SwingConstants.CENTER);
		btnRooms.setBackground(new Color(135, 206, 250));
		btnRooms.setBounds(10, 10, 280, 135);
		btnRooms.setFocusable(false);
		btnRooms.setBorder(null);
		pnlRooms.add(btnRooms);

		JPanel pnlCheckOut = new JPanel();
		pnlCheckOut.setBackground(new Color(135, 206, 250));
		pnlCheckOut.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlCheckOut.setBounds(100, 320, 300, 200);
		pnlRight.add(pnlCheckOut);
		pnlCheckOut.setLayout(null);

		JLabel lblCheckOut = new JLabel("Check Out");
		lblCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckOut.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblCheckOut.setBounds(10, 145, 280, 40);
		pnlCheckOut.add(lblCheckOut);

		btnCheckOut = new JButton("");
		btnCheckOut.setIcon(new ImageIcon("libs/log-out.png"));
		btnCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
		btnCheckOut.setBackground(new Color(135, 206, 250));
		btnCheckOut.setBounds(10, 10, 280, 135);
		btnCheckOut.setFocusable(false);
		btnCheckOut.setBorder(null);
		pnlCheckOut.add(btnCheckOut);

		JPanel pnlGuest = new JPanel();
		pnlGuest.setLayout(null);
		pnlGuest.setBackground(new Color(135, 206, 250));
		pnlGuest.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		pnlGuest.setBounds(540, 320, 300, 200);
		pnlRight.add(pnlGuest);

		JLabel lblGuest = new JLabel("Guest");
		lblGuest.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuest.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 45));
		lblGuest.setBounds(10, 145, 280, 40);
		pnlGuest.add(lblGuest);

		btnGuest = new JButton("");
		btnGuest.setIcon(new ImageIcon("libs/guest.png"));
		btnGuest.setHorizontalAlignment(SwingConstants.CENTER);
		btnGuest.setFocusable(false);
		btnGuest.setBorder(null);
		btnGuest.setBackground(new Color(135, 206, 250));
		btnGuest.setBounds(10, 10, 280, 135);
		pnlGuest.add(btnGuest);

		// logo ActionListener
		lblGroup17.addMouseListener(State.retureHomePage(lblGroup17, this, this));
		lblLogo.addMouseListener(State.retureHomePage(lblLogo, this, this));

		// addActionListener
		actionListener();
	}

	private void actionListener() {

		btnSetting.addActionListener(this);

		btnLogOut.addActionListener(this);

		btnCheckIn.addActionListener(this);
		btnCheckIn.setActionCommand("checkIn");
		btnCheckOut.addActionListener(this);
		btnCheckOut.setActionCommand("checkOut");
		btnGuest.addActionListener(this);
		btnGuest.setActionCommand("guest");
		btnRooms.addActionListener(this);
		btnRooms.setActionCommand("room");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ===== setting
		if (e.getActionCommand().equals(btnSetting.getText())) {
			JFrame SettingFrame = new Setting(hotelObs, controller, this);
			setVisible(false);
			SettingFrame.setVisible(true);
			SettingFrame.setLocationRelativeTo(null);
		}
		// ====== exit
		if (e.getActionCommand().equals(btnLogOut.getText())) {
			setVisible(false);
			login.setVisible(true);
			login.setLocationRelativeTo(null);
		}
		// ====== dieu huong
		if (e.getActionCommand().equals(btnCheckIn.getActionCommand())) {
			setVisible(false);
			homePage2Frame = new HomePage2("checkIn", hotelObs, controller, this);
			homePage2Frame.currentPanel= "1";
			homePage2Frame.setLocationRelativeTo(null);
			homePage2Frame.setVisible(true);
		} else if (e.getActionCommand().equals(btnCheckOut.getActionCommand())) {
			setVisible(false);
			homePage2Frame = new HomePage2("checkOut", hotelObs, controller, this);
			homePage2Frame.currentPanel= "2";
			homePage2Frame.setVisible(true);
			homePage2Frame.setLocationRelativeTo(null);

		} else if (e.getActionCommand().equals(btnGuest.getActionCommand())) {
			setVisible(false);
			homePage2Frame = new HomePage2("guest", hotelObs, controller, this);
			homePage2Frame.currentPanel= "3";
			homePage2Frame.setVisible(true);
			homePage2Frame.setLocationRelativeTo(null);

		} else if (e.getActionCommand().equals(btnRooms.getActionCommand())) {
			setVisible(false);
			homePage2Frame = new HomePage2("room", hotelObs, controller, this);
			homePage2Frame.currentPanel= "4";
			homePage2Frame.setVisible(true);
			homePage2Frame.setLocationRelativeTo(null);

		}

	}

	@Override
	public void update() {
		HotelManager manager = (HotelManager) hotelObs;
		this.allRoom = manager.totalRoom();
		this.avaiRoom = manager.totalReadyRoom();

		init();// khoi tao

		System.out.println("da update");
		System.out.println(allRoom);
		System.out.println(avaiRoom);

	}
}