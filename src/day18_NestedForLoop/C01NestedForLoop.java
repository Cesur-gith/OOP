package day18_NestedForLoop;

public class C01NestedForLoop {

    public static void main(String[] args) {


        int num = 3;

        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=num ; j++) {

                System.out.print((i*j) + " " );

            }

            System.out.println();

        }

    }
}
