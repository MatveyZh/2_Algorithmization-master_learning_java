package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

public class Task_14 {
//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//  (1,  2,  3,  ...,    n)
//  (n,  n-1, n-2,...,   1)
//  (1,  2,  3,  ...,    n)
//  (n,  n-1, n-2,...,   1)
//  (...,....,....,...,...)
//  (n,  n-1, n-2,...,   1)


public static void main(String[] args)
{




    try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
        System.out.println("Enter a size of squere matrix nxn");
        int n = Integer.parseInt(read.readLine());


    if (n % 2 == 0)
    {
        System.out.println("Number n is odd!");
        return;
    }
    int[][] matr = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i % 2 == 0) {
                matr[i][j] = j+1;
            } else {
                matr[i][j] = n - j;
            }
        }

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
