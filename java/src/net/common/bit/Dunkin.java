package net.common.bit;

public class Dunkin {


  public String coffee() { 
    //Non-static 메소드, 리턴값
    // 주문할때 = 필요할 때 메모리에 로드
    // 객체화생성후 객채명.coffee();
    String kind = "아이스카페모카";
    return kind;
  }//coffee END

  public static void donuts(int cnt) {
    //static메소드 메소드 (매개인자)
    //이미 미리 상품화 클래스이름.도너츠()
    //Dunkin.donuts(3); 접근
    System.out.println("도너츠메소드 주문갯수 " + cnt + "입니다");
  }//donut END
  public void menu( ) { // 리턴값X, 매개인자X

  }
}//class END