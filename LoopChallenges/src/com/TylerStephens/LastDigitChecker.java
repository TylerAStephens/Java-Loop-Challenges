package com.TylerStephens;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(231,21,22));
        System.out.println(hasSameLastDigit(1000,99,90));
        System.out.println(hasSameLastDigit(111,829,100));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if((firstNumber > 1000 || firstNumber < 10) || (secondNumber > 1000 || secondNumber < 10) ||
                (thirdNumber > 1000 || thirdNumber < 0)) {
            return false;
        }

        int firstNumberDigit = firstNumber % 10;
        int secondNumberDigit = secondNumber % 10;
        int thirdNumberDigit = thirdNumber % 10;

        if((firstNumberDigit == secondNumberDigit) || (secondNumberDigit == thirdNumberDigit) ||
                (firstNumberDigit == thirdNumberDigit)) {
            return true;
        }


        return false;

    }



}
