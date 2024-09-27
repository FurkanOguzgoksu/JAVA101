import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double yaricap,pi=3.14,alfa,cevre,alan;

        Scanner veri = new Scanner (System.in);

        System.out.print("Dairenin yaricapini giriniz: ");
        yaricap = veri.nextDouble();

        System.out.print("Daire diliminin merkez açı ölçüsünü giriniz: ");
        alfa = veri.nextDouble();

        cevre = (alfa==360)? 2*pi*yaricap : ((2*pi*yaricap*alfa/360)+2*yaricap);
        alan = pi*yaricap*yaricap*alfa/360;

        System.out.println("Dairenin cevre: "+cevre);
        System.out.println("Dairenin alan: "+alan);
    }
}