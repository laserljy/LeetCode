public class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            switch(s.charAt(i)) {
                case 'I': arr[i] = 1;
                    break;
                case 'V': arr[i] = 5;
                    break;
                case 'X': arr[i] = 10;
                    break;
                case 'L': arr[i] = 50;
                    break;
                case 'C': arr[i] = 100;
                    break;
                case 'D': arr[i] = 500;
                    break;
                case 'M': arr[i] = 1000;
                    break;
            }
        }
        for(int i = 0; i < len; i++) {
            if(i < len - 1 && arr[i] < arr[i+1]) {
                sum += arr[i+1] - arr[i];
                i++;
                continue;
            }
            sum += arr[i];
        }
        return sum;
    }
}