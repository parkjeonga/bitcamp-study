package com.eomcs.lang.ex04;
public class Test01 {
  public static void main(String[] args) {
    char c; // Unicode 문자 코드(65535)를 저장하는 변수
    c=0x0041; // A 문자에 해당하는 Unicode를 16진수로 표현하여 저장한다.
    
    System.out.println(c);
    /* c 변수에 저장된 문자 코드를 println()에 던달하면 
       println() 명령은 그 문자 코드에 해당하는 폰트를 찾아 화면에 출력한다. 
    */
    c=0x41; // 숫자 앞의 00은 생략 해도 된다
    System.out.println(c);

    c = 65;//A 문자의 유니코드를10진수로 표현해도 된다
    System.out.println(c);

    c='헐'; // 한글 '헐'의 유니코드 값(0xD500)을 c변수에 저장한 후 출력한다.  한글 헐 값 저장X, 유니코드값을 저장한다
    System.out.println(c);

  }
}
