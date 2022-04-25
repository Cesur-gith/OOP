package day20_Scope_Array;

public class C01Scope {
    // Class level de objeler 2 ye ayrilir.
    // 1 ==> instance variable ==> nerede olusur main method un disinda class levelin icinde
    // deger atamak zorunda degil. Java onlara default degerler atar
    // bunlara object variable denir
    // Instance variable class icerisinde veya baska classlar da direk erisimlez, erisme istedgimiz zaman
    // MUTLAKA object olusturmak gerekir ve object uzerinden ulasilir.

    // Burdaki variable da Instance variable dir // instance variable lara object variable denir.
    // Sadece sahsi ilgilendirir. Ogrencinin notu ve ogretmenin bransi


    int sayi;
    String bransIsmi = "Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        // main methodum static ve insatnce variable dan direk erisemem
        // Instance variable lara erismek icin Object olusturmam gerekiyor

        // Class lar objeler icin kaliplar.
        //

        C01Scope obj1 = new C01Scope(); // BU class in Object olusturduk
        System.out.println(obj1.sayi); // 0 yazdirir cunku bir deger atanmadi bu yuzden default degerini atar.
        // sayi= 10; bunu yapamazsini atama yapilmaz bu sekilde

        obj1.sayi = 10; // bu sekilde obj1 e ait bir deger atayabiliriz Sadece obj1 sin sayisi 10 oldu
        System.out.println(obj1.sayi); //10
        obj1.bransIsmi = "Matematik";
        System.out.println(obj1.okuldaMi); // false

        C01Scope obj2 = new C01Scope();
        System.out.println(obj2.sayi); // Bu obj1 in sayi yi degerini  degistirmez Bu baska object
        System.out.println(obj2.bransIsmi); // Java

        obj1.okuldaMi = true; // burasi sadece obj1 olan ogrenci icin gecerli.

        System.out.println(obj2.okuldaMi); // obj1 re verilen deger obj2 yi ilgilendirmez o yuzden false verir.


    }
}
