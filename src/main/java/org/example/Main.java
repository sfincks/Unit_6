package org.example;
import org.example.Comparator.ArrayComparator;
import org.example.Comparator.ListGenerator;

import java.lang.String;
import java.util.List;


public class Main {
   public static void main(String[] args) {
      ArrayComparator arrcom = new ArrayComparator();
      ListGenerator gen = new ListGenerator();

      List<Integer> list1 = gen.getList();
      List<Integer> list2 = gen.getList();

      double aver1 = arrcom.getAverage(list1);
      double aver2 = arrcom.getAverage(list2);

      arrcom.compare(aver1,aver2);
   }
}
