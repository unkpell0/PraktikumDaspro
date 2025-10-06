package jobsheet5;

import java.util.Scanner;

public class IzinMasukPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ktm;
        boolean regOnline;

        System.out.println("Apakah anda sudah punya ktm? (true/false)");
        ktm = sc.nextBoolean();

        if (ktm){
            System.out.println("Anda boleh masuk");
        } else {
            System.out.println("Apakah anda sudah registrasi ulang? (true/false)");
            regOnline = sc.nextBoolean();
            if (regOnline){
                System.out.println("Anda boleh masuk");
            } else {
                System.out.println("Anda tidak boleh masuk");
            }
        }
    }
}
