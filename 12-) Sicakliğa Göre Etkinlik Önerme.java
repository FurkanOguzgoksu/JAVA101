package Java101;

import java.util.Scanner;

public class SicaklikEtkinlikOnerme {
    public static void main (String[] args){
        
        int sicaklik;
        Scanner veri = new Scanner(System.in);
        
        System.out.print("Sıcaklık değerini giriniz:");
        sicaklik = veri.nextInt();
        
        if(sicaklik<5){
            System.out.println("Sicaklik değerine en uygun etkinlik 'Kayak'tır...");
        }else if(5<sicaklik && sicaklik<25){
            
            if(5<sicaklik && sicaklik<15){
                System.out.println("Sicaklik değerine en uygun etkinlik 'Sinema'tır...");
            }else{
                System.out.println("Sicaklik değerine en uygun etkinlik 'Piknik'tır...");
            }
            
        }else{
            System.out.println("Sicaklik değerine en uygun etkinlik 'Yüzme'tır...");
        }
    }
    
}
