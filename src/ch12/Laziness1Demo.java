package ch12;

import java.util.stream.IntStream;

public class Laziness1Demo {
  public static void main(String[] args) {
    IntStream is = IntStream.rangeClosed(1, 5);
    is.filter(x -> {
      System.out.println("filter : " + x);
      return x % 2 == 0;
    }).map(x -> {
      System.out.println("map : " + x);
      return x * x;
    }).forEach(x-> System.out.println("foreach : "+x)); //게으른 연산이어서 작동이 조급한 연산 나오기 전까지 안하니 이렇게 출력 만들어서 보기
  }
}
