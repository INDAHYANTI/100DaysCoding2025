import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, harga = 0, gelas;
        String menu = null;

        System.out.println("## Menu Minuman ##");
        System.out.println("1. Es Teh Manis\n2. Kopi Susu\n3. Jus Alpukat");
        System.out.print("Pilih (1, 2, 3): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            menu = "Es Teh Manis";
            harga = 5000;
        } else if (pilihan == 2) {
            menu = "Kopi Susu";
            harga = 12000;
        } else if (pilihan == 3) {
            menu = "Jus Alpukat";
            harga = 15000;
        }

        if (menu == null) {
            System.out.println("Pilihan Salah ");
        } else {
            System.out.print("Jumlah Gelas : ");
            gelas = input.nextInt();

            System.out.println("=====================");
            System.out.println("Menu Dipesan\t: " + menu);
            System.out.printf("Harga\t\t: Rp %,d/gelas", harga);
            harga = harga * gelas;
            System.out.printf("\nTotal Harga\t: Rp %,d\n", harga);
            System.out.println("Terima kasih sudah memesan");
        }

        input.close();
    }
}
