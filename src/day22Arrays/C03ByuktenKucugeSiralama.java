package day22Arrays;

import java.util.Arrays;

public class C03ByuktenKucugeSiralama {

    public static void main(String[] args) {

        // Verlen bir arayi buyukten kucuge siralayip yazdiran bir method olusturun

        int arr[]={3,5,6,1,0,9,45,25,9};
        terstenSiralamYazdir(arr);
    }

    public static void terstenSiralamYazdir(int[] arr) {

        Arrays.sort(arr);
        int tersArr [] = new int[arr.length]; // Uzunlugu usteki arr ile ayni olmalidir. Icerisi bos suanda

        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.toString(tersArr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(arr.length); // 9


        for (int i = 0; i < arr.length ; i++) {
            tersArr [i] = arr[arr.length-1-i];

            System.out.print(" " + arr[arr.length-1-i]);  //  45 25 9 9 6 5 3 1 0
        }
        System.out.println();
        System.out.println(Arrays.toString(tersArr)); //[45, 25, 9, 9, 6, 5, 3, 1, 0]

    }
}
