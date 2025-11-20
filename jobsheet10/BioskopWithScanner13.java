
import java.util.Scanner;

public class BioskopWithScanner13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = 0, kolom = 0;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3) ");

            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                                if (penonton[baris - 1][kolom - 1] == null) {
                                    penonton[baris - 1][kolom - 1] = nama;
                                    System.out.println("Data disimpan");
                                } else {
                                    System.out.println("Maaf, kursi tersebut sudah terisi! Pilih kursi lain.");
                                }
                            } else {
                                System.out.println("Baris atau kolom tidak tersedia! Harap input ulang.");
                            }

                            System.out.print("Input penonton lainnya? (y/n) ");
                            next = sc.nextLine();
                            
                    } while (next.equalsIgnoreCase("y"));
                    break;

                case 2:
                    System.out.println("---  DAFTAR PENONTON ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris ke-" + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            String tampil = penonton[i][j];
                            if (tampil == null) {
                                tampil = "|***|";
                            }
                            System.out.print(tampil + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih. Program berhenti.");
                    return;

                default:
                    System.out.println("Menu tidak valid. Silahka pilih 1, 2, atau 3.");
            }

            System.out.println();
        }
    }
}
