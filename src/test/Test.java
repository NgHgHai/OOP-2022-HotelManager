package test;

import java.awt.EventQueue;
import java.util.Date;

import controller.Controller;
import model.ARoom;
import model.Account;
import model.Admin;
import model.CheckIn;
import model.Customer;
import model.Economy;
import model.HotelManager;
import model.Normal;
import model.Payment;
import model.PersonalData;
import model.Room;
import model.VIP;

public class Test {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// Chay chuong Trinh
				try {

					HotelManager manager = new HotelManager(); // tao model
					Controller controller = new Controller(manager); // tao controler

//				// data
					ARoom r1 = new Room("101", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
					ARoom r2 = new Room("102", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
					ARoom r3 = new Room("103", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
					ARoom r8 = new Room("104", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
					ARoom r13 = new Room("105", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
					ARoom r14 = new Room("106", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
					ARoom r15 = new Room("107", "hoanghai", "Clean", 100.0, true, new VIP(), 1);
					ARoom r4 = new Room("108", "hoanghai", "Clean", 35.0, true, new Normal(), 3);
					ARoom r5 = new Room("109", "hoanghai", "Clean", 40.0, true, new Normal(), 2);
					ARoom r6 = new Room("110", "hoanghai", "Clean", 50.0, true, new Normal(), 2);
					ARoom r7 = new Room("111", "hoanghai", "Clean", 40.0, true, new Normal(), 1);
					ARoom r9 = new Room("122", "hoanghai", "Clean", 10.0, true, new Economy(), 1);
					ARoom r10 = new Room("112", "hoanghai", "Clean", 14.0, true, new Economy(), 2);
					ARoom r11 = new Room("115", "hoanghai", "Clean", 12.0, true, new Economy(), 3);
					ARoom r12 = new Room("117", "hoanghai", "Clean", 1190.0, true, new Economy(), 3);
					manager.add(r1);
					manager.add(r2);
					manager.add(r3);
					manager.add(r4);
					manager.add(r5);
					manager.add(r6);
					manager.add(r7);
					manager.add(r8);
					manager.add(r9);
					manager.add(r10);
					manager.add(r11);
					manager.add(r12);
					manager.add(r13);
					manager.add(r14);
					manager.add(r15);
					PersonalData p1 = new PersonalData("Hoang Hai", "0795599290", "20130166", "NLU", "TP.HCM",
							"Viet Nam", "");
					PersonalData p2 = new PersonalData("Hoang Hai", "0795599290", "20130166", "NLU", "TP.HCM",
							"Viet Nam", "");
					PersonalData p3 = new PersonalData("Hoang Hai", "0795599290", "20130166", "NLU", "TP.HCM",
							"Viet Nam", "");
					Payment pay1 = new Payment("123456", "3141000046546");
					Payment pay2 = new Payment("123456", "3141000046546");
					Payment pay3 = new Payment("123456", "3141000046546");
					CheckIn ck1 = new CheckIn(p1, pay1, r1, false, new Date(2022, 6, 11), new Date(2022, 6, 16));
					CheckIn ck2 = new CheckIn(p2, pay1, r2, false, new Date(2022, 6, 12), new Date(2022, 6, 16));
					CheckIn ck3 = new CheckIn(p3, pay1, r3, false, new Date(2022, 6, 13), new Date(2022, 6, 16));
					manager.add(ck1);
					manager.add(ck2);
					manager.add(ck3);
					Account a1 = new Admin("admin", "admin");
					Account a2 = new Customer("hoanghai", "1");
					Account a3 = new Admin("sinhvien", "1");
					Account a4 = new Customer("cus", "1");
					manager.add(a1);
					manager.add(a2);
					manager.add(a3);
					manager.add(a4);

//					System.out.println(manager.searchListRoomModel("VIP", 1));
//					System.out.println(manager.searchModel("Normal", 2));
//					System.out.println(manager.getRoom("12335"));

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
