package com.dailyCoding;

import java.util.Scanner;

public class Weclome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		while (true) {
			System.out.println("1 display ");
			System.out.println("2 insert");
			System.out.println("3 upadte");
			System.out.println("4 delete");
			System.out.println("Enter any choice");
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				CP c = new CP();
				c.fetch();
			}break;
			
			case 2: {
				CP c = new CP();
				c.insert();
			}break;
			default: {
				System.out.println("Invalid choice");
			}
			}
			CP c = new CP();
		}
	}

}
