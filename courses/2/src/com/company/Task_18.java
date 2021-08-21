package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Task_18 {

//
//        В числовой матрице поменять местами два столбца любых столбца,
//        т. е. все элементы одного столбца поставить на соответствующие
//        им позиции другого, а его элементы второго переместить в первый.
//        Номера столбцов вводит пользователь с клавиатуры.
//

    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of rows");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];
            int swap;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 10) ;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Choose the  first number of column that you want to change: ");
            int s = Integer.parseInt(read.readLine()) ;
            System.out.println("Choose the second number  of column that you want to change: ");
            int z = Integer.parseInt(read.readLine()) ;

            for (int i = 0; i < matrix.length; i++) {
                swap = matrix[i][s];
                matrix[i][s] = matrix[i][z];
                matrix[i][z] = swap;
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