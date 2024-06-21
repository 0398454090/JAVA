package bai4;

import java.util.Scanner;

//Phương thức chuyển đổi từ độ Fahrenheit sang độ Celsius
public class ChangeCelius {
	public static double changeCelius(double fahrenheit) {
		double celius = (fahrenheit - 32)*(5.0/9);
		return celius;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 'F muon chuyen doi ");
		
		double fahrenheit = sc.nextDouble();
		
		double ccelius = changeCelius(fahrenheit);
		System.out.printf("Ket qua chuyen doi sang 'C la: %.2f", +ccelius);
	}
}
