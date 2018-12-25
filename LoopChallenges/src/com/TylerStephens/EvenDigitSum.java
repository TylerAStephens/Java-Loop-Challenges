package com.TylerStephens;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(122));
        System.out.println(getEvenDigitSum(212));
        System.out.println(getEvenDigitSum(4321));
        System.out.println(getEvenDigitSum(123456));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int num = number;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            num /= 10;
        }
        return sum;
    }

}
