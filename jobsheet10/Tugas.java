import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] respon = new int[10][6];
        String[] soal = {
            "Apakah pelayanan yang diberikan sudah sesuai",
            "Apakah pelayanan yang diberikan tepat waktu",
            "Apakah fasilitas yang disediakan memadai",
            "Apakah petugas bersikap ramah dan sopan",
            "Apakah harga sebanding dengan kualitas",
            "Apakah Anda akan merekomendasikan kami"
        };

        System.out.println("=== Survei Kepuasan Pelanggan ===");
        System.out.println("Jawab dengan menyebutkan nilai dengan rentang 1-5\n");

        for (int i = 0; i < respon.length; i++) {
            System.out.println("Responder ke-"+(i+1) + " ---");

            for (int j = 0; j < respon[i].length; j++){
                System.out.print((j+1) + ". " + soal[j] + "? : ");

                respon[i][j] = (int)(Math.random() * 5) + 1;
            }
            System.out.println();
        }

        System.out.println("Terima kasih! Data seluruh responden telah tersimpan.");

        System.out.println("\n=== DATA HASIL SURVEI ===");

        double totalKeseluruhan = 0;

        System.out.print("Responden\t");
        for (int k = 0; k < soal.length; k++){
            System.out.print("Soal " + (k + 1) + "\t");
        }
        System.out.println("Rata-rata");

        for (int i = 0; i < respon.length; i++){
            System.out.print("Resp " + (i + 1) + "\t\t");

            double totalPerOrang = 0;

            for (int j = 0; j < respon[i].length; j++){
                System.out.print(respon[i][j] + "\t");
                totalPerOrang += respon[i][j];
                totalKeseluruhan += respon[i][j];
            }

            double rataRata = totalPerOrang / respon[i].length;

            System.out.printf("%.2f", rataRata);

            System.out.println();
        }

        System.out.println("------------------------------------------");
        System.out.print("Rata-rata\t");

        for (int j = 0; j < 6; j++){
            double totalPerSoal = 0;

            for (int i = 0; i < respon.length; i++){
                totalPerSoal += respon[i][j];
            }

            double rataSoal = totalPerSoal / respon.length;
            System.out.printf("%.2f\t", rataSoal);
        }
        System.out.println();

        double totalSemua = totalKeseluruhan / (respon.length * respon[0].length);

        System.out.printf("Rata-rata keseluruhan: %.2f", totalSemua);
        System.out.println();
    }
}
