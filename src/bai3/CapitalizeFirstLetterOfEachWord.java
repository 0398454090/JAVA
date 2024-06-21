package bai3;

import java.util.Scanner;
//Viet ham in hoa ki tu dau tien cua moi tu
public class CapitalizeFirstLetterOfEachWord {
	public static String capitalizeFirstLetterOfEachWord(String str) {
		if(str == null || str.isEmpty()) {
			System.out.print("Chuoi rong hoac null");
		}
		
		String[] worlds = str.split("\\s+");
		
		for(int i = 0; i<worlds.length; i++) {
			if(worlds[i].length() > 0) {
				worlds[i] = worlds[i].substring(0,1).toUpperCase() + worlds[i].substring(1).toLowerCase();
			}
		}
		
		return String.join(" ", worlds);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi ki tu: ");
		String input = sc.nextLine();
		
		String InHoaChuCaiDau = capitalizeFirstLetterOfEachWord(input);
		System.out.print("In hoa chu cai dau tien cua chuoi: " +InHoaChuCaiDau);
		sc.close();
	}
}
