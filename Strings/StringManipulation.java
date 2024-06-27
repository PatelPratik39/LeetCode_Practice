package Strings;

public class StringManipulation {
    public static void main ( String[] args ) {

//        Using String literal
        String str1 = "Hello ";
        System.out.println(str1);

//        Using String Object

        String str2 = new String("Prats");
        System.out.println(str2);

//        Concatenate String using Literal and String
        String str3 = str1 + str2;
        System.out.println(str3);

        System.out.println(str3.length());
        System.out.println(str3.concat(str1));
        System.out.println(str3.charAt(3));
        System.out.println(str3.substring(0,5));
        System.out.println(str3.equals(str2));
        System.out.println(str3.contains("Hello"));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.trim());
    }
}
