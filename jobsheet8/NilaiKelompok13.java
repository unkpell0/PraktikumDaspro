
import java.util.Scanner;

public class NilaiKelompok13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilai;
        double totalNilai, rataNilai;
        double ratatertinggi = 0.0;
        int keltertinggi = 0;

        for (i=1; i <= 6; i++){
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            j = 1;

            while (j <= 5) { 
                System.out.print("  Nilai dari kelompok penilai "+ j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
                j++;
            }
            rataNilai = totalNilai / 5;

            System.out.println("Rata-rata nilai: "+ rataNilai +"\n");

            if(ratatertinggi < rataNilai){
                ratatertinggi = rataNilai;
                keltertinggi = i;
            }
        }

        System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok: "+ keltertinggi);
        System.out.println("dengan rata rata: " + ratatertinggi);
    }
}
