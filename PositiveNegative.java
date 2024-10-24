package java_25;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the number : ");
		
		 Double number = scanner.nextDouble();
		 if (number < 0) {
			 System.out.println("the number is even ");
		 }
		 else if  (number>0)
		 {
			 System.out.println("the number is  odd ");
			 
		 }
		 else 
		 {
		       System.out.println("the number is zero ");
		 }
		 scanner.close();
		 }
					
	}
