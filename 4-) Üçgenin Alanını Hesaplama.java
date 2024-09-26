import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        int a,b,c;
        double u,alan;

        Scanner veri = new Scanner (System.in);

        System.out.print("Alanı hesaplanacak ucgenin 1.kenarını giriniz:");
        a = veri.nextInt();
        System.out.print("Alanı hesaplanacak ucgenin 2.kenarını giriniz:");
        b = veri.nextInt();
        System.out.print("Alanı hesaplanacak ucgenin 3.kenarını giriniz:");
        c = veri.nextInt();

        u = (a+b+c)/2.0;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ücgenin alanı: " + alan);
    }
}
