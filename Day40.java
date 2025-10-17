import java.util.Scanner;

public class Day40{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angka 1: ");
        double a = in.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        char op = in.next().charAt(0);

        System.out.print("Angka 2: ");
        double b = in.nextDouble();

        double hasil = 0;
        if (op == '+') hasil = a + b;
        else if (op == '-') hasil = a - b;
        else if (op == '*') hasil = a * b;
        else if (op == '/') hasil = (b != 0) ? a / b : Double.NaN;
        else System.out.println("Operator salah!");

        if (op == '/' && b == 0)
            System.out.println("Error: Tidak bisa dibagi nol!");
        else if (op == '+' || op == '-' || op == '*' || (op == '/' && b != 0))
            System.out.println("Hasil: " + hasil);
    }
}
