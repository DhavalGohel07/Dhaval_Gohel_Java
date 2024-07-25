package selfstudy;

public class Account {
	private Customer customer;
	private double balance;
	
	Account(Customer customer,double balance){
		this.customer = customer;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void AccDetails() {
		customer.CusDetails();
		System.out.println("Balance :"+balance);
	}
}