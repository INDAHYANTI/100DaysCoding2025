import java.util.*;
public class day39 {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    System.out.print("1.Es Teh(5000) 2.Kopi(12000) 3.Alpukat(15000)\nPilih: ");
    int p=in.nextInt(),h=(p==1)?5000:(p==2)?12000:(p==3)?15000:0;
    if(h==0) System.out.println("Salah!");
    else {System.out.print("Jumlah: ");int g=in.nextInt();System.out.println("Total: Rp"+(h*g));}
  }
}
