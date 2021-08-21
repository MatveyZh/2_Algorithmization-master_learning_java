package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task_15 {
//     5.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//       1   1   1  ... 1   1   1
//       2   2   2  ... 2   2   0
//       3   3   3  ... 3   0   0
//       .   .   .  ... .   .   .
//      n-1 n-1  0  ... 0   0   0
//       n   0   0  ... 0   0   0


    public static void main(String[] args) {


        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a size of squere matrix nxn");
            int n = Integer.parseInt(read.readLine());

            if (n % 2 == 1) {
                System.out.println("Number n is even!");
                return;
            }
            int[][] matr = new int[n][n];

            int k = n;

            for (int i = 0; i < n; i++) {
                for (int j = k - 1; j >= 0; j--) {
                    matr[i][j] = i + 1;

                }
                k--;

            }
            System.out.println("Matrix");

            for (int[] array : matr) {
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