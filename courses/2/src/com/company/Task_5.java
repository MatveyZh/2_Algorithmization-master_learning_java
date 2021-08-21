package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.out;

public class Task_5 {

    //    5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            out.println("Enter a size of array ");

            int n = Integer.parseInt(read.readLine());


            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);

            }

            out.println("array ");
            System.out.print(Arrays.toString(array) + "\n");


            for (int i = 0; i < array.length; i++) {
                if (array[i] > i) {
                    out.print(array[i] + " ");

                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
