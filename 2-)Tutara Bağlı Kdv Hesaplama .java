import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        double tutar,kdv,kdvli;

        System.out.print("Ürünün tutarını giriniz:");
        tutar = input.nextDouble();

        kdv = (tutar<1000)? 0.18 : 0.08;
        System.out.println("Kdv oranı: " + kdv);

        System.out.println("Ürünün kdvsiz tutarı: " +tutar);
        System.out.println("Ürünün kdv tutarı: " +(tutar*kdv));
        System.out.println("Ürünün kdvli tutarı: " +(tutar+(tutar*kdv)));
    }
}
