
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variable
        int n, total, kuadrat;
        String textOutput;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        System.out.println("------------------------");

        for (int i = 1; i <= n; i++) {
            total = 0;
            textOutput = "";

            for (int j = 1; j <= i; j++) {
                kuadrat = (int) Math.pow(j, 2);
                total += kuadrat;

                if (j == 1) {
                    // Jika ini angka pertama, jangan pakai " + "
                    textOutput = "" + kuadrat;
                } else {
                    textOutput = textOutput + " + " + kuadrat;
                }
            }

            if (i == 1) {
                System.out.println("n = " + i + " -> jumlah kuadrat = " + total);
            } else {
                System.out.println("n = " + i + " -> jumlah kuadrat = " + textOutput + " = " + total);
            }
        }
    }
}
