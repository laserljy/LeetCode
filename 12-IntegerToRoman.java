public class Solution {
    public String intToRoman(int num) {
        String result = "";
        while(num != 0) {
            if(num / 5 == 0) {
                if(num == 4) result += "IV";
                else for(int i = 0; i < num; i++) result += "I";
                num = 0;
            } else if(num / 10 == 0) {
                if(num == 9) {
                    result += "IX";
                    num %= 9;
                }
                else {
                    result += "V";
                    num %= 5;
                }
            } else if(num / 50 == 0) {
                if(num >= 40) {
                    result += "XL";
                    num %= 40;
                }
                else for(int i = 0; i < num / 10; i++) result += "X";
                num %= 10;
            } else if(num / 100 == 0) {
                if(num >= 90) {
                    result += "XC";
                    num %= 90;
                }
                else {
                    result += "L";
                    num %= 50;
                }
            } else if(num / 500 == 0) {
                if(num >= 400) {
                    result += "CD";
                    num %= 400;
                }
                else for(int i = 0; i < num / 100; i++) result += "C";
                num %= 100;
            } else if(num / 1000 == 0) {
                if(num >= 900) {
                    result += "CM";
                    num %= 900;
                }
                else {
                    result += "D";
                    num %= 500;
                }
            } else {
                for(int i = 0; i < num / 1000; i++) result += "M";
                num %= 1000;
            }
        }
        return result;
    }
}