public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	//char c = '';
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push(')');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == ')') stack.pop();
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '}') stack.pop();
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == ']') stack.pop();
            else return false;
        }
    	return stack.isEmpty();
    }
}