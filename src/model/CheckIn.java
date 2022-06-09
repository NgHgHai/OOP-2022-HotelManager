package model;

import java.util.Date;

public class CheckIn {
	private PersonalData personalData;
	private Payment payment;
	private ARoom room;
	private boolean pay= false;
	private Date checkInDate;
	private Date checkOutDate;

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

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public ARoom getRoom() {
		return room;
	}

	public void setRoom(ARoom room) {
		this.room = room;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	

}
