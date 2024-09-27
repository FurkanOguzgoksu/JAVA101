import java.util.Scanner;

public class Main{
    public static void main (String[] args) {

        double armut,armut_kilo = 2.14;
        double elma,elma_kilo = 3.67;
        double domates,domates_kilo = 1.11;
        double muz,muz_kilo = 0.95;
        double pat,patlican_kilo = 5.0;
        double toplam=0.0;

        Scanner veri = new Scanner(System.in);

        System.out.print("Kaç kilogram armut aldınız?->");
        armut = veri.nextDouble();
        System.out.print("Kaç kilogram elma aldınız?->");
        elma = veri.nextDouble();
        System.out.print("Kaç kilogram domates aldınız?->");
        domates = veri.nextDouble();
        System.out.print("Kaç kilogram muz aldınız?->");
        muz = veri.nextDouble();
        System.out.print("Kaç kilogram patlıcan aldınız?->");
        pat = veri.nextDouble();

        toplam = armut*armut_kilo + elma*elma_kilo + domates*domates_kilo + muz*muz_kilo + pat*patlican_kilo;
        System.out.println("Toplam tutar: "+toplam +" TL");
    }
}
