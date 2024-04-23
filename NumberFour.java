import java.util.Stack;
class BalancedBrackets {
    public String isValid(String s) {
        Stack<Character> t = new Stack<>();
        char[] arr = s.toCharArray();
        if(arr.length%2!=0) {
            return "NO";
        }
        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') {
                t.push(c);
            } else if (c == ')') {
                if (!t.empty() && t.peek() == '(') {
                    t.pop();
                } else {
                    return "NO";
                }
            } else if (c == ']') {
                if (!t.empty() && t.peek() == '[') {
                    t.pop();
                } else {
                    return "NO";
                }
            } else if (c == '}') {
                if (!t.empty() && t.peek() == '{') {
                    t.pop();
                } else {
                    return "NO";
                }

            }

        }

        return "YES";
    }

    public static void main(String[] args) {
        BalancedBrackets bb = new BalancedBrackets();
        System.out.println(bb.isValid("{[()]}"));
        System.out.println(bb.isValid("{[(])}"));
        System.out.println(bb.isValid("{{[[(())]]}}"));
    }
}