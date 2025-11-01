
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // int i = 1;
        // while (i <= n) {
        //     int j = 1;
        //     while (j <= n) {
        //         System.out.print(n + " ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1|| j == n){
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
