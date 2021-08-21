package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



      //  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.


public class Task_25 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of rows");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quantity of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int sign = Math.random()<0.5?-1:1;
                    matrix[i][j] = (int) (Math.random()* 100)*sign;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

            System.out.println();
            int max = Integer.MIN_VALUE;
                for (int [] array : matrix) {
                    for (int element : array) {
                        if (element > max) {
                            max = element;
                            }
                        }
                    }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] % 2 != 0) {
                        matrix[i][j] = max;
                    }
                }
            }
            for (int[] array : matrix) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

