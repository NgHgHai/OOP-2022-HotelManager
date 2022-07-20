package model;

public class Payment {
	private String CVC_Code;
	private String cardNumber;

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

	public void setCVC_Code(String cVC_Code) {
		CVC_Code = cVC_Code;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}
