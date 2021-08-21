package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.out;

public class Task_3 {


//    3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//    положительных и нулевых элементов.


    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            out.println("Enter a size of array ");

            int n = Integer.parseInt(read.readLine());


            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                int sign = Math.random()<0.5?-1:1;
                arr[i] = (int) (Math.random() * 100)*sign;

            }

            out.println("array " );
            System.out.print(Arrays.toString(arr) + "\n");




            int negatives = 0;
            int positives = 0;
            int zeros = 0;


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    positives++;

                } else if (arr[i] < 0) {
                    negatives++;
                } else zeros++;
            }
            out.println("Amount of negative numbers " + negatives);
            out.println("Amount of positive numbers " + positives);
            out.println("Amount of zeros " + zeros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}