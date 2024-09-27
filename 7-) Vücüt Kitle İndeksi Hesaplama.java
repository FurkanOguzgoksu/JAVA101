import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        double kilo,boy,vki;
        Scanner veri = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = veri.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        kilo = veri.nextDouble();
        System.out.print("Vücüt Kitle İndeksiniz: " + kilo /(boy * boy));
    }
}
