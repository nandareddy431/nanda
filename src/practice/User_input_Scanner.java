package practice;

import java.util.Scanner;

public class User_input_Scanner {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name?");
		
		String name = scanner.nextLine();
		
		System.out.printf("Hey %S, how are you \n ");
		
		String status=scanner.nextLine();
		
		System.out.println("what is your age \n");
		
		int age=scanner.nextInt();
		
		System.out.print("Thank you for confirmation \n");
		scanner.close();
		
		
		
		
		
		
		
		
		
	}

}
