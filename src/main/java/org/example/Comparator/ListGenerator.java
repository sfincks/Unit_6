package org.example.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListGenerator {
    // Создание и заполнение списка
    public List<Integer> getList() {
        Random rng = new Random();
        List<Integer> list = new ArrayList<>();
//        int listSize = rng.nextInt(1, 5);
//        System.out.println(listSize);
        for (int i = 0; i < 5; i++) {
            list.add(rng.nextInt(1, 10));
        }
        return list;
    }

}
