package practice;


import java.util.Scanner;

public class If_statment1 {

	public static void main(String[] args) {
		//int number=10;
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int number=scanner.nextInt();
		even_odd(number);
		//If_statment1 d= new If_statment1();
		//d.even_odd(100);
		
	}

	public static void even_odd(int number) {
		if (number%2==0) {
			System.out.println("even");}
			else {
				System.out.println("odd");
			}
		
		
	}
	
	
	
}
