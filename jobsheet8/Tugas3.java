
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== SELAMAT DATANG DI LAPORAN KOPI SENJA =====");
        System.out.println("------------------------------------------------\n");

        System.out.print("Masukkan jumlah cabang kafe: ");
        int cabang = sc.nextInt();

        System.out.println();
        int i = 1;

        int totalpelanggan = 0;
        int totalitem = 0;

        do { 
            System.out.println("--- Cabang "+ i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            totalpelanggan += pelanggan;

            int j = 1;
            while (j <= pelanggan){
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalitem += item;
                j++;
            }

            System.out.println("Cabang " + i + ": ");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: "+ totalitem);
            i++;
            System.out.println();
        } while (i <= cabang);

        System.out.println("Total seluruh cabang: ");
        System.out.println("Pelanggan: " + totalpelanggan);
        System.out.println("Item terjual: " + totalitem + " item");
    }
}
