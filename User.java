public class User {
	private String name;
	private long phone;
	private String address;
	
	public User(String name, long phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void nameSet(String inputName) {
		name = inputName;
	}
	public void phoneSet(long inputPhone) {
		phone = inputPhone;
	}
	public void addressSet(String inputAddress) {
		address = inputAddress;
	}

	public String nameGet() {
		return name;
	}
	public long phoneGet() {
		return phone;
	}
	public String addressGet() {
		return address;
	}
}