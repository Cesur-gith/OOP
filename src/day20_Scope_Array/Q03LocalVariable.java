package day20_Scope_Array;

public class Q03LocalVariable {


    public static void main(String[] args) {

        int sayi = 0 ;

        for (int i = 0; i <10 ; i++) {
            System.out.println(sayi);  // sayi yazdirinca kirmizi verdi cunku local variable lara Java default degeri atamaz ama kendiniz atama yaparsin
                                        // loop dan once manuel olarak defaul variable olustururuz
        }


        //int sayi; // deger atanmamis.  Local variable la ra Java default degeri atmaz. Manuel kendin ata
       // sayi++;

    }

        public void add (){

        String isim;
       // System.out.println(isim);  // Local variable evet ama deger atanmamis ve Java default deger atmaz. Kendin ata
    }

}
