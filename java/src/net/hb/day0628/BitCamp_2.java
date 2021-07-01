package net.hb.day0628;

public class BitCamp_2  extends LA { //LA클래스상속 체리메소드호출
  public static void main(String[] args) {
    BitCamp_2 bc = new BitCamp_2();
    bc.book();
    bc.cherry();
  }//end

  public void book() {
    System.out.println("book 몽블랑");
    super.cherry(); //부모클래스 접근 super
    this.cherry(); //this생략가능
  }//end

  @Override public void cherry() {
    System.out.println("제주 체리 11:07");
  }//end

}//class END







