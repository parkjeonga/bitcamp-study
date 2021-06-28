
public static void menu() {
  for(int i=0; i<camp.length; i++) {
    if(camp[i]==true) {
      System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
    }else {
      System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
    }
  } 
}


public static void input() {
  System.out.print("예약캠핑번호 입력>>> ");
  num=Integer.parseInt(sc.nextLine()); //고객이 5입력

  if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); }
  if(camp[num-1]==true) {
    System.out.println("이미 예약된 캠프장 사용 할 수 없습니다");
  } else {
    System.out.println("camp["+num+"] 캠프장 예약성공");
    camp[num-1] = true;
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프 예약 성공 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    }
  }
}


public static void output() {
  System.out.print("퇴실캠핑번호 입력>>> ");
  num=Integer.parseInt(sc.nextLine()); //3입력하면 
  if(camp[num-1]==true) {
    System.out.println("camp["+num+"] 캠프장 퇴실성공했습니다");
    camp[num-1] = false;


  } else {
    System.out.println("camp["+num+"] 비어있는 캠프장입니다");
  }
  for(int i=0; i<camp.length; i++) {
    if(camp[i]==true) {
      System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
    }else {
      System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
    }
  }
}


public static void printAll() {
  for(int i=0; i<camp.length; i++) {
    if(camp[i]==true) {
      System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
    }else {
      System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
    }
  }
} 


public void myExit() {
  if(sel==9) {
    System.out.println("캠프장예약프로그램을 종료합니디");
  }
}


}//class END