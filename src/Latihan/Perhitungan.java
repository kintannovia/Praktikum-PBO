package Latihan;

public class Perhitungan {
	public int angka1, angka2;
	public Perhitungan(int jumlah) {
		angka1 = jumlah;
		angka2 = jumlah;
	}
	public void penambahan (int hasil) {
		angka1 = angka1 + angka2;
	}
	public void pengurangan (int hasil) {
		angka1 = angka1 - angka2;
	}
	public void perkalian (int hasil) {
		angka1 = angka1 * angka2;
	}
	public void pembagian (int hasil) {
		angka1 = angka1 / angka2;
	}
}
