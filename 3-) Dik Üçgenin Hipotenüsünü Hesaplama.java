import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner veri = new Scanner(System.in);

        System.out.print("Hipotenüsü hesaplanacak dik üçgenin 1. kenarını giriniz:");
        a = veri.nextInt();
        System.out.print("Hipotenüsü hesaplanacak dik üçgenin 2. kenarını giriniz:");
        b = veri.nextInt();

        c = Math.sqrt(a*a+b*b);

        System.out.println("Dik üçgenin hipotenüsü: " +c );
    }
}
