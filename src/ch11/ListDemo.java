package ch11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"호랑이", "사자", "사슴", "곰"};
    List<String> list = Arrays.asList(animals);
    System.out.println(list);

    list.set(3, "앵무새");
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next() + ",");
    }
    System.out.println();

    list.add("바다표범");
    for(String ani : list){
      System.out.println(ani + ",");
    }
    System.out.println();
  }
}
