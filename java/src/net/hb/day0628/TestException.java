package net.hb.day0628;

public class TestException {
  public static void main(String[] args) {
    int su1 = 9;
    int su2 = 0;
    int mul = 0, mok = 0 ;
    try {
      mul = su1 * su2;
      mok = su1 / su2;   } catch(Exception ex) {System.out.println("에러이유" + ex);}

    System.out.println( su1 + "*" + su2 + " = " + mul );
    System.out.println( su1 + "/" + su2 + " = " + mok  );
    System.out.println("***** 까사노의 1학기 점수 *****");
    System.out.println("국어 = 90");
    System.out.println("영어 = 85");
    System.out.println("총점 = 175");

  }
}
