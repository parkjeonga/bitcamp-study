package com.eomcs.lang.ex04;
public class Test05 {
  public static void main(String[] args) {
    int[] a = new int[3];
   
    a[0] = 100;
    a[1] = 200;
    a[2] = 300;
  

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    //  위의 배열은 사용할 수 없다. 메모리만 차지 하고 있으므로 쓰레기임
    a = new int[5];
    System.out.println(a[0]);  
  }
}
