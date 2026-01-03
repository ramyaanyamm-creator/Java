import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                // Closing bracket but stack is empty
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check matching pair
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        // Stack should be empty at the end
        return stack.isEmpty();
    }
}
