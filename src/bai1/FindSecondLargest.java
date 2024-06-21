package bai1;

import java.util.Arrays;
import java.util.Scanner;

//Tim phan tu lon thu 2 trong mang cach duyet 1 mang
public class FindSecondLargest {
	
	public static void print2Largest(int[] arr, int arr_size) {
		int i;
//		int first, second;
//		
//		if(arr_size < 2) {
//			System.out.println("Khong hop le");
//			return;
//		}
		

		//cach 2 sap xep
		Arrays.sort(arr);
		for(i = arr_size - 2; i>=0 ; i--) {
			if(arr[i] < arr[arr_size - 1]) {
				System.out.print("Phan tu lon thu 2 trong mang: " +arr[i]);
				return;
			}
		}
		System.out.printf("Không tồn tại phần tử lớn thứ 2");
//		
//		first = second = Integer.MIN_VALUE;
//		
//		for(i = 0; i<arr_size ; i++) {
//			if(arr[i] > first) {
//				second = first;
//				first = arr[i];
//			}else if(arr[i] < first && arr[i] > second) {
//				second = arr[i];
//			}
//		}
//		if(second == Integer.MIN_VALUE) {
//			System.out.print("khong ton tai phan tu lon thu 2 trong mang");
//		}else {
//			System.out.print("Phan tu lon thu 2 trong mang la: " +second);
//		}
				
	}

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = sc.nextInt();
		
		if(n<2) {
			System.out.print("Vui long nhap lai:");
			return;
		}

        // Khởi tạo mảng với kích thước n
		int[] arr = new int[n];
		System.out.print("Nhap cac phan tu cua mang: ");
		
		// Sử dụng arr.length để lặp qua các phần tử của mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Gọi phương thức print2Largest để tìm phần tử lớn thứ hai
        print2Largest(arr, n);

        sc.close();
	}
}
