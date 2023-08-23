package ch9;

import java.util.ArrayList;

public class GenericClass1Demo {
  public static void main(String[] args) {
    ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
    arrayListBoricha.add(new Boricha());
    ArrayList<Beer> arrayListBeer = new ArrayList<>();
    arrayListBeer.add(new Beer());

    Cup c = new Cup();
    c.setBeverage(new Boricha());
    if(c.getBeverage() instanceof Boricha){
      Boricha boricha = (Boricha) c.getBeverage();
    } else if (c.getBeverage() instanceof Beer) {
      Beer beer = (Beer) c.getBeverage();

    }
    c.setBeverage(new Beer());
    c.setBeverage(new Beverage());
    c.setBeverage(new Object());

    Boricha boricha = (Boricha) c.getBeverage();
    Beer beer = (Beer) c.getBeverage();
  }
}

class Beverage{}
class Boricha extends Beverage{}
class Beer extends Beverage{}
class Cup<T>{
  private T beverage;
  public T getBeverage() {
    return beverage;
  }
  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}