package net.hb.day0628;

import java.util.Scanner;

public class dfad {

  //생성자 클래스 이름, 리턴값 X, void 기술 X
  //생성자 사용은 new키워드 다음에 기술 ob = new 클래스()
  //생성자는 중복 가능, 기본생성자 생략 가능.
  //멤버필드=전역변수 private

  private int floor; //층 = 행   / 3층 = 3행
  private int room;  // 호 = 열  / 5호 = 5열
  private String[][] name = new String[3][5];
  private String title;
  public Scanner sc = new Scanner(System.in);

  public dfad() { }
  public dfad(String name) { }
  public dfad(String name, int year) { }

  public void process() {
    int sel = 9;
    while(true) {
      // 현재 객실 예약 현황
      System.out.println("         [델루나 투숙 상태]");
      for (int i = 0; i < name.length; i++) {
        for (int b = 0; b < name[i].length; b++) {
          System.out.printf("%d0%d\t",i+1,b+1);
        }
        System.out.println();

        for (int j = 0; j < name[i].length; j++) {
          if (this.name[i][j] == null) {
            System.out.print("\t");
            continue;
          }
          System.out.printf("%s\t", name[i][j]);
        }
        System.out.print("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
      }
      while (true) {
        try {
          System.out.print("\n1.투숙  2.퇴실  3.map  4.list  9.종료 >>> ");
          sel = Integer.parseInt(sc.nextLine());
          System.out.println();
          break;
        } catch (Exception e) {}
      }

      switch(sel) {
        case 1: checkIn(); break;
        case 2: checkOut(); break;
        case 3: map(); break;
        case 4: list(); break;
        case 9: exit(sel); break;
        default: break;
      }
    }
  }

  public void checkIn() {
    System.out.println("투숙을 선택하셨습니다.");
    loop1 : while(true) {
      int f;
      int h;
      String n;
      System.out.println("[뒤로가기 9]");
      System.out.println("예약하실 객실 정보를 적어주세요.");
      while(true) {
        try {
          System.out.print("몇층?>> ");
          f = Integer.parseInt(sc.nextLine());

          if (f == 9) {
            break loop1;
          }

          if (f > name.length || f <= 0) {
            System.out.println("층을 잘못 입력하셨습니다.");
            continue;
          }
          break;
        }catch (Exception e) {} 
      }

      while(true) {
        try {
          int i = 0;
          System.out.print("몇호?>> ");
          h = Integer.parseInt(sc.nextLine());

          if (h == 9) {
            break loop1;
          }

          if (h > name[i].length || h <= 0) {
            System.out.println("호수를 잘못 입력하셨습니다.");
            continue;
          }
          break;
        }catch (Exception e) {}
      }

      if (name[f-1][h-1] != null) {
        System.out.println("이미 예약된 객실입니다. 다시 입력해 주세요.");
        System.out.println();
        continue;
      }

      while (true) {
        System.out.println("성합은 3글자로 입력해 주세요.");
        System.out.println("성함?>> ");
        n = sc.nextLine();
        if (n.length() > 3 || n.length() < 0 || n.equals("")) {
          continue;
        }
        break;
      } //n while end

      name[f-1][h-1] = n;
      System.out.println("예약이 완료되었습니다. 감사합니다.");

      break;  
    }// 투숙 while end

    System.out.println("\n");
  }

  public void checkOut() {
    System.out.println("퇴실하시겠습니끼?");
    System.out.println("퇴실하실 객실의 정보를 입력해 주십시오.");
    loop2 : while(true) {
      int f;
      int h;
      while(true) {
        try {
          System.out.print("[뒤로가기  9]\n");
          System.out.print("몇층?>> ");
          f = Integer.parseInt(sc.nextLine());

          if (f == 9) {
            System.out.println();
            break loop2;
          } 

          if (f > name.length || f <= 0) {
            System.out.println("층을 잘못 입력하셨습니다."
                + "\n다시 입력해 주세요.");
            continue;
          }
          break;
        }catch (Exception e) {} 
      }

      while(true) {
        try {
          int i = 0;
          System.out.print("몇호?>> ");
          h = Integer.parseInt(sc.nextLine());

          if (h == 9) {
            break loop2;
          } 

          if (h > name[i].length || h <= 0) {
            System.out.println("호수를 잘못 입력하셨습니다."
                + "\n다시 입력해 주세요.");
            continue;
          }
          break;
        }catch (Exception e) {}
      }

      if (name[f-1][h-1]==null) {
        System.out.println("이미 퇴실된 객실입니다. 다시 입력해 주십시오.");
        System.out.println();
        continue;
      }

      System.out.println("정말 퇴실 하시겠습니까?");
      System.out.println("[1. 예] [2. 아니오]");
      int ans = Integer.parseInt(sc.nextLine());
      if (ans == 1) {
        System.out.println("퇴실 수속이 완료되었습니다. 이용해 주셔서 감사합니다.");
        name[f-1][h-1] = null;
        System.out.println("\n");
        break;
      } else if (ans == 2) {
        System.out.println("퇴실 수속이 취조 되었습니다.");
        System.out.println("\n");
        break;
      }

      break;
    }

  }

  public void map() {
    while (true) {
      System.out.println("         [델루나 투숙 상태]");
      for (int i = 0; i < name.length; i++) {
        for (int b = 0; b < name[i].length; b++) {
          System.out.printf("%d0%d\t",i+1,b+1);
        }
        System.out.println();

        for (int j = 0; j < name[i].length; j++) {
          if (this.name[i][j] == null) {
            System.out.print("\t");
            continue;
          }
          System.out.printf("%s\t", name[i][j]);
        }
        System.out.print("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
      }

      System.out.print("\n[뒤로가기 9]\n >>");
      String ans = sc.nextLine();
      if (ans == "9") {
        break;
      }
      break;
    }
    System.out.println("\n");

  }

  public void list() {
    while (true) {
      System.out.println("[델루나 투숙 상태]");
      for (int i = 0; i < name.length; i++) {
        for (int j = 0; j < name[i].length; j++) {
          System.out.printf("%d0%d호 ", i+1,j+1);
          if (this.name[i][j] == null) {
            System.out.print("□ \t");
          } else {
            System.out.print("■ " + name[i][j] + "\t");
          }
        }
        System.out.println();
      }
      System.out.print("[뒤로가기 9]\n >> ");
      String ans = sc.nextLine();
      if (ans == "9") {
        break;
      }
      break;
    }
    System.out.println();
  }

  public void exit(int sel) {
    if (sel == 9) {
      System.out.println("호텔 예약 프로그램을 종료합니다.");
      System.exit(0);
    }
  }

  public static void main(String[] args) {

    dfad wh = new dfad();
    wh.process();
  }
}