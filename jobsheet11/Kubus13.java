
import java.util.Scanner;

public class Kubus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah rusuk: ");
        int rusuk = sc.nextInt();

        int volume = hitungVol(rusuk);
        System.out.println("Volume kubus tersebut adalah "+ volume);

        int luaspermukaan = hitungLuas(rusuk);
        System.out.println("Luas Permukaan kubus tersebut adalah " + luaspermukaan); 
    }

    static int hitungVol(int rusuk){
        int v = (int)Math.pow(rusuk, 3);
        return v;
    }

    static int hitungLuas(int r){
        int luasP = 6 * (int) Math.pow(r, 2);
        return luasP;
    }
}
