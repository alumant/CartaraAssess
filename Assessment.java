package com.alumant.model;

import java.util.Scanner;
public class Assessment {
        public static void multiples(int n) {
            int sumOfMultiples = 0;

            System.out.println("input an ineger");
            Scanner inputPara = new Scanner(System.in);
            int num = inputPara.nextInt();

            for (int inputPara = 0; inputPara < n; inputPara++) {
                if (inputPara % 3 == 0 || inputPara % 5 == 0) {
                    sumOfMultiples += inputPara;
                }
            }

            System.out.println("The sum of multiples of 3 or 5 below " + n + " is: " + sumOfMultiples);
        }


        public static void check{

        System.out.println("input an ineger");
        Scanner firstInt = new Scanner(System.in);
        int num1 = firstInt.nextInt();

        System.out.println("input an ineger");
        Scanner secondtInt = new Scanner(System.in);
        int num2 = secondtInt.nextInt();

        if{
            num1 == 3 || num1
        }

    }




}
