public class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String result = "";
        if(a.length() == 0) return b;
        if(b.length() == 0) return a;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        while(aIndex >= 0 || bIndex >= 0) {
            int sum = 0;
            if(aIndex >= 0 && bIndex >= 0) {
                sum = Character.getNumericValue(a.charAt(aIndex)) + Character.getNumericValue(b.charAt(bIndex)) + carry;
                //System.out.println(sum);
                aIndex--;
                bIndex--;
            }
            else if(aIndex >= 0) {
                sum = Character.getNumericValue(a.charAt(aIndex)) + carry;
                aIndex--;
            }
            else if(bIndex >= 0) {
                sum = Character.getNumericValue(b.charAt(bIndex)) + carry;
                bIndex--;
            }
            if(sum >= 2) carry = 1;
            else carry = 0;
            sum = sum % 2;
            result = Integer.toString(sum) + result;
        }
        if(carry == 1) result = "1" + result;
        return result;
    }
}