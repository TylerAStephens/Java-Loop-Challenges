package com.TylerStephens;

public class palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(123));
        System.out.println("************");
        System.out.println(isPalindrome(505));

    }

    public static boolean isPalindrome(int number) {

        int num = number;
        // Store user number to compare
        int reverse = 0;
        // Store reversed number
        int lastDigit = 0;
        // Store last digit

        while(num != 0) {
            lastDigit = num % 10;
            System.out.println("lastDigit = " + lastDigit);
            // Extract least-significant digit by performing modulo of power of 10

            reverse = (reverse * 10) + lastDigit;
            System.out.println("reverse = " + reverse);
            // Increase place value of reverse by one

            num = num / 10;
            System.out.println("Num = " + num);
            // Drop the least-significant digit
            System.out.println("***While Loop resets***");
        }

        if (number == reverse)
            return true;
        else
            return false;

    }

}
