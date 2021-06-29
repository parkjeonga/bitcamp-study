package net.hb.day0628;

public class Lotto {

  public static int[] input() {
    int[] su = new int[6]; 
    su[0] = 3;
    su[1] = 5;
    su[2] = 1;
    su[3] = 2;
    su[4] = 9;
    su[5] = 3;
    return su;
  }

  public static void output(int[] LT) {
    for (int i = 0; i < LT.length; i++) {
      System.out.print(LT[i] + "\t");
    }
    System.out.println("\n로또배열 출력 성공했습니다");
  }


  public int inputHap() { 
    int hap = 0;
    int[] su = new int[6];
    su[0] = 3;
    su[1] = 5;
    su[2] = 1;
    su[3] = 2;
    su[4] = 9;
    su[5] = 4;

    for (int i = 0; i < su.length; i++) {
      hap += su[i]; 
    }

    
    return hap;
  }
}


