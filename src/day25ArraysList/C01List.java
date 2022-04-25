package day25ArraysList;

import day23MultiDimensionalArray.C06ArrayElementEkleyenBirMethodOlusturun;
import day23MultiDimensionalArray.C07ArrayeElemanEkleyenBirMethodOlusturun;

import java.util.ArrayList;
import java.util.List;

public class C01List {
    public static void main(String[] args) {


        int arr [] = {};
        // Bu araya 5 ekle.

        List<Integer>sayilarList =new ArrayList<>(); // Burasi boz kendimiz eklememiz lazim
        System.out.println(sayilarList);

        sayilarList.add(5);// Burda ekleme yaptik
        sayilarList.add(3);
        sayilarList.add(0, 7);
        sayilarList.add(2,8);

        System.out.println(sayilarList);

        sayilarList.size();




    }
}
