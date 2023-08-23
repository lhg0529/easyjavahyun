package ch9;

public class CheckedDemo {
  public static void main(String[] args) {
    try {
      System.out.println("1초간 쉽니다");
      Thread.sleep(1000); //여기까지만 쓰면 에러가 뜬다. 그래서 InterruptedException 제안 뜸
      System.out.println("1초간 쉽니다");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
