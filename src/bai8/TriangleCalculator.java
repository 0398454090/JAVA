package bai8;

import java.util.Scanner;

public class TriangleCalculator {
	// Hàm tính chu vi tam giác
	public static double pTamGiac(double a, double b, double c) {
		return a + b + c;
	}

	// Hàm tính diện tích tam giác bằng công thức Heron
	public static double sTamGiac(double a, double b, double c) {
		double s = (a + b + c) / 2.0;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập ba cạnh của tam giác
		System.out.print("Nhap canh thu nhat: ");
		double a = sc.nextDouble();
		System.out.print("Nhap canh thu hai: ");
		double b = sc.nextDouble();
		System.out.print("Nhap canh thu ba: ");
		double c = sc.nextDouble();

		double chuVi = pTamGiac(a, b, c);
		double dienTich = sTamGiac(a, b, c);

		System.out.printf("Chu vi tam giac la: %.3f\n", +chuVi);

		System.out.printf("Dien tich tam giac la: %.3f", +dienTich);

	}
}
