package controller;

import java.awt.EventQueue;

import model.ARoom;
import model.Account;
import model.Admin;
import model.CheckIn;
import model.Economy;
import model.HotelManager;
import model.Normal;
import model.Room;
import model.VIP;
import view.Login;

public class Controller {
private HotelManager manager;
private Login login;
public Controller(HotelManager manager) {
	super();
	this.manager = manager;
	login = new Login(manager, this);
	login.setVisible(true);
	
}
public static void main(String[] args) {
	
	EventQueue.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				
				HotelManager manager = new HotelManager(); // tao model
				Controller controller = new Controller(manager); // tao controler
				
//				// data
				ARoom r1 = new Room("123", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				ARoom r2 = new Room("1234", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				ARoom r3 = new Room("1223", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				ARoom r4 = new Room("12355", "hoanghai", "Clean", 35.0, true, new Normal(), 3);
				ARoom r5 = new Room("1235", "hoanghai", "Clean", 40.0, true, new Normal(), 2);
				ARoom r6 = new Room("12345", "hoanghai", "Clean", 50.0, true, new Normal(), 2);
				ARoom r7 = new Room("1237", "hoanghai", "Clean", 40.0, true, new Normal() , 1);
				ARoom r8 = new Room("1238", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				ARoom r9 = new Room("12368", "hoanghai", "Clean", 10.0, true, new Economy(), 1);
				ARoom r10 = new Room("12386", "hoanghai", "Clean", 14.0, true, new Economy(), 2);
				ARoom r11= new Room("12337", "hoanghai", "Clean", 12.0, true, new Economy(), 3);
				ARoom r12= new Room("12335", "hoanghai", "Clean", 1190.0, true, new Economy(), 3);
				ARoom r13= new Room("12326", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				ARoom r14= new Room("12365", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				ARoom r15= new Room("12331", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				manager.add(r1 );
				manager.add(r2 );
				manager.add(r3 );
				manager.add(r4 );
				manager.add(r5 );
				manager.add(r6 );
				manager.add(r7 );
				manager.add(r8 );
				manager.add(r9 );
				manager.add(r10 );
				manager.add(r11 );
				manager.add(r12);
				manager.add(r13 );
				manager.add(r14 );
				manager.add(r15 );
				CheckIn	ck1	=	new CheckIn(null, null, r1, false, null, null);
				CheckIn	ck2	=	new CheckIn(null, null, r2, false, null, null);
				CheckIn	ck3	=	new CheckIn(null, null, r3, false, null, null);
				manager.add(ck1);
				manager.add(ck2);
				manager.add(ck3);
				Account a1 = new Admin("admin", "admin", true);
				Account a2 = new Admin("hoanghai", "1", false);
				Account a3 = new Admin("sinhvien", "1", false);
				manager.add(a1);
				manager.add(a2);
				manager.add(a3);
				
				
				
				System.out.println(manager.totalRoom());
//				manager.notifyObs();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});

}
}
