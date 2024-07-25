package abstract_bank;

public class CurrentAccount extends BankAccount{
	private String cname;
	private int acc_no;
	private double balance = 0;
	double bal,ifsc;
	
	
	public CurrentAccount(String cname, int acc_no, double ifsc, double balance) {
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

	public void deposite(int d_amount) {
		bal = balance + d_amount;
		System.out.println("\nAfter Deposite your balance is : "+bal);
	}
	public void withdraw(int w_amount) {
		 bal = bal - w_amount;
		 if(w_amount <= bal) {
			 System.out.println("After Withdraw your balance is : "+ bal+"\n");
		 }else {
			 System.out.println("Insufficient Balance");
		 }
	}
	
	@Override
	public String toString() {
		return "CurrentAccount [Customer name =" + cname + ", acc_no=" + acc_no + ", ifsc=" + ifsc +", Balace=" + balance + "]";
	}
}
