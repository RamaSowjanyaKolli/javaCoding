import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[(])}"; 
        String input3 = "{{[[(())]]}}"; 

        System.out.println("Input 1: " + isBalanced(input1));
        System.out.println("Input 2: " + isBalanced(input2));
        System.out.println("Input 3: " + isBalanced(input3));
    }
}