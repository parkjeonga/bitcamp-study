package net.hb.day0628;

import java.io.InputStream;

public class Work02emp {
  public static void main(String[] args) throws Exception {  //throws Exception = try catch 와 동일
    //    try {
    InputStream is = System.in ; // static InputStream in필드 표준 , ascii코드
    //Scanner sc = new Scanner(is) ; 

    System.out.print("단입력 >>> ");
    int dan = is.read() ;
    for (int a = 1; a < 10 ; a++) {
      System.out.println(dan +"*"+ a +" = "+(dan*a));
    }

    //   } catch (IOException e) {}
  }
}
