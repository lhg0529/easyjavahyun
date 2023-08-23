package ch9;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    try{
              int res = 10/0;
      } catch (ArithmeticException e) {
        System.out.println("0으로 나눌 수 없습니다.");

      }
    }
  }
