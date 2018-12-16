package basics;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		while loop
		int i = 0; // initialization
		while (i < 11)/* condition */ {
			System.out.print(i + "\t");
			i++; // increment
		}
		System.out.println();

//		do - while loop
		int num;
		do {
			System.out.println("enter a 3 multiple number ");
			num = s.nextInt();
		}while(num % 3 == 0);
		
//		for loop
		for(int a = 10; a > 0; a--) {
			System.out.print(a+"\t");
		}

	}
}
