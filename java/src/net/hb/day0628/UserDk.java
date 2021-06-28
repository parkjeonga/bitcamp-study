package net.hb.day0628;

import net.common.bit.Dunkin;

public class UserDk {
  public static void main(String[] args) {

    Dunkin dunkin = new Dunkin();
    System.out.println("UserDK클래스");

    Dunkin.donuts(3);

    String msg = dunkin.coffee();
    System.out.println("주문한 음료는 " + msg + "입니다.");

  }//end
}//class ENd
