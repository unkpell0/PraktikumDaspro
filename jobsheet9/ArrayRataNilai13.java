
import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totallulus = 0;
        double totaltidak = 0;
        int oranglulus = 0; 
        int orangtidaklulus = 0;
        double ratalulus = 0.0; 
        double ratatidak = 0.0;
        int lulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int mhs = sc.nextInt();
        int[] nilaiMhs = new int[mhs];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70){
                totallulus += nilaiMhs[i];
                oranglulus++;
            } else{
                totaltidak += nilaiMhs[i];
                orangtidaklulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++){
            if(nilaiMhs[i] > 70){
                lulus++;
            } 
        }

        ratalulus = totallulus/oranglulus;
        ratatidak = totaltidak/orangtidaklulus;

        System.out.println("Rata-rata nilai lulus = "+ ratalulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ ratatidak);
    }
}
