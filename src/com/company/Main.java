package com.company;
import java.util.*;



public class Main {

    //дз
    private static double getPositiveAverage(double[] array) {

        double sum = 0;
        double count = 0;
        int count1 = 0;
        for (double d : array
        ) {
            if (d >= 0 && count1>0) {
                sum += d;
                count++;
                System.out.println(sum);
            }
            else if (d<0){
                count1++;

            };
        }
        return sum/count;
    }
        public static void main (String[]args){
            double[] numbers = {-12.5, 45.5, 61.2, -1.1, 32.6, -78.2, 32.6, -12.12, 56.56, 54.7, -7.3, 54.5,
                    87.56, 4.8, 78.2};

            System.out.println("Среднее арифметическое положительных чисел равен " + getPositiveAverage(numbers) );

            //дз на сообразительность

            Arrays.sort(numbers);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + "  ");
            }


        }

    }

        




