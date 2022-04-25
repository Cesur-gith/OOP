package day10_switch_StringManipulation;

public class C04_charAt {

    public static void main(String[] args) {

        String name = "Learn Java";
    /*    char  ch = name.charAt(3);
        String str = String.valueOf(ch);

        System.out.println(str);
*/
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length()-1);
        System.out.println("" + firstChar + " " + lastChar);
    }
}
