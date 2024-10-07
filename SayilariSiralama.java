package Java101;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        
        Scanner veri = new Scanner(System.in);
        int sayi,sayi2,sayi3;
        
        System.out.print("1. sayıyı girin:");
        sayi = veri.nextInt();
        System.out.print("2. sayıyı girin:");
        sayi2 = veri.nextInt();
        System.out.print("3. sayıyı girin:");
        sayi3 = veri.nextInt();
        
        if(sayi<sayi2 && sayi<sayi3){
            if(sayi2<=sayi3){
                System.out.println("sayi3 > sayi2 > sayi");
            }else{
                System.out.println("sayi2 > sayi3 > sayi");
            }
        }else if(sayi2<sayi && sayi2<sayi3){
            if(sayi<=sayi3){
                System.out.println("sayi3 > sayi > sayi2");
            }else{
                System.out.println("sayi > sayi3 > sayi2");
            }
        }else{
            if(sayi2<=sayi){
                System.out.println("sayi > sayi2 > sayi3");
            }else{
                System.out.println("sayi2 > sayi > sayi3");
            }
        }
    }  
}
