package com.eomcs;


public class Test2 {

  static class A {
    int x;
  }
  static class B {
    int y;
  }
  static class C {
    int z;
  }

  public static void main(String[] args) {
    A r1 = new A();
    r1.x = 100;

    Object obj = new A();
  
    A r2 = (A) obj;
    r2.x = 100; // OK!

    B r3 = (B) obj; // 컴파일러는 속일 수 있지만, 실행할 때 JVM에서 예외가 발생할 것이다.
    r3.y = 200;

    System.out.println("종료!");
  }
}






