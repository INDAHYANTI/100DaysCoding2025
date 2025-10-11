public class day034 {
    public static void main(String[] args) {
        System.out.println("=== Mengkombinasikan Berbagai Operator ===");
        System.out.println("=== Mengecek Boleh Mengemudi ===");

        int umurSekarang = 16;
        int tambahanTahun = 2;
        int umur = umurSekarang + tambahanTahun; 

        int batasUmur = 18;

        boolean punyaSIM = false;
        boolean lulusTes = true;

        
        boolean bolehMengemudi = ((umur >= batasUmur) && (punyaSIM || lulusTes));

        System.out.println("Umur sekarang: " + umurSekarang);
        System.out.println("Tambahan tahun: " + tambahanTahun);
        System.out.println("Umur setelah " + tambahanTahun + " tahun: " + umur);
        System.out.println("Punya SIM: " + punyaSIM);
        System.out.println("Lulus tes mengemudi: " + lulusTes);
        System.out.println("Boleh mengemudi: " + bolehMengemudi);
    }
}
