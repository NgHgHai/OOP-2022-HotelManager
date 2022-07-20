package model;

public abstract class AType {
	protected String name;
	protected String description;
	protected String view;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getView() {
		return view;
	}

	@Override
	public String toString() {
		return name;
	}

}
