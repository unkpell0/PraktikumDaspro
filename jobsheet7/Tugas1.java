import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tiket = 50_000;
        int totaltiketharian = 0;
        double totalpenjualanharian = 0.0;
        int jumlahtiket;

        System.out.println("===== PROGRAM KASIR BIOSKOP =====");
        System.out.println("Harga tiket per orang: Rp " + tiket);
        System.out.println("----------------------------------");

        do { 
            System.out.println("\n Masukkan jumlah tiket (ketik 0 untuk tutup kasir): ");
            jumlahtiket = sc.nextInt();

            if (jumlahtiket < 0){
                System.out.println("Jumlah tidak valid! Input harus angka positif.");
                continue; 
            }

            if (jumlahtiket > 0){
                // Hitung harga awal 
                double hargaAwal = jumlahtiket * tiket;
                double diskon = 0.0;
                double hargaFinal;

                // Tentukan diskon
                if (jumlahtiket > 10){
                    diskon = 0.15;
                    System.out.println("Selamat! Anda mendapatkan diskon 15%.");
                } else if (jumlahtiket > 4) {
                    diskon = 0.10;
                    System.out.println("Selamat! Anda mendapatkan diskon 10%.");
                } else {
                    System.out.println("Maaf, Anda tidak mendapatkan diskon.");
                }

                // HItung harga final dan tampilkan
                hargaFinal = hargaAwal - hargaAwal * diskon;
                System.out.println("Total bayar: Rp "+ hargaFinal);

                // Akumulasi (catat di buku harian)
                totaltiketharian += jumlahtiket;
                totalpenjualanharian += hargaFinal;
            }
        } while (jumlahtiket != 0);

        System.out.println("\n=== Laporan Penjualan Harian ===");
        System.out.println("Total tiket terjual: " + totaltiketharian);
        System.out.println("Total pendapatan: Rp " + totalpenjualanharian);

        sc.close();
    }
}
