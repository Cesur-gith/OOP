package day19_WhileLoopDoWhileLoopScope;

import java.util.Scanner;

public class C05DoWhileLoop {

    public static void main(String[] args) {

        /*Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
         Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
         Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
         toplaminin kac oldugunu yazdirin.*/

        Scanner scan = new Scanner(System.in);
        // Ama sayi itiyacimiz var deger vermek gerekir
        int integer = 10000;
        int sum = 0; // sayilari toplamak icin containere ihtiyacim var
        int counterPositif = 0; // Bunu ne zmn arrtiracam = sayi 0 dan buyukse // Girilen pozitif ve negatif sayilari toplamak icin bu counter olusturmak gerekiyor
        int counterNegatif = 0;



        do {
            System.out.println("Enter a positif integer \n to finish press 0 "); // Kullanicidan tekarar tekarar istenirse loop un icine at
            integer = scan.nextInt();

            if (integer<0){
                System.out.println("Dont enter negatif integer");
                counterNegatif++;

            }else if (integer>0){
                sum+=integer;
                counterPositif++;
            }
        }while (integer !=0 );

        System.out.println("The sum of integer negatif that wronly entered " + counterNegatif);
        System.out.println("The sum of integer pozitif that entered " + counterPositif);
        System.out.println("The sum of total positif integer is: " + sum);


    }
}
