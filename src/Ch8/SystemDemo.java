package Ch8;

public class SystemDemo {
  public static void main(String[] args) {
    int[] numbers = new int[10000];
    System.out.println(System.nanoTime());
    for (int i = 0; i < numbers.length ; i++) {
      numbers[i] = i+1;

    }
    System.out.println(System.nanoTime());
  }
}
