package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.out;

public class Task_6 {

    public static boolean isPrime(int num) {


        boolean isPrime= true;

        if (num<=1)
        {
            return false;
        }
        for(int i=2; i < num; i++) {
            isPrime = true;

            for (int j = 2; j <= i / j; j++) {
                if ((i % j) == 0) isPrime = false;
            }


        }




        return isPrime;
    }


    //    6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//    являются простыми числами.

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            out.println("Enter a size of array ");

            int n = Integer.parseInt(read.readLine());


            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);

            }

            out.println("array ");
            System.out.print(Arrays.toString(array) + "\n");

            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                out.print(i+" ");
                out.println(isPrime(i));
                if (isPrime(i)) {
                    sum += array[i];
                }
            }

            out.println("sum="+sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
