public class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n <= 0) return result;
        addParenthesis("", 0, 0, n);
        return result;
    }
    
    void addParenthesis(String str, int left, int right, int n) {
        if(left < n) {
            addParenthesis(str + '(', left + 1, right, n);
            if(left > right) addParenthesis(str + ')', left, right + 1, n);
        }
        else {
            if(right < n) addParenthesis(str + ')', left, right + 1, n);
            else result.add(str);
        }
        return;
    }
}