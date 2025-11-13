
import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaimhs = 0;
        int key = 0;
        int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int nilai = sc.nextInt();

        int[] arrNilai = new int[nilai];
        for (int i = 0; i < nilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaimhs = sc.nextInt();
            arrNilai[i] = nilaimhs;
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]){
                hasil = i + 1;
                System.out.println("Nilai "+ key+" ketemu, merupakan nilai mahasiswa ke-"+ hasil);
                break;
            } else {
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;
            }
        }

    }
}
