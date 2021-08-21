package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
//        Задана матрица неотрицательных чисел.
//        Посчитать сумму элементов в каждом столбце.
//        Определить, какой столбец содержит максимальную сумму.
//

public class Task_19 {
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of rows");
            int n = Integer.parseInt(rd.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(rd.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 10);
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            int maxColumn = 1;
            int maxSum = 0;
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][j];
                }
                System.out.println("The sum elements in column "+ (j)+"is : "+ sum);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxColumn = j ;
                }
                sum = 0;
            }

            System.out.println("max sum is in "+ maxColumn+" column");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
