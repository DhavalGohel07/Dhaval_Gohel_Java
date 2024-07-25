package const_overloading;

public class State{
	private String state;

	public State() {
		this.state = "Gujrat";
	}
	

	public State(String state) {
		this.state = state;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "\nState :" + state;
	}
	
	public void display() {
		System.out.println("This is State Class");
	}
}
