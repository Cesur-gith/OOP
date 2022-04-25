package day08_ifElseifStatement;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {

    public static void main(String[] args) {



/*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin. 50’den kucukse
        “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
*/

        //50 den kucukse "D"
        //50 <60 arasi is "B"



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double notSayi = scan.nextDouble();  //Not oldugu icin 'double' kullanilir

        if (notSayi<0 || notSayi > 100){
            System.out.println("Lutfen bir gecerli sayi giriniz");
        }
        if (notSayi<50){
            System.out.println("Notunuz D");
        }else if (notSayi>=50 && notSayi<60){
            System.out.println("Notunuz C");
        }else if (notSayi>=60 && notSayi<80){
            System.out.println("Notunu B");
        }else {
            System.out.println("Notunuz A");
        }




    }
}
