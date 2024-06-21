package bai2;

import java.util.Scanner;

//Viet ham tim tu dai nhat trong mot chuooi ki tu
public class FindLongestWord {
	
	public static String findLongestWord(String str) {
		if(str == null || str.isEmpty()) {
			System.out.print("Chuoi rong hoac null");
		}
		
		String[] world = str.split("\\s+");
		
		String longest = "";
		
		for(int i = 0; i< world.length; i++) {
			if(world[i].length() > longest.length()) {
				longest = world[i];
			}
		}
		
		return longest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi ky tu: ");
		String input = sc.nextLine();
		
		String longestWord = findLongestWord(input);
	    System.out.println("Tu dai nhat trong chuoi la: " + longestWord);

	    sc.close();
	}
	
}
