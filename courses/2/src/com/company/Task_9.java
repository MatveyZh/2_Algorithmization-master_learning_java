package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_9 {
//    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

    public static void main(String[] args) {

        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {

            out.println("Enter a size of array ");

            int n = Integer.parseInt(rd.readLine());

            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {

                int sign = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 100) * sign;
            }


            out.println("\nArray");

            for (int element : array)
                System.out.printf("%3d ", element);


            int currentCounter = 0;
            int biggestCounter = 0;
            int FrequentEl = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++)
                    if (array[i] == array[j]) {
                        currentCounter++;

                    }
                if (currentCounter > biggestCounter) {
                    biggestCounter = currentCounter;
                    FrequentEl = array[i];
                }

                if (currentCounter == biggestCounter && FrequentEl > array[i]) {
                    FrequentEl = array[i];
                }


                currentCounter = 0;


            }

            out.printf("biggestCounter=" + biggestCounter + " FrequentEl=" + FrequentEl);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
