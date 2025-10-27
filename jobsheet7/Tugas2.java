
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi; 
        int total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2){
                System.out.print("Masukkan durasi parkir (dalam jam) ");
                durasi = sc.nextInt();

                if (durasi <= 0){
                    System.out.println("input durasi invalid!");
                    continue;
                }

                int biaya = 0;
                
                if (durasi > 5){
                    biaya = 12500;
                } else if (jenis == 1){
                    biaya = durasi * 3000;
                } else if (jenis == 2){
                    biaya = durasi * 2000;
                } 

                System.out.println("Biaya untuk transaksi ini: Rp " + biaya);
                total += biaya;
                
            } else if (jenis == 0){
                System.out.println("Menghitung total pendapatan...");
            } else {
                System.out.println("Input jenis kendaraan tidak vali");
            }
        } while (jenis != 0);

        System.out.println("Total biaya parkir adalah " + total);
    }
}
