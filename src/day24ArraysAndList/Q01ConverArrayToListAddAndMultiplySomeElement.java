package day24ArraysAndList;

import java.util.ArrayList;
import java.util.List;

public class Q01ConverArrayToListAddAndMultiplySomeElement {

    public static void main(String[] args) {

        int array [] = {6,5,4,3,8,2,6};

        List<Integer>list = new ArrayList<>();

        for (int i = 0; i < array.length ; i++) {

            list.add(array[i]);

        }
            System.out.println(list); // [6, 5, 4, 3, 8, 2, 6] This is a list now

        list.add(0,11);
        list.add(3,13);
        System.out.println(list);  // [11, 6, 5, 13, 4, 3, 8, 2, 6] 11 and 13 is added

        // Increase each element by 3 for doing this use for loop

        for (int k = 0; k < list.size() ; k++) {

            list.set(k,list.get(k)+3);

        }
        System.out.println(list);




    }


}
