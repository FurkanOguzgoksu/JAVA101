import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik,toplam=0;
        double ort;

        Scanner veri = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = veri.nextInt();

        if(0<=mat && mat<=100){
            toplam += mat;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = veri.nextInt();

        if(0<=fizik && fizik<=100){
            toplam += fizik;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = veri.nextInt();

        if(0<=kimya && kimya<=100){
            toplam += kimya;
        }

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = veri.nextInt();

        if(0<=turkce && turkce<=100){
            toplam += turkce;
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = veri.nextInt();

        if(0<=muzik && muzik<=100){
            toplam += muzik;
        }

        ort=toplam/5;
        if(ort<55){
            System.out.print("Sınıfta kaldınız:(");
        }else{
            System.out.println("Tebrikler,sınıfı geçtiniz.");
        }
        System.out.print("Ortalamanız:"+ort);
    }
}
