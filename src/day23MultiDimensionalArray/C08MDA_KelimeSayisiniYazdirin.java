package day23MultiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class C08MDA_KelimeSayisiniYazdirin {

    public static void main(String[] args) {

//Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        String arr[]=cumle.split(" ");
        System.out.println(Arrays.toString(arr)); // [Java, is, very, good]

        System.out.println("Girdiginiz cumledeki kelime sayisi : " + arr.length);


    }
}
