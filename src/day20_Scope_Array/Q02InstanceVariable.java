package day20_Scope_Array;

public class Q02InstanceVariable {


    int sayi;
    char ilkHarf;
    String isim;
    boolean ogrenciMi;


    public static void main(String[] args) {

        Q02InstanceVariable ex1 = new Q02InstanceVariable(); // Object olusturduk instance variable lara ulasmak icin
                                                             // Object deger atamasi varmi

        System.out.println(ex1.sayi);       // 0        Bu default degerler
        System.out.println(ex1.ilkHarf);    // ''       Bu default degerler
        System.out.println(ex1.isim);       // null     Bu default degerler
        System.out.println(ex1.ogrenciMi);  // false    Bu default degerler




    }
}
