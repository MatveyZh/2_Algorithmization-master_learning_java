package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//     Дано натуральное число N. Написать метод(методы) для формирования массива,
//     элементами которого являются цифры числа N

class Task_44 {
    private static int[] createArray (int m, int n) {
        int [] array = new int [m];
        for(int i = 0; i < array.length;i++){
            array[i] = n;
            System.out.printf("%d, ", array[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter size of array: ");
            int m = Integer.parseInt(rd.readLine());
            System.out.println("Enter number N: ");
            int n = Integer.parseInt(rd.readLine());

            createArray (m, n);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}