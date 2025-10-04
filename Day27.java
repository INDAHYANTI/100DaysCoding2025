public class TukarNilai {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

      
        a = b;        
        b = a;     
        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
