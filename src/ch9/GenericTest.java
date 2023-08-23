package ch9;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    ArrayList nums = new ArrayList();
    nums.add(10); //Integer로 10이 auto-boxing 됨
    nums.add(3.14); //Double로 3.14가 auto-boxing 됨
    nums.add("hello");

    for (int i = 0; i <nums.size() ; i++) {
       System.out.println((Integer)(nums.get(i))*2);

    }
  } int clas = 0;
  char var1 = 'A';
  String str = "bjkjhkjhA";
}
