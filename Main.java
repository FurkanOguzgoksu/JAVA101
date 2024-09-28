import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullanıcıAdi, sifre, yeniSifre;
        String dogruKullaniciAdi = "admin"; // Doğru kullanıcı adı
        String dogruSifre = "12345"; // Doğru şifre
        int secim;

        Scanner veri = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullanıcıAdi = veri.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = veri.nextLine();

        // Kullanıcı adı ve şifre kontrolü
        if (kullanıcıAdi.equals(dogruKullaniciAdi)) {
            if (sifre.equals(dogruSifre)) {
                System.out.print("Başarılı bir şekilde giriş yaptınız.");
            } else {
                // Yanlış şifre girildiğinde
                System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (1: Evet / 0: Hayır): ");
                secim = veri.nextInt();
                veri.nextLine(); // Boşluğu temizlemek için kullanılır

                switch (secim) {
                    case 1:
                        System.out.print("Yeni şifrenizi giriniz: ");
                        yeniSifre = veri.nextLine();
                        if (yeniSifre.equals(dogruSifre)) {
                            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        } else {
                            System.out.print("Yeni şifre oluşturuldu.");
                        }
                        break;
                    case 0:
                        System.out.print("Tekrar giriş yapmayı deneyiniz!");
                        break;
                    default:
                        System.out.print("Yanlış seçim!");
                }
            }
        } else {
            // Yanlış kullanıcı adı girildiğinde
            System.out.print("Kullanıcı adı yanlış!");
        }
    }
}
