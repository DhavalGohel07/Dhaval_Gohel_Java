package first_project;

public class Address {
	private String society,area,city;
	private int pincode;
	
	
	public Address(String society, String area, String city, int pincode) {
		this.society = society;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address() {
		society = "Shivalaya";
		area = "Vejalpur";
		city = "Ahmedabad";
		pincode = 380051;
	}
	
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [society=" + society + ", Area=" + area + ", City=" + city + ", pincode=" + pincode + "]";
	}
	
}
