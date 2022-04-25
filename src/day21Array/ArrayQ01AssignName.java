package day21Array;

import java.util.Arrays;

public class ArrayQ01AssignName {

    public static void main(String[] args) {

        String myArray[] = {"Ali", "Ayse"};

        myArray[0] = "Veli";
        myArray[1] = "Fatma";

        String myarr  = myArray[0] + " " + myArray [1];
        System.out.println(Arrays.toString(myArray));
        System.out.println(myarr);


    }
}
