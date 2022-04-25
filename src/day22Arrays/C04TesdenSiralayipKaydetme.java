package day22Arrays;

import java.util.Arrays;

public class C04TesdenSiralayipKaydetme {

    public static void main(String[] args) {

        int arr[]={3,5,6,1,0,9,45,25,9};
    /*    int arr2 [] = new int[arr.length];

        arr2 = arr; // Buna atadi  // [3, 5, 6, 1, 0, 9, 45, 25, 9]
        System.out.println(Arrays.toString(arr2));
*/
        arr = terstenSira(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] terstenSira(int[] arr) { // direk int gelde

        Arrays.sort(arr);
        int tersArr [] = new int[arr.length]; // Uzunlugu usteki arr ile ayni olmalidir. Icerisi bos suanda

        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 5, 6, 9, 9, 25, 45]

        System.out.println(Arrays.toString(tersArr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            tersArr [i] = arr[arr.length-1-i];
        }
        return tersArr;
    }
}
