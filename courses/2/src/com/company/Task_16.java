package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task_16 {
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//       1   1   1  ... 1   1   1
//       0   1   1  ... 1   1   0
//       0   0   1  ... 1   0   0
//       .   .   .  ... .   .   .
//       0   1   1  ... 1   1   0
//       1   1   1  ... 1   1   1


    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a size of squere matrix nxn");
            int n = Integer.parseInt(read.readLine());
            if (n % 2 == 1) {
                System.out.println("Number n is even!");
                return;
            }
            int[][] matr = new int[n][n];


            int k = 0;

            for (int i = 0; i < n / 2; i++) {
                for (int j = k; j < n / 2; j++) {
                    matr[i][j] = 1;
                }
                k++;
            }
            k = n;
            for (int i = 0; i < n / 2; i++) {
                for (int j = n / 2; j < k; j++) {
                    matr[i][j] = 1;
                }
                k--;
            }

            k = n / 2 - 1;
            for (int i = n / 2; i < n; i++) {
                for (int j = n / 2 - 1; j >= k; j--) {
                    matr[i][j] = 1;
                }
                k--;
            }

            k = n / 2 + 1;
            for (int i = n / 2; i < n; i++) {
                for (int j = n / 2 - 1; j < k; j++) {
                    matr[i][j] = 1;
                }
                k++;
            }

            for (int i = 0; i < matr.length; i++) {
                System.out.println(Arrays.toString(matr[i]));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}