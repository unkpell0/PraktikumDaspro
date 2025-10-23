
import java.util.Scanner;

public class SiakadFor13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidaklulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai >= 0 && nilai <= 100) {
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }

                if (nilai >= 60) {
                    lulus += 1;
                } else {
                    tidaklulus += 1;
                }
            } else {
                System.out.println("Nilai tidak valid");
                i--;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("lulus: " + lulus);
        System.out.println("tidaklulus: " + tidaklulus);
    }
}
