
import java.util.Scanner;

public class Kafe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON50");

        int totalSemua = 0;
        String lanjut = "y";

        do { 
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
    
            System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
    
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, "Diskon50");

            totalSemua += totalHarga;
            
            System.out.println("Total harga untuk pesanan ini: Rp" + totalHarga);

            System.out.println("\nApakah anda ingin memesan menu lain? (y/n)");
            lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\n-----------------------------------------------");
        System.out.println("Total keseluruhan yang harus dibayar: Rp" + totalSemua);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("Status Kode Promo:");

        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Berikan diskon 50%\n");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Berikan diskon 30%\n");
        } else{
            System.out.println("Tampilkan kode invalid\n");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Diskon 50% berhasil dipakai\n");
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Diskon 30%\n");
            hargaTotal = (int)(hargaTotal * 0.7);
        } else{
            System.out.println("Kode promo invalid, tidak ada pengurangan harga.\n");
        }

        return hargaTotal;
    }
}
