import java.util.Scanner;
public class day038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu (°C): ");
        int suhu = input.nextInt();

        if (suhu > 30) {
            System.out.println("Panas");
        } else if (suhu >= 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Dingin");
        }
    }
}
