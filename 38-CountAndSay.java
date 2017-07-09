public class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for(int i = 1; i < n; i++) str = convert(str);
        return str;
    }
    
    public String convert(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            if(c == s.charAt(i)) count++;
            else {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}