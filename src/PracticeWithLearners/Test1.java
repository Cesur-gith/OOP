package PracticeWithLearners;

import java.util.HashSet;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

//        String str = "";

        Scanner input = new Scanner(System.in);
        String str = input.next();
        char arr[] = str.toCharArray();

        HashSet<Character> set1=new HashSet<Character>();
        HashSet<Character> set2=new HashSet<Character>();

        for(char i:arr)
        {
            if(set1.contains(i))
            {
                set1.add(i);
                set2.remove(i);

            }
            else
            {

                set1.add(i);
                set2.add(i);
            }
        }

        System.out.println(set2);


    }

    }
