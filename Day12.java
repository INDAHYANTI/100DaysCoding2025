
package biodatasederhana;

    import java.util.Scanner; 
public class Day12.java {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Nama      : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM       : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Jurusan   : ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Fakultas  : ");
        String fakultas = input.nextLine();

        System.out.print("Masukkan Umur      : ");
        int umur = input.nextInt();

        // Output data biodata
        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Umur     : " + umur + " tahun");
    }
}
