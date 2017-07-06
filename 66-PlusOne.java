public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = (digits[len - 1] + 1) / 10;
        digits[len - 1] = (digits[len - 1] + 1) % 10;
        for(int i = len - 2; i >= 0; i--) {
            int temp = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digits[i] = temp;
        }
        if(carry == 1) {
            int[] newDigits = new int[len + 1];
            newDigits[0] = 1;
            for(int i = 1; i < len + 1; i++) newDigits[i] = digits[i - 1];
            return newDigits;
        }
        return digits;
    }
}