import java.util.Scanner;

public class PenggunaWifiGratis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
        int sks;

        System.out.println("WIFI ini hanya bisa dipakai oleh civitas akademika POLINEMA. Siapakah anda? (dosen/mahasiswa)");
        pengguna = sc.next();

        if (pengguna.equalsIgnoreCase("dosen")){
            System.out.println("Akses WIFI diberikan (dosen)");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")){
            System.out.print("Masukkan jumlah sks anda: ");
            sks = sc.nextInt();

            if (sks >= 12){
                System.out.println("Akses WIFI diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak. SKS kurang dari 12");
            }
        }
        else {
            System.out.println("Akses ditolak");
        }
    }
}