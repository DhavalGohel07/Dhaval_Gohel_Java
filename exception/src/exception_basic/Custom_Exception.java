package exception_basic;

import java.util.Scanner;

public class Custom_Exception {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		try{
			if(age<18) {
				throw new ArithmeticException();
			}else {
				System.out.println("Eligible for Voting");
			}
		}catch(ArithmeticException e){
			System.out.println("Not Eligible for Voting");
		}
	}
}
