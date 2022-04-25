package day08_ifElseifStatement;

import java.util.Scanner;

public class C03_Maas_Teklifi {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a salary");
        double proposedSalary = scan.nextDouble();

        if (proposedSalary> 80.000){
            System.out.println("I accept to work with you");
        }else if (proposedSalary >= 60.000 && proposedSalary >= 80.000){
            System.out.println("We can talk, maybe you may give me promotion after some time ");
        }else if (proposedSalary<60.000) {
            System.out.println("I cant accept this offer!!!");
        }else {
            System.out.println("Please talk about the money");
        }





    }
}
