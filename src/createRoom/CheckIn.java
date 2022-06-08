package createRoom;

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

}
