import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int toplam,turk,mat,fizik,kimya,tarih,muzik;
        double ort;

        System.out.print("Lütfen türkçe notunuzu giriniz:");
        turk = input.nextInt();
        System.out.print("Lütfen matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.print("Lütfen fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.print("Lütfen kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.print("Lütfen tarih notunuzu giriniz:");
        tarih = input.nextInt();
        System.out.println("Lütfen müzik notunuzu giriniz:");
        muzik = input.nextInt();

        toplam = turk+mat+fizik+kimya+tarih+muzik;
        ort = (double) toplam / 6;

        System.out.println("Ortalamanız: " + ort);

        String sonuc = (ort>60)? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Cikti: " + sonuc);
    }
}

