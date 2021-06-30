package net.hb.day0628;

import java.io.InputStream;
import java.util.Scanner;

public class Work02emp {
  public static void main(String[] args) {
    InputStream is = System.in ;  
    Scanner sc = new Scanner(is);
    int sabun = 0;
    String name = null;

    while(true) {
      try {
        System.out.print("\n사번입력>>>");
        sabun = Integer.parseInt(sc.nextLine()); //숫자,문자 다 입력해서 단점 해결 
        System.out.print("이름입력>>>");
        name = sc.nextLine();
        if(name.equals("")  || name.equals(null)){
          System.out.println("이름데이터 정확히 입력하세요");
          continue;
        }
        break;
      }catch (Exception e){    } // sabun에 문자형을 입력 받으면 오류 생성 되므로 try 사용 
      // break 문을 못만났으므로 입력받을때까지 무한 반복
    }

    System.out.println();
    System.out.println("사번 = " + sabun);
    System.out.println("이름 = " + name);
  }
}



