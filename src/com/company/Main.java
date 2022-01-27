package com.company;

public class Main {
    public static void main(String args[]) {

        fibonacci(50);

    }

    private static void fibonacci(int n){

        if (n < 1){
            System.out.println("Count must be a positive number!"); return;
        }

        if (n < 2){
            System.out.println("1");
            System.out.print("1"); return;
        }

        if (n < 3){
            System.out.println("1,2");
            System.out.print("3"); return;
        }

        long[] series = new long[n];
        long total = 3;

        series[0] = 1;
        series[1] = 2;

        System.out.print("1,2");

        for(int i = 2; i < n; i++ ){

            series[i] = series[i-1] + series[i-2];

            total += series[i];

            System.out.print("," + series[i]);
        }

        System.out.println();
        System.out.print("Sum : " + total);
    }
}