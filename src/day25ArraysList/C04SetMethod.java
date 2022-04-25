package day25ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C04SetMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Aykut");
        names.add("Yusuf");
        names.add("Ilker");
        names.add("Oguzhan");
        System.out.println(names); //[Aykut, Yusuf, Ilker, Oguzhan]

        names.set(1,"Cesur");
        System.out.println(names);
        names.get(3);
        System.out.println(names.get(3));

        List<String>logList = new ArrayList<>();




    }
}
