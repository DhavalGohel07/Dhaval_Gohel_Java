package abstract_bank;

public class SavingAccount extends BankAccount{
	private String cname;
	private int acc_no;
	private double balance = 0,ifsc;
	
	
	public SavingAccount(String cname, int acc_no, double ifsc, double balance) {
		this.cname = cname;
		this.acc_no = acc_no;
		this.ifsc = ifsc;
		this.balance = balance;
	}
	
	
	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getAcc_no() {
		return acc_no;
	}


	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getIfsc() {
		return ifsc;
	}


	public void setIfsc(double ifsc) {
		this.ifsc = ifsc;
	}
	
	
	public void display() {
		System.out.println("Customer Name : "+cname + "Account No : "+acc_no+ " IFSC code : "+ifsc+" Balance : "+balance);
	}


	public void deposite(int d_amount) {
		balance +=  d_amount;
		System.out.println("\nAfter Deposite your balance is : "+balance);
	}
	public void withdraw(int w_amount) {
		 balance -= w_amount;
		 if(w_amount <= balance) {
			 System.out.println("After Withdraw your balance is : "+ balance+"\n");
		 }else {
			 System.out.println("Insufficient Balance");
		 }
	}
}
