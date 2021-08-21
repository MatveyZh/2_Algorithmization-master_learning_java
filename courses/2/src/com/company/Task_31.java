package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//   Сортировка вставками. Дана последовательность чисел a1,a2,a3,a4...aN.
//   Требуется переставить числа в порядке возрастания. Делается это следующим образом.
//   Пусть a1, a2, a3 .. aN упорядоченная последовательность, т.е. a1<=a2<=...<=aN.
//   Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//   последовательность была тоже возрастающей.
//   Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
//   Примечание. Место помещения очередного элемента в отсортированную часть производить
//   с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.


public class Task_31 {
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity of the sequence. ");
            int n = Integer.parseInt(rd.readLine());
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                int sign = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 10) * sign;
                System.out.print(array[i] + ", ");
            }

            sortingByInsert(array);

            System.out.println("\nInsert sorting: ");
            for (int value : array) {
                System.out.print(value + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sortingByInsert(int[] array) {
        int temp;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                int j = binarySearch(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }
    }

    private static int binarySearch(int[] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
}
