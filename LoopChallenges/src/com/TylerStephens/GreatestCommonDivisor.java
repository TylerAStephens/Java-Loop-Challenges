package com.TylerStephens;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,25));
        System.out.println(getGreatestCommonDivisor(15,30));
        System.out.println(getGreatestCommonDivisor(12,126));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10){
            return -1;
        }

        int lowerNumber = first > second ? second : first;
        // find value of the maximum of two parameters

        while(lowerNumber != 0){

            if((first % lowerNumber == 0) && (second % lowerNumber == 0)){
                return lowerNumber;
            }

            lowerNumber--;
        }

        return -1;
    }
}
