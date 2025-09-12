public class Day5.java{
    public static void main(String[] args) {
        // Tipe data bilangan bulat
        byte dataByte = 100;          // -128 s/d 127
        short dataShort = 30000;      // -32.768 s/d 32.767
        int dataInt = 2000000000;     // -2,147,483,648 s/d 2,147,483,647
        long dataLong = 9000000000L;  // -9,223,372,036,854,775,808 s/d 9,223,372,036,854,775,807

        // Menampilkan hasil
        System.out.println("=== Tipe Data Numerik Bilangan Bulat ===");
        System.out.println("byte  : " + dataByte);
        System.out.println("short : " + dataShort);
        System.out.println("int   : " + dataInt);
        System.out.println("long  : " + dataLong);
    }
}
