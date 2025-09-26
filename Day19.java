public class Main {
    public static void main(String[] args) {
        int besar = 130;
        byte kecil = (byte) besar;  // Konversi paksa dari int ke byte

        System.out.println("Nilai besar: " + besar);
        System.out.println("Nilai kecil setelah konversi: " + kecil);  // Bisa overflow
    }
}
