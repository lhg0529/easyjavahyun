package Ch8;

public class garbageDemo {
  public static void main(String[] args) {

  }
}

class Garbage {
  int no;
  public Garbage(int no){
    this.no = no;
    System.out.println("Garbage(" + no + ")가 생성됨");
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Garbage(" + no + ")가 수거됨");
  }
}
