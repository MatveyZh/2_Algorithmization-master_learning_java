package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task_12 {
    //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
    public static void main(String[] args) {


        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a size of array n");
            int n = Integer.parseInt(read.readLine());


            int[][] matr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    matr[i][j] = (int) (10 * Math.random());
                }
            }

            for (int[] array : matr) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }

            System.out.println("Elements from main diagonal");


            for (int i = 0; i < n; i++) {
                System.out.print(matr[i][i] + ";");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
