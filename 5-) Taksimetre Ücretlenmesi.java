import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        double km,toplam=0,km_ucret = 2.20;
        int baslangic=10;

        Scanner veri = new Scanner ( System.in);

        System.out.print("Gidilen mesafeyi km cinsinden giriniz: ");
        km = veri.nextDouble();

        toplam = baslangic+(km * km_ucret);
        toplam = (toplam<20)? 20 : toplam;

        System.out.println("Ödenecek tutar: " +toplam);
    }
}
