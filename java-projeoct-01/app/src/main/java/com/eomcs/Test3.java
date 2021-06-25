package com.eomcs;

class Calculator3 {
  int result;

 
  void plus(int value) {
    this.result += value;
  }
}

public class Test3 {
  public static void main(String[] args) {
    Calculator3 obj1 = new Calculator3();
    Calculator3 obj2 = new Calculator3();

    obj1.plus(100);
    obj1.plus(200);
    obj1.plus(300);

    obj2.plus(111);
    obj2.plus(222);

    System.out.println(obj1.result);
    System.out.println(obj2.result);
  }
}
