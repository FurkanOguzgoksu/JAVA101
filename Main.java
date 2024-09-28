import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int sayi1,sayi2,secim;

        Scanner veri = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        sayi1 = veri.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        sayi2 = veri.nextInt();

        System.out.print("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme\n->");
        secim = veri.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuç:"+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sonuç:"+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuç:"+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2!=0){
                    System.out.println("Sonuç:"+(sayi1%sayi2));
                }else{
                    System.out.print("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.print("Hatalı secim yaptınız!");
                break;
        }

    }
}