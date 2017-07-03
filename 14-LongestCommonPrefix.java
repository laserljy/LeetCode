public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return ""; //difference between strs.length == 0 & strs == null?
        String pre = strs[0];
        for(int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(pre) != 0) pre = pre.substring(0, pre.length() - 1);
        }
        return pre;
    }
}