import java.util.Scanner;

public class RekapPenjualanCafe13 {
    
    // Variabel Global (agar bisa diakses semua fungsi)
    static Scanner sc = new Scanner(System.in);
    static int[][] dataPenjualan; // Array 2D untuk menyimpan angka penjualan
    static String[] namaMenu;      // Array 1D untuk menyimpan nama menu
    static int jumlahMenu;
    static int jumlahHari;

    public static void main(String[] args) {
        // Pemanggilan fungsi sesuai urutan yang diminta soal
        inputDataPenjualan();
        tampilkanDataPenjualan();
        menuPenjualanTertinggi();
        rataRataPenjualan();
    }

    // 1. Fungsi Input Data (Modifikasi Soal B: Input jumlah menu & hari)
    static void inputDataPenjualan() {
        System.out.println("=== INPUT DATA PENJUALAN KAFE ===");
        
        // a. Menentukan ukuran array (Dinamis)
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer enter

        // b. Inisialisasi Array
        namaMenu = new String[jumlahMenu];
        dataPenjualan = new int[jumlahMenu][jumlahHari];

        // c. Input Nama Menu
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        // d. Input Data Penjualan (Nested Loop)
        System.out.println("\n--- Isi Data Penjualan ---");
        for (int i = 0; i < jumlahMenu; i++) { // Loop Baris (Menu)
            System.out.println("Input penjualan untuk " + namaMenu[i] + ":");
            for (int j = 0; j < jumlahHari; j++) { // Loop Kolom (Hari)
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
    }

    // 2. Fungsi Menampilkan Tabel
    static void tampilkanDataPenjualan() {
        System.out.println("\n=== REKAP DATA PENJUALAN ===");
        
        // Cetak Header Hari
        System.out.print("Menu\t\t"); // Tab ganda biar rapi
        for (int j = 0; j < jumlahHari; j++) {
            System.out.print("H-" + (j + 1) + "\t");
        }
        System.out.println();

        // Cetak Isi Tabel
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(namaMenu[i] + "\t\t"); // Cetak nama menu
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(dataPenjualan[i][j] + "\t"); // Cetak angka
            }
            System.out.println();
        }
    }

    // 3. Fungsi Menu Tertinggi (Total seminggu)
    static void menuPenjualanTertinggi() {
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        
        int maxPenjualan = -1;
        int indexMenuTerlaris = -1;

        for (int i = 0; i < jumlahMenu; i++) {
            int totalPerMenu = 0;
            // Hitung total satu baris (satu menu)
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }

            // Cek apakah ini rekor baru?
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                indexMenuTerlaris = i;
            }
        }

        System.out.println("Menu Terlaris: " + namaMenu[indexMenuTerlaris]);
        System.out.println("Total Terjual: " + maxPenjualan);
    }

    // 4. Fungsi Rata-rata Penjualan
    static void rataRataPenjualan() {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        
        for (int i = 0; i < jumlahMenu; i++) {
            double totalPerMenu = 0;
            
            // Hitung total dulu
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
            
            // Bagi dengan jumlah hari
            double rataRata = totalPerMenu / jumlahHari;
            System.out.printf("%s: %.2f\n", namaMenu[i], rataRata);
        }
    }
}