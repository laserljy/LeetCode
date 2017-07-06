public class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return result;
        
        String[] letters = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String[] com = new String[digits.length()];
        for(int i = 0; i < digits.length(); i++) {
            int n = Character.getNumericValue(digits.charAt(i));
            com[i] = letters[n];
        }
        
        recur("", 0, com);
        
        return result;
    }
    
    void recur(String str, int m, String[] com) {
        if(m == com.length) {
            result.add(str);
            return;
        }
        for(int s = 0; s < com[m].length(); s++) {
            str = str + com[m].charAt(s);
            recur(str, m + 1, com);
            str = str.substring(0, str.length() - 1);
        }
    }
}