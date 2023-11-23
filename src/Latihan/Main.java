package Latihan;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	// inisiasi
	int angka1, loop;
	Scanner input1 = new Scanner (System.in);
	Scanner loop_input = new Scanner (System.in);
	
	// data diri
	System.out.println("Nama 	: Kintan Novia");
	System.out.println("Kelas	: Reguler C");
	System.out.println("Prodi	: FTS/TI");
	System.out.println("==========================\n");

	System.out.print("Masukkan Perulangan : ");
	loop = loop_input.nextInt();
	
	// looping function
	for(int i = 1; i <= loop; i++) {
		// input user
		System.out.print("Masukkan Perhitungan yang ingin dilakukan :\n"
				+ "1. Penambahan\n"
				+ "2. Pengurangan\n"
				+ "3. Perkalian\n"
				+ "4. Pembagian\n"
				+ "Masukkan Angka : ");
				angka1 = input1.nextInt();
		
		/*Perhitungan perhitungan = new Perhitungan(hasil);
	
			// pengkondisian
			if (angka1 == 1) {
				penambahan();
			}else if (angka1 == 2) {
				pengurangan();
			}else if (angka1 == 3) {
				perkalian();
			}else if (angka1 == 4) {
				pembagian();
			}else {
				System.out.println("Angka yang anda masukkan Salah");
			}*/
		}
	}
}