package day11_stringManipulation;

public class C01toLowerCase_toUpperCase {

    public static void main(String[] args) {


    String str = "Java is Good";

    // Ikici kelimenin ilk harfini buyuk yazdirin

        // replace() == Char
        // replaceAll(); == String regex
        System.out.println(str.toUpperCase());
        String str1=str.replaceAll("i", "I");
        System.out.println(str1);





    }

}