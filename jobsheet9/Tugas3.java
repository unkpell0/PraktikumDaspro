
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String pilihan;
        int indexmenu;

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Selamat datang kembali di KAFEKU");
        System.out.println("===========================================");
        System.out.println("Menu Tersedia: Nasi Goreng, Mie Goreng, Roti Bakar, Kentang Goreng, Teh Tarik, Cappucino, Chocolate Ice");

        System.out.print("Pilih menu yang anda mau pesan: ");
        String makanan = sc.nextLine();

        boolean ditemukan = false;
        int indexDitemukan = -1; // Opsional, untuk menyimpan lokasi index

        for (int i = 0; i < menu.length; i++){
            if(makanan.equalsIgnoreCase(menu[i])){
                ditemukan = true;
                indexDitemukan = i;
                makanan = menu[i];
                break;
            }
        }

        System.out.println();
        if(ditemukan){
            System.out.println("Makanan \"" + makanan + "\" tersedia di menu.");
            System.out.println("Item ini berada di indeks ke-" + indexDitemukan);
        } else{
            System.out.println("Maaf, makanan\"" + makanan +"\" tidak ada di menu kami.");
        }
    }
}
