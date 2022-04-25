package day09_iternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {


        int sayi=1400;
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun
        String sonuc =sayi>=100 ? "Sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";
        // Ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable'a  atama yapabiliriz
        System.out.println("girdiginiz sayi analizi : " + sonuc);

        System.out.println("===============================");

        int num =40;
        String  result = (num >= 30) ? ("It is more than 30") : ("It is less than 30");
        System.out.println(result);



    }


}
