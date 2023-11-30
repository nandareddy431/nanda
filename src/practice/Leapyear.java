package practice;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		
Scanner scanner= new Scanner(System.in);
System.out.println("enter year");

int year=scanner.nextInt();

leapyear(year);


	}
	
	
	
public static void leapyear(int year){
	if(((year%4 ==0) && (year%100)!=0)||(year%400==0)){
		System.out.println("leap year");
	}
	else {
		System.out.println("non leap lear");
	}
	}
}

