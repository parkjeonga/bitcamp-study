package net.hb.day0628;

public class TestBook {
  public int m = 7800;

  public static void main(String[] args) {
    char a = 'A', b = '1', c= 57;
    System.out.println(a +"\t" + b +"\t"+ c);

    int x = a;
    int y = b;
    int z = c;

    System.out.println(x +"\t" + y +"\t"+ z);
    System.out.println();



  }
  public void note() {
    int m = 2400;
    System.out.println("지역변수 책가격 = " + m);
    System.out.println("전역변수 책가격 = " + this.m);
  }


}
