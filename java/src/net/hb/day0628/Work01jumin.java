package net.hb.day0628;

public class Work01jumin {
  public static void main(String[] args) {
    String min = "871024-4541965";

    // 문제 1
    if (min.length() == 14 && min.charAt(6)=='-') {
      System.out.println("총자리 수는 " + min.length() + "자리 입니다");

      // 문제 2
      int pos = min.indexOf("-");
      String[] last = new String[pos] ;

      for (int i = 0; i < pos ; i++  ) {
        last[i] = "*";
        System.out.print(last[i]);
      }
      System.out.println(min.substring(6));

      // 문제 3
      switch(min.charAt(7)) {
        case '1':
        case '3':
          System.out.println("남성입니다");
          break;
        case '2':
        case '4':
          System.out.println("여성입니다");
          break;
        default:
          System.out.println("성별이 잘못 입력 되었습니다. 다시 입력해주세요.");
      }
    } 

    else {
      System.out.println("잘못된 표기 입니다.");
      System.out.println("******-******* 형태로 입력 해주세요");

    }
  }
}
