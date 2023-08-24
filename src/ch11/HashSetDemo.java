package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("A","B","C","D","E");
    HashSet<String> hashSet = new HashSet<>(set);
    //set.add("F"); immutable 객체
    hashSet.add("F");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println();
    System.out.println(set);
    System.out.println(hashSet);

    boolean e = hashSet.add("E");
    if(!e) System.out.println("추가하지 못했습니다.");
    System.out.println("E의 hashCode() = " + "E".hashCode());
    boolean isExist = false;
  }


}
