package day17_forLoop;

public class C06_ForLoop {

    public static void main(String[] args) {


        char ilkHarf = 'm';
        char sonHarf = 't';

        for (int i = ilkHarf; i <= sonHarf ; i++) {


            System.out.print(i + " ");

        }

        double baslangic=10;
        double bitis=20;
        double artis= 0.2;
        // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdirin
        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.print(i + " ");
        }








    }
}
