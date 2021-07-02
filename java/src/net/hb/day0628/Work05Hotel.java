package net.hb.day0628;

import java.util.Scanner;

public class Work05Hotel {   

  private int floor ; //층=행 3층
  private int room ;  //호=열 5호  3층*5열=15방구성
  private String[][] name = new String[3][5];
  private String title;
  static Scanner sc = new Scanner(System.in);
  public Work05Hotel(){ }
  public Work05Hotel(String name){ }
  public Work05Hotel(String name, int year){ }


  public void process() {

    int sel = 9;

    System.out.print("\n1.투숙  2.퇴실  3.map  4.list 9.종료 >>>");

    sel = sc.nextInt();

    switch(sel) {
      case 1:
        checkIn();
        break;
      case 2:
        checkOut();
        break;
      case 3:
        map();
        break;
      case 4:
        list();
        break;
      case 9:
        System.out.println("호텔예약프로그램 종료합니다");
        System.exit(1);
        break;
      default:
        System.out.println("번호가 옳지 않습니다.");

    }//switch end
  }//end


  public void checkIn() {


    while(true) {
      try {
        System.out.print("몇층에 투숙? ");
        floor = sc.nextInt();

        System.out.print("몇호에 투숙? ");
        room = sc.nextInt();
        sc.nextLine();

        if (floor<0 || floor>name.length || room<0 || room > name[0].length) {
          System.out.println("해당 방이 없습니다. 다시 입력해주세요 저희호텔은 1~3층까지 있으며 각 층당 5호씩 있습니다");
          System.out.println("");continue;
        }
        break;
      }catch (Exception e){    } 
    }
    if( name[floor-1][room-1] == null){ 
      System.out.print("투숙객 이름? ");
      name[floor-1][room-1]= sc.nextLine();
      System.out.println(" # 성공적으로 "+ floor +"0"+room+"호에 checkIn 되었습니다.");
    }  else {
      System.out.println("#이미 예약된 방입니다"); 
    } 

    process();

  }//end

  public void checkOut() {

    String z;


    loop:while(true) {
      while(true) {
        try {
          System.out.print("몇층에 퇴실? ");
          floor = sc.nextInt();
          System.out.print("몇호에 퇴실? ");
          room = sc.nextInt();
          sc.nextLine();
          if (floor < 0 || floor > name.length || room<0 || room>name[0].length) {
            System.out.println("해당 방이 없습니다. 다시 입력해주세요 저희호텔은 1~3층까지 있으며 각 층당 5호씩 있습니다");
            System.out.println("");continue;
          }   break;
        } catch (Exception e){    } 
      }

      System.out.print("투숙객 이름? ");
      z= sc.nextLine();
      if (this.name[floor-1][room-1] == null){
        System.out.println("빈방입니다. 다시입력해주세요.");
        System.out.println("");
      } else if(!name[floor-1][room-1].equals(z) ){
        System.out.println("성함이 잘못입력되었습니다. 다시입력해주세요.");
        System.out.println("");

      } else {
        System.out.println(" # 성공적으로 "+ floor+"0"+room+"호 checkOut 되었습니다.");
        name[floor-1][room-1] = null ;
        break loop;

      }

    }
    process();
  }


  //end

  public void map(){ //non-static메소드 


    System.out.println("\n\t[ 투숙 상태 ]");
    for(int i = 0; i < 3; i++){
      for(int b = 0; b < 5; b++){
        System.out.print((i+1)+"0"+(b+1)+"\t");
      }

      System.out.println(); //이름표시 공백란입니다

      for(int j = 0; j < 5; j++){
        if(this.name[i][j] == null){
          System.out.print("\t");
          continue;
        }//if end
        System.out.print(this.name[i][j]+"\t"); 
      }//j end
      System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); // \n꼭넣으세요 
    }//for i end
    process();
  } //map end

  public void list() { //영림쌤 구현해서 보여드리겠습니다 
    System.out.println("\n\t[ list ]");
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 5; j++){
        if(name[i][j] == null) {
          System.out.print(" " + (i+1) + "0" + (j+1)+"호"+" □\t"+"\t");
        } else {
          System.out.print(" " + (i+1) + "0" + (j+1)+"호"+" ■\t"+name[i][j]+"\t");
        }

      } System.out.println();
    }//for i end
    process();


  }//end

  public static void main(String[] args) {
    System.out.println("호텔에 오신걸 환영합니다");
    Work05Hotel wh = new Work05Hotel();
    wh.process();

  }//end
}//class END



