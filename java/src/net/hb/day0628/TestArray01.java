package net.hb.day0628;

public class TestArray01 {
  public static void main(String[] args) {

    String[] dong = new String[5];
    for(int i=0; i < dong.length; i++) {
      System.out.print(dong[i]+" ");
    }
    System.out.println();
    boolean[] camp = new boolean[5];
    for(int i=0; i < camp.length; i++) {
      System.out.print(camp[i]+" ");
    }
    System.out.println();
    double[] pi = new double[5];
    for(int i=0; i < pi.length; i++) {
      System.out.print(pi[i]+" ");

      //배열은 같은타입으로만 구성, 크기 사이즈 고정
      //채팅구성원 정보 닉이름 String, 나이int, 성별boolean => 배열구성비권장
      //웹 web 게시판 글쓴이, 제목, 이미지, 조회수, 날짜
      //채팅, 쇼핑몰, 게시판 구성할 때 배열의 한계극복 collection모음 List계열
      //java.util 팩키지 List인터페이스 상속 - ArrayList클(쇼핑몰에서 많이 사용), Vector클
      //java.util 팩키지 Map인터페이스, set 인터페이스(중복값제외), List 인터페이스
      //같은 타입 구성, 크기 고정인 배열의 단점을 List인터페이스상속 으로 해결
      //같은 타입 구성, 크기 고정인 1차원 배열
      //boolean[] camp = new boolean[5]; // false 기본값 출력
      //배열 및 문자열 시작 위치 0번째 부터입니다.
      //자바에서 표준출력 모니터 System.out ==> PrintStream
      //자바에서 표준 입력 키보드 System.in ==> Scanner클래스생성자
    }
  }//end
}//class ENd
