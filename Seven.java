import java.util.Stack;
public class Seven{

    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }

    public static int precedence(char c) {
        switch (c) {
            case('+'), ('-'):
                return 1;
            case('*'), ('/'):
                return 2;
            case('^'):
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : arr) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
            else if(c == '(') {
                stack.push(c);
            }
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else { // either +, -, *, /, or ^
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }

        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
