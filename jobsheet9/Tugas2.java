
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxPesanan = 20;

        System.out.println("=== SELAMAT DATANG DI KAFEKU ===");
        System.out.println("---------------------------------");

        String[] arrmenu = new String[maxPesanan];
        int[] arrharga = new int[maxPesanan];

        int jumlahPesanan = 0;
        boolean lanjutPesan = true;

        while(lanjutPesan){
            System.out.println("Menu Pilihan:");
            System.out.println("1. Nasi Goreng (Rp 13.000)");
            System.out.println("2. Mie Goreng (Rp 10.000)");
            System.out.println("3. Es Teh (Rp 4.000)");
            System.out.println("4. Es Jeruk (Rp 5.000)");
            System.out.println("99. Selesai Memesan\n");

            System.out.print("Pilih menu (masukkan angka) ");
            int pilihan = sc.nextInt();

            if (jumlahPesanan >= maxPesanan){
                System.out.println("Maaf keranjang pesanan penuh!");
                break;
            }

            switch (pilihan){
                case 1:
                    arrmenu[jumlahPesanan] = "Nasi Goreng";
                    arrharga[jumlahPesanan] = 13_000;
                    System.out.println("-> Nasi Goreng masuk keranjang.");
                    jumlahPesanan++; // Geser ke kotak array berikutnya
                    break;
                case 2:
                    arrmenu[jumlahPesanan] = "Mie Goreng";
                    arrharga[jumlahPesanan] = 10_000;
                    System.out.println("-> Mie Goreng masuk keranjang");
                    jumlahPesanan++;
                    break;
                case 3:
                    arrmenu[jumlahPesanan] = "Es Teh";
                    arrharga[jumlahPesanan] = 4_000;
                    System.out.println("-> Es Teh masuk keranjang");
                    jumlahPesanan++;
                    break;
                case 4:
                    arrmenu[jumlahPesanan] = "Es Jeruk";
                    arrharga[jumlahPesanan] = 5_000;
                    System.out.println("-> Es Jeruk masuk keranjang");
                    jumlahPesanan++;
                    break;
                case 99:
                    lanjutPesan = false;
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }

            if (lanjutPesan){
                System.out.println("Ingin pesan lagi? (y/t): ");
                String jawab = sc.next();
                if (jawab.equalsIgnoreCase("t")){
                    lanjutPesan = false;
                }
            }
        }

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++){
            System.out.println((i + 1) + ". " + arrmenu[i] + " \t: Rp " + arrharga[i]);
            totalBiaya += arrharga[i];
        }

        System.out.println("-------------------------------------");
        System.out.println("Total Item : "+ jumlahPesanan);
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
