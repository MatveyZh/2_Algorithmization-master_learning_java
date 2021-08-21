package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task_11 {

    //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of rows");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quantity of columns");
            int m = Integer.parseInt(read.readLine());

            int[][] matr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int sign = Math.random() < 0.5 ? -1 : 1;
                    matr[i][j] = (int) (10 * Math.random()) * sign;


                }
            }

            for (int[] array : matr) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }

            boolean greater=false;
            System.out.println("Сolumns where the first element is greater than the last element");
            for (int i = 0; i < m; i += 2) {

                if (matr[0][i] > matr[n - 1][0]) {
                    greater=true;
                    for (int j = 0; j < n; j++) {
                        System.out.println(matr[j][i]);
                    }

                }
                System.out.println();

            }



            if(!greater)
            {
                System.out.println("there is no columns where the first element is greater than the last element ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
