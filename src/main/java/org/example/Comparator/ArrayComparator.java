package org.example.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayComparator {

    // Расчет среднего значения
    public double getAverage(List<Integer> listik) {
        int sum = 0;
        if (!listik.isEmpty()) {
            for (int num : listik) {
                sum += num;
            }
//            System.out.println(sum);
            return (double) sum / listik.size();
        }
        return sum;
    }

    // Сравнение средних значений списков и вывод соответствующего сообщения
    public void compare(double res1, double res2) {
        if (res1 > res2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (res1 < res2) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}
