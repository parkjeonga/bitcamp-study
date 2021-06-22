package com.eomcs;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    final int BOARD_LENGTH = 3;
    String[] titles = new String[BOARD_LENGTH];
    String[] contents = new String[BOARD_LENGTH];
    String[] passwords = new String[BOARD_LENGTH];
    int size=0 ; // 현재 배열은 0
    System.out.println("[게시판 관리]");

    Scanner keyScan = new Scanner(System.in);

    loop: while(true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();



      switch (command) {
        case "list" :
          System.out.println("[게시글 목록]");
          break;
        case "add" :
          if (size==BOARD_LENGTH) {
            System.out.println("더이상 게시글을 추가할 수 없습니다.");
            break;
          }
          System.out.println("[게시글 등록]");
          System.out.print("제목: ");
          titles[size] = keyScan.nextLine();
          System.out.print("내용: ");
          contents[size] = keyScan.nextLine();
          System.out.print("비밀번호: ");
          passwords[size] = keyScan.nextLine();
          System.out.printf("제목 : %s\n", titles[size]);
          System.out.printf("내용 : %s\n", contents[size]);
          System.out.printf("비밀번호 : %s\n", passwords[size]);

          size++;
          break;
        case "update" :
          System.out.println("[게시글 변경]");
          break;
        case "delete" :
          System.out.println("[게시글 삭제]");
          break;
        case "view" :
          System.out.println("[게시글 조회]");
          break;
        case "quit" :
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
    }

    keyScan.close();
    System.out.println("안녕히 가세요!");
  }

}
