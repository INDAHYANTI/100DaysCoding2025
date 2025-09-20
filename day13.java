public class Soal4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        
        System.out.println("\nSebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int angka = a;
        a = b;
        b = angka;

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

      
    }
}
