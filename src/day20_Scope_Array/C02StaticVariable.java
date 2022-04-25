package day20_Scope_Array;

public class C02StaticVariable {

    // Instance var lar Object lere baglidir  ve her object farkli degerler alabilir.
        // ogrenci notlari veya ogretmen branslari gibi
        // Bir object a ait bir var in son degerini bulmak icin sadece o object ti dikkate aliriz

    // static varia ise class variable olarak tanimlanir ve tumm class uyeleri icin aynidir etkiler
    // Okul ismi, Okul muduru adi gibi
    // eger static var in degeri degisirse herke icin degisir

    static int okulNo;
    static String okulIsmi = "Yildiz Koleji";
    static boolean okulAcikmi;

    public static void main(String[] args) {


        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo); // 0 default deger
        okulNo = 102; // Burda deger atadik
        System.out.println(okulNo); // 102

        System.out.println(okulAcikmi); // False default deger

        staticmethod(); // Alttaki method un calismasi icin methodu call yapmak gerekiyor

        // Burada da  yeniden okul numarasini print yaparsak ne olur ?
        System.out.println(okulNo);

        // Static variable da degisiklikler herkezi etkiler ve degistirir
    }

    public static void staticmethod () {

        okulNo =200; // static
        System.out.println(okulNo);  // Bunu goremeyiz robotu cagirmadan. Method call yapmadan. Main method da method call yapmak gerekir


    }


}
