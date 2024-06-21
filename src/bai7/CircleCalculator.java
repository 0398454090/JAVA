package bai7;

public class CircleCalculator {
	//Tinh chu vi hinh tron
	public static double  chuViHinhTron(double radius) {
		if(radius <=0 ) {
			System.out.print("Khong hop le, vui long nhap lai:" );
		}
		
		return 2*Math.PI*radius;
	}
	//Tinh dien tich hinh tron
	public static double  sHinhTron(double radius) {
		if(radius <=0 ) {
			System.out.print("Khong hop le, vui long nhap lai:" );
		}			
		
		return Math.PI*radius*radius;	
	}
	
	public static void main(String[] args) {
		double radius = 1.0; // Bán kính của hình tròn

	    // Tính và in ra chu vi của hình tròn
	    double pHinhTron = chuViHinhTron(radius);  
	    System.out.printf("Chu vi hinh tron la: %.3f%n",+ pHinhTron);
	    // Tính và in ra diện tích của hình tròn
	    double sTron = sHinhTron(radius);
	    System.out.printf("Dien tich hinh tron la: %.3f%n",+ sTron);
	}
}
