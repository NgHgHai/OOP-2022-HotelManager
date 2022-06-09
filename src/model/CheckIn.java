package model;

import java.util.Date;

public class CheckIn {
	PersonalData personalData;
	Payment payment;
	ARoom room;
	boolean pay = false;
	Date checkInDate;
	Date checkOutDate;

	public CheckIn(PersonalData personalData, Payment payment, ARoom room, boolean pay, Date checkInDate,
			Date checkOutDate) {
		super();
		this.personalData = personalData;
		this.payment = payment;
		this.room = room;
		this.pay = pay;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public void paid() {
		pay = true;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public Payment getPayment() {
		return payment;
	}

	public ARoom getRoom() {
		return room;
	}

	public boolean isPay() {
		return pay;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

}
