
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai = 0;
        int total = 0;
        int tinggi = 0;
        int rendah = 100;

        // System.out.println("SELAMAT DATANG DI SISTEM DOSEN");
        System.out.print("Berapa banyak mahasiswa anda? ");
        int mhs = sc.nextInt();

        System.out.println();

        int[] arrnilai = new int[mhs];

        for (int i = 0; i < mhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            nilai = sc.nextInt();
            arrnilai[i] = nilai;
            total += nilai;
        }

        double rata = total/arrnilai.length;

        for (int a : arrnilai) {
            if(a <= 100 && a >= 0){
                if(a > tinggi){
                    tinggi = a;
                }
                else if (a < rendah){
                    rendah = a;
                }
            }
        }

        System.out.println();

        for (int b = 0; b < arrnilai.length; b++) {
            System.out.println("Nilai mahasiswa ke-"+ b+ " adalah "+ arrnilai[b]);
        }

        System.out.println();

        System.out.println("Rata-rata nilai adalah "+ rata);
        System.out.println("Nilai tertinggi adalah "+ tinggi);
        System.out.println("Nilai terendah adalah " + rendah);
    }
}
