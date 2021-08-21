package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
//        Задана матрица неотрицательных чисел.
//        Посчитать сумму элементов в каждом столбце.
//        Определить, какой столбец содержит максимальную сумму.
//
public class Task_20 {
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of rows");
            int n = Integer.parseInt(rd.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(rd.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {

                    int positiveNegative = Math.random()<0.5?-1:1;
                    matrix[i][j] = (int) (Math.random()* 100)*positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("\nPositive elements of main diagonal : ");
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > 0) {
                    System.out.printf("%d, ", matrix[i][i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}