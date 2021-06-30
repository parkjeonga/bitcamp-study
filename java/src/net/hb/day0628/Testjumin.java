package net.hb.day0628;

public class Testjumin {

  public static void main(String[] args) {
    String min = "871024-2541965";
    int pos = min.indexOf("-");
    System.out.println("pos = " + pos);

    // 10월 24일 생일이네요

    String month = min.substring(2,4);
    String day = min.substring(4,6);
    System.out.println(month + "월 " + day + "일 생일이네요");

    String last = min.substring(7); //시작점 O, 끝 점X
    System.out.println(last);

    int len = min.length();
    System.out.println("총자릿수 = "+len);


  }
}





/* 성별체크
  public static void main(String[] args) {
      String min = "871024-2541965";
      if (min.charAt(7)=='1') {
        System.out.println("남성입니다.");
      } else if (min.charAt(7)=='2'){
        System.out.println("여성입니다.");
      } else {
        System.out.println("잘못 표기 되었습니다.");
      }

    }* 
 */