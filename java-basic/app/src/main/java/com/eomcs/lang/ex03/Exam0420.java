package com.eomcs.lang.ex03;

//# 문자의 리터럴 - 문자 집합(character set)
//- 자바는 문자를 다룰 때 2바이트 값으로 다룬다.
//- 즉 각각의 문자는 규칙에 따라 0 ~ 65535까지의 값으로 메모리에 저장된다.
//- 각 문자를 표현하기 위해 정의된 값을 '문자 코드(character code)'라 부른다.
//- 각 문자에 부여된 문자 코드의 집합을 '문자 집합(chararacter set)'이라 부른다.
//- 자바가 사용하는 문자 집합은 '유니코드(Unicode)'이다.
//
//## 유니코드
//- 전 세계의 모든 문자를 컴퓨터에서 일관되게 처리할 목적으로 정의된 산업 표준 규칙이다.
//- 유니코드는 '문자를 2진수로 표현(인코딩; encoding)'할 때, 두 가지 방식(UTF와 UCS)을 사용한다. 
//- 자바는 메모리에 문자를 저장할 때는 'UCS(국제 문제 집합)'를 사용하고, 외부로 입출력 할 때는 'UTF'를 사용한다.
//
//## UCS(Universal Coded Character Set; 국제 문자 집합)
//- 'ISO 10646' 표준을 가리키는 이름이다.
//- UCS는 110만개 이상의 문자에 대해 코드 값을 정의하고 있다.
//- 그 중에서 첫 65536개(0 ~ 65535 까지의 코드)의 문자 코드가 주로 사용된다.
//- 이 범위의 유니코드를 'BMP(Basic Multilingual Plane; 기본 다국어 평면)'라 하며 보통 'UCS-2'라 부른다.
//  즉 2바이트 범위에서 정의한 유니코드라는 의미다.  
//- 자바가 사용하는 유니코드는 바로 이 'UCS-2'라 불리는 범위의 유니코드이다.
// 
//## UTF(UCS Transformation Format)
//- 문자를 1바이트 코드 값으로 저장하는 기존 시스템에서 UCS를 사용하기 위해 만든 문자 인코딩 방식이다.
//- UTF-8, UTF-16, UTF-32가 있으며 주로 UTF-8이 사용된다.
//
//## UTF-8
//- UCS의 코드 값 중에서 00 ~ 7F(127개)까지 ASCII에 해당하는 UCS 코드는 그대로 1바이트로 표현한다.
//  따라서 ASCII를 기본으로 사용하는 시스템의 경우 UTF-8로 인코딩 된 데이터를 특별한 처리없이 그대로 읽고 쓸 수 있다.
//- 그 외의 문자 코드는 규칙에 따라 2바이트 ~ 4바이트까지 변환하여 표현한다.
//- UCS의 UTF-8 변환 규칙
//  000000 ~ 00007F: 0xxxxxxx
//  000080 ~ 0007FF: 110yyyxx 10xxxxxx
//  000800 ~ 00FFFF: 1110yyyy 10yyyyxx 10xxxxxx
//  100000 ~ 10FFFF: 11110zzz 10zzyyyy 10yyyyxx 10xxxxxx 
//- 대부분의 시스템에서 데이터 입출력 할 때 UTF-8을 사용한다.
//- 자바에서도 데이터 입출력할 때 주로 UTF-8을 사용하고 있다.
// 
//## UTF-16
//- UCS-2의 코드 값은 그대로 2바이트로 표현한다.
//- ASCII 코드도 UCS-2와 동일하게 2바이트로 표현한다.
//- 따라서 UCS-2의 코드 값을 표현할 때는 UCS-2와 같다. 
//- UCS-2와 다른 점은 UCS-2의 범위를 벗어나는 문자 코드 값도 표현할 수 있으며,
//  UCS-2를 벗어나는 유니코드는 무조건 4바이트로 변환한다.
//- UCS의 UTF-16 변환 규칙
//  000000 ~ 00007F: 00000000 0xxxxxxx
//  000080 ~ 0007FF: 00000yyy xxxxxxxx
//  000800 ~ 00FFFF: yyyyyyyy xxxxxxxx
//  100000 ~ 10FFFF: 110110zz zzyyyyyy 110111yy xxxxxxxx 
//
//## UTF-32
//- UCS-4의 4바이트 코드 값을 그대로 표현한다.
//- 즉 UTF-32는 UCS-4와 같다.
//- 모든 문자를 4바이트 코드 값으로 표현하기 때문에 메모리 낭비가 심하다.
//

public class Exam0420 {
  public static void main(String[] args) {
    
    //## 문자 'A'의 문자 코드를 직접 사용하여 문자를 출력하기
    //유니코드 문자집합에서 문자 'A'의 문자 코드는 65 이다.
    
    //println()에 숫자를 그냥 전달하면 일반 숫자인줄 알고 그대로 출력한다.
    System.out.println(65);

    //println()에 전달하는 값이 일반적인 수가 아니라 문자 코드임을 지정해야 한다.
    //숫자 앞에 (char) 를 붙여 이 숫자가 평범한 숫자가 아니라 문자의 UCS-2 코드 값임을 알려줘라.
    //  (char)문자코드
    System.out.println((char)65);

    //보통 문자 코드를 표현할 때 16진수를 사용한다.
    System.out.println((char)0x41);

    //한글 '가'를 문자 코드를 이용하여 출력하기
    System.out.println((char)0xAC00);
    
    //'가' 다음 문자 출력하기
    System.out.println((char)(0xAC00 + 1));
    
    //영어 대문자 모두 출력하기
    //첫 번째 알파벳의 코드 값만 안다면 + 연산자를 이용하여 출력할 수 있다.
    for (int i = 0; i < 26; i++) {
      System.out.print((char)(i + 65) + ",");
    }
  }
}

