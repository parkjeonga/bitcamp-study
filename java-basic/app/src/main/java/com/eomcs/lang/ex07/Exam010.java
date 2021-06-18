package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Exam010 {

  static void printSpaces(int len) {
    for (int i = 1; i <= len; i++) {
      System.out.print(" ");
    }
  }

  static void printStars(int len) {
    for (int i = 1; i <= len; i++) {
      System.out.print("*");
    }
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close(); // 입력값 끝나면 닫기

    int starLen = 1;
    while (starLen <= len) {          // 별 앞에 공백 출력
      int spaceLen = (len - starLen) / 2; // 공백 갯수
      printSpaces((len - starLen) / 2);
      printStars(starLen);
      System.out.println();
      starLen += 2;


    }
  }
}