package Ch8;

public class ObjectMethodDemo {
  public static void main(String[] args) {
    Mouse mouse1 = new Mouse("Samsung");
    Mouse mouse2 = new Mouse("Samsung");
    //System.out.println(mouse.name);
    System.out.println(mouse2 == mouse1);

    Keyboard keyboard = new Keyboard("Samsung");
    System.out.println(keyboard.name);
    System.out.println(keyboard);
  }
}

class Mouse {
  String name;
  public Mouse(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가" + name + "인 마우스입니다.";
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Mouse mouse){
      if(this.name.equalsIgnoreCase(mouse.name)){
        return true;
      }
    }
    return false;
  }
}

class Keyboard {
  String name;

  public Keyboard(String name){
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || this.getClass() != obj.getClass())
      return false;
    return false;
  }


}