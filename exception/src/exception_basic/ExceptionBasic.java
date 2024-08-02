package exception_basic;

import java.util.Scanner;

public class ExceptionBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fisrt number :");
		a=sc.nextInt();
		System.out.println("Enter Second number :");
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Can't devide"+e.getMessage());
		}
		catch(Exception e1) {
			System.out.println("Can't devide"+e1.getMessage());
		}
		finally{
			System.out.println("Finally Block");
		}
	}

}