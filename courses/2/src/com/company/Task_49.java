package com.company;


//  Найти все натуральные n-значные числа, цифры в которых образуют строго
//  возрастающую последовательность (например, 1234, 5789). Для решения задачи
// использовать декомпозицию.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task_49 {
    private static void findNumbers (int n) {
        int [] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int element : number) {
                System.out.print(element);
            }
            System.out.print(", ");
            number[0]++;
        }
        System.out.println("\b\b");
    }

    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number n: ");
            int n = Integer.parseInt(read.readLine());
            findNumbers(n);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}