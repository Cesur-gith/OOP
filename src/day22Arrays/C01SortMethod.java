package day22Arrays;

import java.util.Arrays;

public class C01SortMethod {

    public static void main(String[] args) {

        String arr[]={"S","M","A","T"};
        System.out.println(Arrays.toString(arr));  // [S, M, A, T]

        Arrays.sort(arr); // [A, M, S, T] // Bu siralamaya natural order.
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [A, M, S, T]
        // Java da bu siralamaya Natural Order denir
        // sayi olursa kucukten buyuge
        // metin olursa alfabetik siralamaya gore





    }
}
