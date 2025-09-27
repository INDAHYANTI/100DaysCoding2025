public class KonversiPrimitifKeString {
    public static void main(String[] args) {
        int angka = 123;
        double desimal = 45.67;
        boolean status = true;
        char karakter = 'A';

        // Mengubah ke String
        String strAngka = String.valueOf(angka);
        String strDesimal = String.valueOf(desimal);
        String strStatus = String.valueOf(status);
        String strKarakter = String.valueOf(karakter);

        // Menampilkan hasil
        System.out.println("int ke String: " + strAngka);
        System.out.println("double ke String: " + strDesimal);
        System.out.println("boolean ke String: " + strStatus);
        System.out.println("char ke String: " + strKarakter);
    }
}