/*
65
A
A
가
각
A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,
결과값 */

//## 정리
//
//문자를 컴퓨터에 저장하는 방법
//- 2진수화(인코딩; encoding) 시켜서 저장한다.
//
//문자를 2진수로 변환하는 규칙
//- 문자집합(character set)
//
//1) ASCII (7bit) 
//- 미국 국가 표준 협회(ANSI)에서 영어 알파벳, 숫자, 특수 문자 등을 컴퓨터에서 저장할 수 있도록 7비트 2진수로 정의한 인코딩 규칙
//- A(0x41), B(0x42), a(0x61), b(0x62), 스페이스(0x20), LF(0x0a), CR(0x0d), 
//  !(0x21), #(0x23), $(0x24), %(0x25), &(0x26), +(0x2b),
//  0(0x30), 1(0x31), =(0x3d), ?(0x3f), @(0x40) 등.
//
//* 참고!
//- 윈도우 OS에서는 LFCR 두 바이트를 사용하여 줄 바꿈을 표시한다.
//- macOS, Linux, Unix 에서는 LF 1바이트만 사용하여 줄 바꿈을 표현한다.
//
//2) ISO-8859-1(ISO-latin-1)
//- HTML 문서의 기본 인코딩이다.
//- ASCII 문자에 유럽 문자까지 포함하는 국제 표현 문자 인코딩 규칙이다.
//- 가장 널리 쓰이며 대부분의 서유럽 언어를 지원한다. 
//  네덜란드어, 노르웨이어, 덴마크어, 독일어, 로만슈어, 스웨덴어 스코틀랜드 게일어, 
//  아이슬란드어, 아일랜드어, 에스파냐어, 영어, 이탈리아어, 페로어, 포르투갈어, 
//  프랑스어, 핀란드어, 동유럽의 알바니아어, 아프라카의 스와힐리어, 아프리칸스어. 
//
//3) EUC-KR(2바이트; 한글 2560자 + 한자 등 포함)
//- 국제 표준 한글 문자 집합이다.
//- 한글 음절 한 개에 대해 인코딩 규칙을 정의한 완성형 인코딩 규칙이다.
//- 현재 유통되는 모든 한글 음절을 표현할 수 없다.
//- 가(0xb0a1), 각(0xb0a2), 똘(0xb6ca), 똠(?), 똥(0xb6cb) 등 
//
//4) 조합형(2바이트; 한글(1) + 초성(5비트) + 중성(5비트) + 종성(5비트))
//- 국제 표준이 아니다.
//- 초성: ㄱ(00010), ㄲ(00011), ㄴ(00100), ㄷ(00101), ...
//- 중성: ㅏ(00011), ㅐ(00100), ㅑ(00101), ㅒ(00110), ...
//- 종성: ㄱ(00010), ㄲ(00011), ㄱㅅ(00100), ㄴ(00101), ... 
//- 예) 꺅(1000 1100 1010 0010 = 0x8ca2)
//
//5) MS949(=CP949; 2바이트)
//- 윈도우 OS의 인코딩 규칙이다.
//- EUC-KR + 현재 유통되는 한글 음절 추가 = MS949 (11172자 + 한국 전용 한자 + 옛한글 등)
//- MS949에 추가된 문자 예: 똠(0x8c63), 똡(0x8c64), 등
//- 기존의 EUC-KR에 문자 코드를 추가했기 때문에 정렬할 때 문제가 발생한다.
//  "똘똠똡똥(b6ca 8c63 8c64 b6cb)" 문자를 정렬한다면,
//  코드의 순서에 따라 "똠똡똘똥"으로 나열될 것이다.
//
//6) Unicode
//- 국제 표준 인코딩 규칙이다.
//- UCS-2(Universal Coded Character Set)의 경우 영어, 한글 모두 2바이트로 인코딩한다.
//- MS949의 모든 한글 문자가 포함되어 있다.
//- A(0x0041), B(0x0042), +(0x002b), 가(0xac00), 각(0xac01), ...
//- 기존의 EUC-KR과 MS949 코드와 호환되지 않는다.
//- JVM은 내부에서 문자열을 다룰 때 UCS-2를 사용한다.
//  즉 영어, 한글 모두 2바이트 유니코드로 다룬다.
//
//7) UTF-8(1~4바이트; Unicode Transformation Format)
//- 기존 영어권 시스템에서 유니코드 문자를 사용하기 위해 탄생함.
//- 기존 시스템은 ISO-8859-1 규칙에 따라 영어를 1바이트로 다룬다.
//  그러나 유니코드는 영어를 2바이트로 다룬다.
//- 유니코드를 사용하려면 영어를 2바이트로 다뤄야 하기 때문에 기존 시스템을 모두 변경해야 한다.
//- 즉 기존 시스템을 변경하지 않고 유니코드를 사용할 수 있도록 하기 위해 UTF-8을 만들었다.
//
//* 한글 '가'의 UTF-8 코드
//- 한글은(ac00 ~ d7af) 0800 ~ ffff 에 속하기 때문에 3바이트로 변환한다.
//- UCS-2의 '가(0xac00)'를 UTF-8로 인코딩하기
//  '가' => 1010 1100 0000 0000 (UTF-16) 
//      => 1110 1010 1011 0000 1000 0000 (UTF-8)
//      => 0xEAB080
//