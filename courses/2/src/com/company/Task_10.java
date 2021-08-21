package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task_10 {
//    10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.


    public static void main(String[] args) {

        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {

            out.println("Enter a size of array ");

        int n =Integer.parseInt(rd.readLine());

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {

            int sign = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * sign;

        }


        out.println("array ");
        System.out.print(Arrays.toString(array) + "\n");

        for (int i = 1,j=1; array.length%2==0? i <array.length/2 : i<=array.length/2; i++,j++)
        {
            array[i]=array[i+j];

        }
        for (int i = array.length/2; i < array.length; i++)
        {
            array[i]=0;

        }
        System.out.print(Arrays.toString(array) + "\n");


    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}