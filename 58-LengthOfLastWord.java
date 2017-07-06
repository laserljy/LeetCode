public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        if(!s.contains(" ")) return s.length();
        int index = s.lastIndexOf(' ');
        return s.length() - index - 1;
    }
}