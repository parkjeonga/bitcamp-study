package net.hb.day0628;

public interface Boardimp {
  // 메소드만 선언 = 추상 메소드 = 이런거라고 명시
  // abstract 키워드 생략가능, 기술해도 에러 없음
  public abstract int boardCount();
  public abstract boolean boardInsert();
  public void boardDelete(int num);

}
