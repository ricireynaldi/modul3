import java.util.Scanner;

/**
 * Program ini menghitung volume sebuah balok berdasarkan panjang, lebar, dan tinggi yang dimasukkan.
 */
public class HitungVolumeBalok {

    /**
     * Metode utama untuk menjalankan program.
     * Meminta input dari pengguna untuk panjang, lebar, dan tinggi balok, dan mencetak volume balok.
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();

        System.out.println("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();

        System.out.println("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        double volume = hitungVolumeBalok(panjang, lebar, tinggi);

        System.out.println("Volume balok adalah: " + volume);
    }

    /**
     * Metode ini menghitung volume balok berdasarkan panjang, lebar, dan tinggi.
     * @param panjang Panjang balok.
     * @param lebar Lebar balok.
     * @param tinggi Tinggi balok.
     * @return Volume balok.
     */
    public static double hitungVolumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }
}
