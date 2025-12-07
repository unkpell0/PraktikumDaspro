import java.util.Scanner;

public class NilaiMahasiswa13 {

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // - Membaca nilai N (jumlah mahasiswa)
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        // - Membuat array dengan ukuran N
        int[] nilaiMahasiswa = new int[N];

        // - Memanggil fungsi isianArray, tampilArray, dan hitTot
        System.out.println("\n--- Input Data ---");
        isianArray(nilaiMahasiswa, sc);

        System.out.println("\n--- Daftar Nilai ---");
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);

        // - Menampilkan total nilai yang dikembalikan
        System.out.println("\n---------------------------");
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        
        // Membersihkan scanner
        sc.close();
    }

    // a. Fungsi isianArray
    // Menerima array kosong dan Scanner, lalu mengisinya dengan input user
    static void isianArray(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    // b. Fungsi tampilArray
    // Menerima array nilai, lalu menampilkannya ke layar
    static void tampilArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + array[i]);
        }
    }

    // c. Fungsi hitTot
    // Menerima array nilai, menghitung total, dan mengembalikannya (return)
    static int hitTot(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai; // Menjumlahkan setiap elemen array
        }
        return total;
    }
}