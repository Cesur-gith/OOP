package day32_dateTime;

import java.util.Arrays;
import java.util.Scanner;

public class sample {

    public static void main(String[] args) {

            /*
             * Ecrivez un algorithme permettant, toujours sur le m�me principe, �
             * l�utilisateur de saisir un nombre d�termin� de valeurs. Le programme, une
             * fois la saisie termin�e, renvoie la plus grande valeur en pr�cisant quelle
             * position elle occupe dans le tableau. On prendra soin d�effectuer la saisie
             * dans un premier temps, et la recherche de la plus grande valeur du tableau
             * dans un second temps
             *
             * Write an algorithm allowing, always on the same principle the user can enter
             * a determined number of values. The program, once the input is finished, the
             * program returns the largest value by specifying its position in the table. We
             * will take carry out the input in a first time, and the search for the largest
             * first, and the search for the largest value in the table in a second time

             */

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter how many values you want...");
            int n = scan.nextInt();
            int t[] = new int[n];
            int max = 0;
            // First loop is asking values from user to enter
            for (int i = 0; i < t.length; i++) {
                System.out.println("Enter a value.. " );
                t[i] = scan.nextInt();
            }
            System.out.println("Entered values are: " + Arrays.toString(t));

            // 2nd loop is finding the biggest value
            for (int k = 0; k < t.length; k++) {
                if (t[k]>max) {
                    max = t[k];
                }
            }
            System.out.println("The biggest number is: " + max);

        }
}
