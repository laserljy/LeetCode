public class Solution {
    public int strStr(String haystack, String needle) {
        int h = 0;
        int n = 0;
        int index = -1;
        if(needle.length() == 0) return 0;
        if(haystack.length() == 0 || haystack.length() < needle.length()) return index;
        while(haystack.length() > h && needle.length() > n) {
            if(haystack.charAt(h) != needle.charAt(n)) {
                h = h - n + 1;
                n = 0;
                continue;
            }
            if(n == needle.length() - 1) {
                index = h - n;
                break;
            }
            h++;
            n++;
        }
        return index;
    }
}