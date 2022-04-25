package day23MultiDimensionalArray;

public class C09MDASonElementleriCarpiminiToplayin {

    public static void main(String[] args) {

//        Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
//        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }


        int arr [][]=  { {1,2,3}, {4,5}, {6,5} }; // Boyutlari ayni degil degisik
        int container = 1;

        for (int i = 0; i < arr.length ; i++) {

            container *= arr[i][arr[i].length-1]; // ic arrayin son elementini aliyor ve container e carpiyor

            }
        System.out.println("Son elementlerin capimi: " + container);


        System.out.println("================");

        // Soru 2) Asagidaki multi dimensional array’in
        // ic array’lerindeki son elemanlarin carpimini
        // ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

        int arr1[][]={ {1,2,3}, {4,5}, {6,0,2} };
        int carpim=1;
        for (int i = 0; i <arr1.length ; i++) {
            carpim *= arr1[i][arr1[i].length-1];
        }
        System.out.println("son elementlerin carpimi : " + carpim);
    }



    }

