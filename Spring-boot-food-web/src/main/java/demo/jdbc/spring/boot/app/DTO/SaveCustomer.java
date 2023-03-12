package demo.jdbc.spring.boot.app.DTO;

public class SaveCustomer {

	
	private String name;
	private String email;
	private String password;
	private int phoneNo;
	private String address;
	@Override
	public String toString() {
		return "SaveCustomer [name=" + name + ", email=" + email + ", password=" + password + ", phoneNo=" + phoneNo
				+ ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public SaveCustomer(String name, String email, String password, int phoneNo, String address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public SaveCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
