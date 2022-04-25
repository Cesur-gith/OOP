package day25ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C02ArrayListMethods {



    public static void main(String[] args) {

        List<String>names = new ArrayList<>();
        names.add("Aykut");
        names.add("Yusuf");
        names.add("Ilker");
        names.add("Oguzhan");
        System.out.println(names); //[Aykut, Yusuf, Ilker, Oguzhan]

        boolean sonuc = names.remove("Aykut");

        if (sonuc == true){
            System.out.println("The name you want was deleted");
        }else {
            System.out.println("The name you want to delete is not exist in the list");

        }

        System.out.println(names.remove(1)); // Burda "Yusuf" u kaldirir ve kaldirilan veriyi dondurur

        /*names.remove("Oguzhan");
        System.out.println(names); //[Aykut, Yusuf, Ilker]*/

        System.out.println(names);



    }
}
