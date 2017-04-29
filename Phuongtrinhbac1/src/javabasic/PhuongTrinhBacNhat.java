package javabasic;

import java.util.Scanner;

public class PhuongTrinhBacNhat {

	public static void main(String[] args) {
		float a, b;
		Scanner nhapLieu = new Scanner (System.in);
		System.out.print("moi nhap he so a: ");
		a = nhapLieu.nextFloat();
		System.out.print("moi nhap he so b: ");
		b = nhapLieu.nextFloat();
		if(a == 0){
			if(b == 0){
				System.out.println("Phuong trinh vo so nghiem");
			}
			else{
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else{
			System.out.println("Phuong trinh co nghiem la x = "+ (-b/a));
		}
	}

}
