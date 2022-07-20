package model;

public class Customer extends Account {

	public Customer(String name, String pass) {
		super(name, pass);
	}

	@Override
	protected String getRank() {
		return "Customer";
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", pass=" + pass + "]";
	}

}
