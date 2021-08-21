package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


import static java.lang.System.*;


public class Task_1 {
    public static void main(String[] args) {


//        1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.


        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            out.println("Enter a size of array ");
            int n = Integer.parseInt(read.readLine());

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 10);

            }

            System.out.print(Arrays.toString(arr) + "\n");


            out.println("Enter number k ");
            int k = Integer.parseInt(read.readLine());
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % k == 0) {
                    sum += arr[i];
                }
            }
            out.print("The sum of elements that are multiples of " + k + " is " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}