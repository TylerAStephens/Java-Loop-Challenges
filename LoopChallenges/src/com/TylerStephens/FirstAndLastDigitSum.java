package com.TylerStephens;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(121));
        System.out.println(sumFirstAndLastDigit(-13));
        System.out.println(sumFirstAndLastDigit(9334));
    }

    public static int sumFirstAndLastDigit(int number){

        if (number< 0){
            return -1;
        }
        int lastDigit = number % 10;
        // Extract least-significant digit

        while (number > 9){
            number /= 10;
        }
        // While number is greater than nine drop the least-significant digit

        return  number + lastDigit;
    }

}
