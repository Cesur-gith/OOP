package day25ArraysListSocrative;

import java.util.Arrays;

public class C04ArrayList {

    public static void main(String[] args) {

        int arr[] = {1, 23, 12, 2, 3};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 12));
    }
}
