package model;

public class Payment {
	String CVC_Code;
	String cardNumber;

	public Payment(String cVC_Code, String cardNumber) {
		super();
		CVC_Code = cVC_Code;
		this.cardNumber = cardNumber;
	}

	public String getCVC_Code() {
		return CVC_Code;
	}

	public String getCardNumber() {
		return cardNumber;
	}

}
