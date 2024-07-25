package abstract_bank;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount sa = new SavingAccount("Dhaval",1233,4896,100);
//		System.out.println(sa);
		sa.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount you want to Deposite :");
		int depo = sc.nextInt();
		sa.deposite(depo);
		System.out.print("Enter Amount you want to Withdrwal :");
		int with = sc.nextInt();
		sa.withdraw(with);
		
//		CurrentAccount ca = new CurrentAccount("Dhaval",1233,0256,500);
//		System.out.println(ca);
//		ca.deposite(70);
//		ca.withdraw(140);
	}

}
