package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    long start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      al.add(i);
    }
    long end = System.nanoTime();
    long arrayList = end - start;
    System.out.println(arrayList);

    end = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      ll.add(i);
    }
  }
}
