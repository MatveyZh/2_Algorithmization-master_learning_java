package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.out;

public class Task_4 {
    //    4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            out.println("Enter a size of array ");

            int n = Integer.parseInt(read.readLine());


            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                int sign = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 100) * sign;

            }


            int min = 0;
            int max = 0;
            int temp;

            out.println("array ");
            System.out.print(Arrays.toString(array) + "\n");


            for (int i = 0; i < array.length; i++) {
                if (array[max] < array[i])
                    max = i;
                if (array[min] > array[i])
                    min = i;
            }
            System.out.println("max " + array[max] + " min " + array[min]);


            temp = array[max];
            array[max] = array[min];
            array[min] = temp;

            out.println("changed array ");
            System.out.print(Arrays.toString(array) + "\n");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}