public class day034 {
    public static void main(String[] args) {
        System.out.println("=== Mengecek Boleh Mengemudi ===");
        int umur = 18;
        boolean punyaSIM = true;
        boolean bolehMengemudi = (umur >= 18 && punyaSIM == true);
        System.out.println("Boleh mengemudi: " + bolehMengemudi);
    }
}
