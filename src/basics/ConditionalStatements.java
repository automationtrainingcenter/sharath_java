package basics;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		if 
		System.out.println("enter a number");
		int i = s.nextInt();

		if (i % 2 == 0) {
			System.out.println(i + " is even number");
		}

//		if else
		if (i % 3 == 0) {
			System.out.println("given number is multiple of 3");
		} else {
			System.out.println("given number is not multiple of 3");
		}

//		else if ladder and nested if
		if (i <= 100) {
			if (i >= 70 && i <= 100) {
				System.out.println("destinction");
			} else if (i >= 60 && i < 70) {
				System.out.println("first class");
			} else if (i >= 50 && i < 60) {
				System.out.println("second class");
			} else if (i >= 40 && i < 50) {
				System.out.println("third class");
			} else {
				System.out.println("failed.... better luck next time");
			}
		} else {
			System.out.println("please enter valid marks");
		}

//		switch case
		System.out.println("enter a day");
		String day = s.next();
		switch (day) {
		case "monday":
			System.out.println("monday");
			break;
		case "tuesday":
			System.out.println("tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		case "thursday":
			System.out.println("thursday");
			break;
		case "friday":
			System.out.println("friday");
			break;
		default:
			System.out.println("enter a valid day");
			break;
		}
	}

}
