package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



import static java.lang.System.out;

public class Task_2 {
    public static void main(String[] args) {


//        2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
//        большие данного Z, этим числом. Подсчитать количество замен


        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            out.println("Enter a size of array ");

            int n = Integer.parseInt(read.readLine());

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            out.println("array " );
            System.out.print(Arrays.toString(arr) + "\n");


            out.println("Enter number z ");
            int z = Integer.parseInt(read.readLine());
            int counter = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > z) {
                    arr[i] = z;
                    counter++;
                }
            }

            out.println("The amount of changings is " + counter);
            out.println("changed array " );
            System.out.print(Arrays.toString(arr) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}