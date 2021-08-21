package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//       Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//       которое меньше максимального элемента массива, но больше всех других элементов).

public class Task_39 {
    public static void main(String[] args) {

        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size numbers:");
            int n = Integer.parseInt(rd.readLine());
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                int sign = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 100) * sign;
                System.out.printf("%d, ", array[i]);
            }

            System.out.println("\nSecond max number is: ");
            secondMaxNumber(array);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        private static int secondMaxNumber(int [] array){
        int swap;
        for (int i=0; i<array.length;i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] < array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.printf("%d, ", array[array.length - 2]);
        return array[array.length - 2];
    }
}
