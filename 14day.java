public class day14.java {
    public static void main(String[] args) {
        // String ke int
        String strInt = "123";
        int angka = Integer.parseInt(strInt);
        System.out.println("String ke int: " + angka);

        // String ke double
        String strDouble = "12.34";
        double pecahan = Double.parseDouble(strDouble);
        System.out.println("String ke double: " + pecahan);

        // String ke boolean
        String strBool = "true";
        boolean nilai = Boolean.parseBoolean(strBool);
        System.out.println("String ke boolean: " + nilai);
    }
}
