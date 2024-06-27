package Collections.Stack;

import java.util.Stack;

class  StringReverse {
    public String reverse(String input) {
        Stack<Character> stack = new Stack<Character>();

        for(char ch: input.toCharArray())
            stack.push(ch);
        String reversed = "";

        while(!stack.empty())
            reversed += stack.pop();
        return  reversed;
    }
}


public class ReverseStringUsingStack {
    public static void main ( String[] args ) {
            String str = "asdfghjkjllougv";

            StringReverse reverse = new StringReverse();
            String result = reverse.reverse(str);
        System.out.println("original String " + str);
        System.out.println("Reversed String : " + result);
    }
}
