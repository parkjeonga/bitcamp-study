package net.hb.day0628;

public class Child extends Father {  // 다중 상속 불가
  public static void main(String[] args) { // 모든 클래스 최상위 Object클래스 상속 받음
    Child cd = new Child();  
    int a = cd.bank();


  }
  public void book() {
    int m = bank();
  }
}
