package praktikum3;

import java.util.Scanner;
public class Segitiga {
	public static int inputdata() {
		Scanner input = new Scanner(System.in);
		int data;
		System.out.print("Masukkan Angka : ");
		data = input.nextInt();
			return data;
	}
	public static void Segitiga (int ulang) {
		for(int i = 1; 1 <= ulang; i++) {
			for (int j = 1;j <= i; j++) {
				System.out.println(" *");
			}
			System.out.println("");
		}
	}		

	public static void main (String args[]) {
		int ulang = inputdata();
		Segitiga(ulang);
		System.out.println("Tinggi Segitiga = " +ulang);
	}
}