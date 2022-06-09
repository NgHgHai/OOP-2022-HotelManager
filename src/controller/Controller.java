package controller;

import java.awt.EventQueue;

import model.ARoom;
import model.HotelManager;
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
				ARoom r2 = new Room("123", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
				manager.add(r1 );
				manager.add(r2 );
				System.out.println(manager.totalRoom());
//				manager.notifyObs();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});

}
}
