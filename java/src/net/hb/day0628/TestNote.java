package net.hb.day0628;

public class TestNote {

  public static void main(String[] args) {
    System.out.println("박정아 9:42 ");
    System.out.println("까사노 9:43 ");
    TestNote tn = new TestNote();
    tn.note();
  }

  public String book() { 
    String my = "몽블랑" ; 
    return my;
  }

  public int price() {
    int money = 2700;
    return money;
  }

  public void note() { 
    String title = book();
    int pay = price();
    System.out.println("책제목=" + title);
    System.out.println("책제목=" + book() );
    System.out.println("책가격=" + pay);
    System.out.println("책가격=" + price());
  }

}
