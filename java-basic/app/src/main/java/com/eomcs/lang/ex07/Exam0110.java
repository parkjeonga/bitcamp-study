package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Exam0110 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close(); // 입력값 끝나면 닫기
    int starLen = 1;
    while (starLen <= len) {
      // 별 앞에 공백 출력
      int spaceCnt = 1; // 별갯수
      int spaceLen = (len - starLen) / 2; // 공백 갯수
      while (spaceCnt <= spaceLen) {
        System.out.print(" ");
        spaceCnt++;
      }   // 공백수만큼 반복 int 함수사용으로 나머지는 버림!

      // 별 출력
      int starCnt = 1; // 별갯수 초기화
      while (starCnt <= starLen) {
        System.out.print("*");
        starCnt++;
      }

      // 출력 줄 바꾸기
      System.out.println();
      starLen += 2;


    }
  }
}