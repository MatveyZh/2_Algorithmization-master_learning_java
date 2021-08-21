package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task_13 {
    //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
    public static void main(String[] args) {


        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of rows");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quantity of columns");
            int m = Integer.parseInt(read.readLine());

            int[][] matr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    matr[i][j] = (int) (10 * Math.random());
                }
            }

            for (int i = 0; i < matr.length; i++) {
                System.out.println(Arrays.toString(matr[i]));

            }

            System.out.println("Enter number k");
            int k = Integer.parseInt(read.readLine());
            System.out.println("Enter number p");
            int p = Integer.parseInt(read.readLine());

            System.out.println("The k-th row");
            for (int j = 0; j < n; j++) {
                System.out.print(matr[k][j] + " ");
            }

            System.out.println("The p-th column");
            for (int i = 0; i < m; i++) {
                System.out.println(matr[i][p]);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}