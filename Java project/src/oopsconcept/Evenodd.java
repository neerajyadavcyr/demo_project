package oopsconcept;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating Scanner class object
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner (System.in);
		System.out.print("enter the number");
		//reading value from user
		int num = Scan.nextInt();
		// Method calling
	 odd (num);
	}
	//user defined method
	public static void  odd (int num){
		//method body
		if (num % 2 == 0);
		System.out.println(num+"is odd");
		System.out.println(num+"is even");
	}

}
