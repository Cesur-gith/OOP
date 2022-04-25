package day08_ifElseifStatement;

import java.util.Scanner;

public class C04_Emeklilik {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz"  + "\nKadin icin K \nerkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);  //charAt den sonra .method gelmiyor cunku Primitive data oldugu icin method gelmez

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet== 'K'){// Bu bolgede kadinlar girer

            //Surdaki kodlar kodlar yasla ilgili kadinsa gecerli
            if (yas<0 || yas>120) { // Yasla ilgili bolge
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println("emeli olamazsin \nDaha "+ (60-yas) + "yil calisman gerekiyor");
            }else {
                System.out.println("emekli olabilirsin");
            }

        }else if (cinsiyet == 'E'){// Bu bolgede erkekler girer

            //Surdaki kodlar yasla ilgili erkeler icin  gecerli
            if (yas<0 || yas>120) { // Yasla ilgili bolge
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<65){
                System.out.println("emeli olamazsin \nDaha "+ (65-yas) + "yil calisman gerekiyor");
            }else {
                System.out.println("emekli olabilirsin");
            }

        }else {//Yanlis gerenlerin yeri
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");


        }

    }
}
