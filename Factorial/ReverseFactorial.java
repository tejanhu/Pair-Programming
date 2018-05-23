package com.timbrell.george.PairProgramming;

public class ReverseFactorial {

    public static int getFactorial(int number){
        double divisionResult = number;
        boolean factorialFound  = false;
        int result = -1;

        int  i = 1;
        while(!factorialFound) {
            divisionResult = divisionResult/ i;
            if (divisionResult == 1) {
                System.out.println("" + number + "=" + i + "!" );
                result = i;
                factorialFound = true;

            }if(divisionResult != (int)divisionResult){
                result = -1;
                System.out.println(number + " None".toUpperCase());
                break;

            }

            i++;
        }
     return result;
    }
}
