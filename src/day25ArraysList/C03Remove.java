package day25ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C03Remove {

    public static void main(String[] args) {

        List<Integer>numbers = new ArrayList<>();

        numbers.add(5);// Burda ekleme yaptik
        numbers.add(1);
        numbers.add(0, 7);
        numbers.add(2,8);

        System.out.println(numbers);

        numbers.remove(3);
        System.out.println(numbers);

        // Atama yaparak ekleyerek oyle kaldirsak
        /*
        int sayi = 5;
        numbers.remove(sayi);*/

        Integer sayi = 5;
        numbers.remove(sayi);
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(5));



    }
}
