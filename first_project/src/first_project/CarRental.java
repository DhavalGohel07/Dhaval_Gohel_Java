package first_project;

public class CarRental {
	private int Carid;
	private String Cartype;
	private float Rent;
	public int getCadid() {
		return Carid;
	}
	public void setCarid(int cardid) {
		Carid = cardid;
	}
	public String getCartype() {
		return Cartype;
	}
	public void setCartype(String cartype) {
		Cartype = cartype;
	}
	public float getRent() {
		return Rent;
	}
	public void setRent(float rent) {
		Rent = rent;
	}
//	@Override
//	public String toString() {
//		return "CarRental [Carid=" + Carid + ", Cartype=" + Cartype + ", Rent=" + Rent + "]";
//	}
	
	public void getData(int Carid,String Cartype,float Rent){
		this.Carid=Carid;
		this.Cartype=Cartype;
		this.Rent=Rent;
		
	}
	public void Showcar() {
		System.out.println("Carid : "+Carid + ", Cartype=" + Cartype + ", Rent=" + Rent);
	}
	
	
}
