package practice;

import java.util.Scanner;

public class Switch_stat1 {

	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
System.out.println("enter month number");
int month=scanner.nextInt();
month(month);
	}

	public static void month(int month) {
		String monthstring="";
		switch (month) {
		case 1:
			monthstring = "january";
			break;
		case 2:
			monthstring = "febrauary";
			break;
		case 3:
			monthstring = "march";
			break;
		case 4:
			monthstring = "april";
			break;
		case 5:
			monthstring = "may";
			break;
		case 6:
			monthstring = "June";
			break;
		case 7:
			monthstring = "July";
			break;
		case 8:
			monthstring = "August";
			break;
		case 9:
			monthstring = "September";
			break;
		case 10:
			monthstring = "october";
			break;
		case 11:
			monthstring = "november";
			break;
		case 12:
			monthstring = "december";
			break;
			
		default:System.out.println("Invalid Month!"); 	

		}
		System.out.println(monthstring);
	}

}
