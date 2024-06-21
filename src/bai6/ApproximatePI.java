package bai6;

import java.util.Scanner;

public class ApproximatePI {
	public static double calculatePi(double terms) {
		double pi = 0.0;
		for(int i=0; i< terms; i++) {
			if(i%2==0) {
				pi+=4.0/(2*i+1);
			}else {
				pi-=4.0/(2*i+1);
			}
		}
		return pi;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so ma ban muon nhap: ");
	    int terms = sc.nextInt();

	    double pi = calculatePi(terms);
	    System.out.printf("Gia tri xap xi của PI voi %d phan tu la: %.6f%n", terms, pi);

	    sc.close();
		
	}
}

//
