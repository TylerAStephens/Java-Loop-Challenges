package com.TylerStephens;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(34,54));
        System.out.println(hasSharedDigit(34,56));
        System.out.println(hasSharedDigit(93,38));

    }
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 > 99 || num1 < 10) || (num2 > 99 || num2 < 0)) {
            return false;
        }

        while (num1 > 0){
            int num1Digit = num1 % 10;
            // Extract least-significant digit
            int newNum2 = num2;
            // Store second number to compare

            while (num2 > 0) {
                int num2Digit = num2 % 10;
                // Extract least-significant from second number to compare

                if (num1Digit == num2Digit) {
                    return true;
                }
                if (num2 > 9) {
                    num2 /= 10;
                } else {
                    num2 = newNum2;
                    break;
                } /*
                   If second number is bigger than nine drop least-significant
                   else break loop
                */

            }
            if(num1 >9) {
                num1 /= 10;
            } else {
                break;
            }/*
                   If first number is bigger than nine drop least-significant and restart loop
                   else break loop and declare false
                */
        }
        return false;
    }

}
