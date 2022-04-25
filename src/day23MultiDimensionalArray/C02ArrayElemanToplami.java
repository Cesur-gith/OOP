package day23MultiDimensionalArray;

public class C02ArrayElemanToplami {

    public static void main(String[] args) {


        // verilen multi dimensional array'in tum elementlerinin toplamini bulunuz
        int arr[][]= {{3,1,7,5},{6,10}};
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam +=  arr[i][j];
            }
        }
        System.out.println("arraydeki elementlerin toplami : " + toplam);


        int array [][] = {{1,2,3},{5,6,7}};
        int sum = 0;

        for (int x[] : array) {
            for (int y : x) {
                sum += y;
            }
        }
        System.out.println(sum);
    }



}
