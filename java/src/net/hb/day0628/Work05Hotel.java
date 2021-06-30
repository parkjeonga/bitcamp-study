package net.hb.day0628;
import java.util.Scanner;

public class Work05Hotel {
  private int floor ;
  private int room ;
  private String [][] name = new String [3][5] ;
  private String title ;

  public Work05Hotel() {}
  public Work05Hotel(String name) {

  }

  public Work05Hotel(String name, int year) {

  }

  public void process() {
    Scanner sc = new Scanner(System.in);
    int sel = 9;
    while (true) {
      System.out.print("\n1.투숙 2.퇴실 3.map 4.list 9.종료>>>>");
      sel = Integer.parseInt(sc.nextLine());
      if(sel==9) {System.out.println("호텔예약프로그램 종료합니다.");
      System.exit(1);
      }
      switch (sel) {   

      }
    }
  }

  public void checkIn() {

  }

  public void checkOut() {

  }

  public void map() {

  }

  public void list() {

  }

  public static void main(String[] args)  {  


    Work05Hotel wh = new Work05Hotel();
    wh.process();





  }
}
