package model;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CheckIn {
	private PersonalData personalData;
	private Payment payment;
	private ARoom room;
	private boolean pay = false;
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

	public int getDateBetweenTwoDate(Date date1, Date date2) {
		Long result = ChronoUnit.DAYS.between(date1.toInstant(), date2.toInstant());
		return Math.abs(Math.toIntExact(result));
	}

	public int getDateBetweenTwoDate() {
		return getDateBetweenTwoDate(checkOutDate, checkInDate);
	}

	public double getCost() {
		return getDateBetweenTwoDate() * room.getCost();
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

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void setRoom(ARoom room) {
		this.room = room;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

}
