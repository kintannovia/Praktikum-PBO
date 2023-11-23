package praktikum1;
import java.util.Scanner;

public class Latihan {
	public static void main (String args[]) {
		
//		Inisialisasi Variabel
		int angka1, angka2, hasil;
//		Inisialisasi input user
		Scanner input = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("Program Tambah Angka: ");
		System.out.println("===============================");
		
//		Inputan user
		System.out.print("\nMasukkan Angka 1: ");
		angka1 = input.nextInt();

		System.out.print("Masukkan Angka 2: ");
		angka2 = input.nextInt();
//		Hasil inputan
		hasil = angka1 + angka2;
		System.out.println("Hasil penjumlahan: " + hasil);
		
		System.out.println("");
		
		System.out.println("===============================");
		System.out.println("Program Input Nama: ");
		System.out.println("===============================");
		
		String namaDepan, namaBelakang, fullName;
		
		System.out.print("\nMasukkan Nama Depan: ");
		namaDepan = input.next();
		
		System.out.print("Masukkan Nama Belakang: ");
		namaBelakang = input.next();
		
		fullName = namaDepan + " " + namaBelakang;
		System.out.println(fullName);
	}
}
