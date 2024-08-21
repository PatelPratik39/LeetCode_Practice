package nterview;

public class ReverseString {


    public static void main ( String[] args ) {
        String stre = "helloWorld";
        StringBuilder reversed = new StringBuilder();
        for (int i = stre.length() - 1; i >= 0; i--) {
            reversed.append(stre.charAt(i));
        }
        System.out.println(reversed.toString());
    }
}
