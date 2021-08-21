package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


   //  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

class Task_45 {
    private static String moreDigits(long m, long n) {
        long firstCount = (int)(Math.log10(Math.abs(m))+1);
        long secondCount = (int)(Math.log10(Math.abs(n))+1);
        if (firstCount == secondCount) {
            return "The quantity of digits is equal";
        } else {
            return (firstCount > secondCount) ? ("M consists more") : ("N consists more");
        }
    }
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number M: ");
            long m =  Long.parseLong(read.readLine());
            System.out.println("Enter the number N: ");
            long n =  Long.parseLong(read.readLine());
            System.out.println("Number that consist more digits: ");
            System.out.println(moreDigits(m, n));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

