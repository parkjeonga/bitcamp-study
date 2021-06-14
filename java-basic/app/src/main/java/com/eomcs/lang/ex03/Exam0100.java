package com.eomcs.lang.ex03;

//# 리터럴(literal)
//- 자바 언어로 표현한 값.
//

public class Exam0100 {
  public static void main(String[] args) {
    System.out.println("-------- 정수 리터럴");
    System.out.println(78); // 10진수
    System.out.println(+78);
    System.out.println(-78);
    System.out.println(0116); // 8진수
    System.out.println(0x4e); // 16진수
    System.out.println(0b01001110); // 2진수
    
    System.out.println("-------- 부동소수점 리터럴");
    System.out.println(3.14);
    System.out.println(31.4e-1);
    
    System.out.println("-------- 논리 리터럴");
    System.out.println(true);
    System.out.println(false);
    
    System.out.println("-------- 문자 리터럴");
    System.out.println('가');
    
    System.out.println("-------- 문자열 리터럴");
    System.out.println("오호라 코딩스쿨!");
  }
}

// 정수 100 : 약 -21억 ~+ 21억
// 정수 100L, 100l > 약 -900경 ~ +900경 소문자 대문자 결과 값이 같으나 소문자는 숫자 1과 헷갈리니 대문자 사용하기
// 부동소수점 3.14 약 15자리(전체 숫자 개수)  소수점 표현에 사용
// 부동소수점 3.14f 3.14F  > 약 7자리로 소수점 표현 ex) 3.141592f  314.1592f