package bai5;

import java.util.Scanner;

public class Menu {
	public static void main(String[] arg) {
		System.out.println("Menu");
		System.out.println("-------------------");
		System.out.println("0 Exit\n 1.LonWord\n, 2.SecondMax\n, 3.UperFirstTestTer");
		
		System.out.print("------------------");
		int x;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Moi ban chon lai");
			x = sc.nextInt();
			switch(x) {
			case 1:
				System.out.print("LongWorld (String)");
				break;
			case 2:
				System.out.print("SecondMax (Array)");
				break;
			case 3:
				System.out.print("UperFirstTestTer (String)");
				break;
			default:
				System.out.println("out");
				break;
			}
		}while(x!=0);
	}
}	
