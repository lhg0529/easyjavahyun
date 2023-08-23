package ch9;


class Circle{
  int radius;
  public Circle(int radius){
    this.radius=radius;
  }

  @Override //오버라이딩. 내가 잘하고 있나 감시해 주는 @Override
  public boolean equals(Object obj) {
    if(obj instanceof Circle circle){
      if(circle != null && this.radius == circle.radius){
        return true;
      }
    }
    return false;
    }

}

  //  public boolean equals(Circle c1){
//    if(radius==c1.radius)
//      return true;
//    return false;   이건 오버로딩
//  }

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if(c1.equals(c2))
      System.out.println("c1과 c2는 같다.");
    else
      System.out.println("c1과 c2는 다르다.");
  }
}
