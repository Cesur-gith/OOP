package day23MultiDimensionalArray;

import java.util.Arrays;

public class C07ArrayeElemanEkleyenBirMethodOlusturun {

    public static void main(String[] args) {

    int arr [] = {3,5,7};
    int eklenecekEleman = 4;


        arr = arrayeElemanEkle(arr,eklenecekEleman);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray [] = new int[arr.length+1]; // Yeni bir array olusturyoruz, Yeni bir arrayim var. [0,0,0,0]
        // Eskisini arrayi yeni array e tasimak gerekiyor
        // For loop kullanalim

        for (int i = 0; i < arr.length ; i++) {
            yeniArray[i] = arr[i]; // eski elementleri yeniArray e tasidik. Geriye son element eklemek kaldi

        }

        yeniArray[yeniArray.length-1] = eklenecekElement;

        return yeniArray;
    }

}
