package selfstudy;


public class Ticket {
	private String departure,arrival,flightnum;
	private SeatAssign seatAssign;
	
	public static class SeatAssign{
		private int num;
		private char c ;
		
		public SeatAssign(int num, char c) {
			this.num = num;
			this.c = c;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public char getC() {
			return c;
		}
		public void setC(char c) {
			this.c = c;
		}
		
		public String seatDetail() {
			 return num + String.valueOf(c);
		}
	}

	public Ticket(String departure, String arrival, String flightnum, SeatAssign seatAssign) {
		
		this.departure = departure;
		this.arrival = arrival;
		this.flightnum = flightnum;
		this.seatAssign = seatAssign;
	}
	
	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getFlightnum() {
		return flightnum;
	}

	public void setFlightnum(String flightnum) {
		this.flightnum = flightnum;
	}

	public void FlightDetails() {
		System.out.println("Departure : "+departure+"\nArriavl : "+arrival+"\nFlight Number : "+flightnum+"\nSeat Assign : "+seatAssign.seatDetail());
	}
	
	public static void main(String args[]) {
		SeatAssign sa = new SeatAssign(12,'C');
		Ticket t = new Ticket("Ahmedabad","Jaipur","AVC34",sa);
		t.FlightDetails();
//		System.out.print(t);
	}
}
