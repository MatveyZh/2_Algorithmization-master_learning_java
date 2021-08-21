package com.company;


//   Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
//   цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
//   Для решения задачи использовать декомпозицию

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task_51 {
    private static int countSubtraction(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum + ", ");
        return sum;
    }

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number n: ");
            int n = Integer.parseInt(read.readLine());

            int number = countSubtraction(n);

            System.out.println("\nThe quantity of the substractions: " + number);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }