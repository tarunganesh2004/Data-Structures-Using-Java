import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        validParenthesis p = new validParenthesis();
        boolean result = p.valid("({[]})");
        System.out.println(result);
    }

    public boolean valid(String s) {
        Stack<Character> newStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                newStack.push(')');
            } else if (c == '[')
                newStack.push(']');
            else if (c == '{')
                newStack.push('}');
            else if (newStack.isEmpty() || newStack.pop() != c)
                return false;
        }
        return newStack.isEmpty();
    }

    public boolean checkValid(String s) {
        Stack<Character> newStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                newStack.push(c);
            } else {
                if (newStack.isEmpty()) {
                    return false;
                }
                char top = newStack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    newStack.pop();
                } else {
                    return false;
                }
            }
        }
        return newStack.isEmpty();
    }
}
