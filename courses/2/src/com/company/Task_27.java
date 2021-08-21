package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//        3.1 Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//        дополнительный массив.

public class Task_27 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter size of first array: ");
            int n = Integer.parseInt(read.readLine());
            int [] firstArray = new int [n];

            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i]= (int) (Math.random()*100)-50;
                System.out.print(firstArray[i] + ", ");
            }

            System.out.println("\n\nEnter size of second array: ");
            int m = Integer.parseInt(read.readLine());
            int [] secondArray = new int [m];

            for (int i = 0; i < secondArray.length; i++) {
                secondArray[i]= (int) (Math.random()*100)-50;
                System.out.print(secondArray[i] + ", ");
            }

            System.out.println("\n\nChoose number from first array: ");
            int k = Integer.parseInt(read.readLine());

            System.out.println("\n\nResult of joining two arrays : ");
            for (int i = 0; i < firstArray.length; i++) {
                System.out.print(firstArray[i] + ", ");
                if (k == firstArray[i]) {
                    for (int j = 0; j < secondArray.length; j++) {
                        System.out.print(secondArray[j] + ", ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

