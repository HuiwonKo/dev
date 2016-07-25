package labassign4;

import java.util.Scanner;

public class SongTest { 

	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		String titleName;
		String singerName;
		int PriceOfSong;
		int repeatTime;
		int k; 
		Scanner sc=new Scanner(System.in);
		Song s1=new Song(); //Song 에 대한 객체1 생성
		Song s2=new Song(); //Song 에 대한 객체2 생성
		Song s3=new Song(); //Song 에 대한 객체3 생성
		
		System.out.println("*Song1*"); 
		System.out.print("Title:");
		titleName=sc.nextLine(); //사용자로부터 title 입력
		s1.setTitle(titleName); //입력받은 title set
		System.out.print("Singer:");
		singerName=sc.nextLine(); //사용자로부터 singer 입력
		s1.setSinger(singerName); //입력받은 singer set
		System.out.print("Price:");
		PriceOfSong=sc.nextInt(); //사용자로부터 price 입력 
		s1.setPrice(PriceOfSong); //입력받은 price set
		
		System.out.println("*Song2*");
		System.out.print("Title:");
		titleName=sc.nextLine();
		titleName=sc.nextLine();
		s2.setTitle(titleName);
		System.out.print("Singer:");
		singerName=sc.nextLine();
		s2.setSinger(singerName);
		System.out.print("Price:");
		PriceOfSong=sc.nextInt();
		s2.setPrice(PriceOfSong);
		//Song2 -Song1 과 동일한 방법 
		System.out.println("*Song3*");
		System.out.print("Title:");
		titleName=sc.nextLine();
		titleName=sc.nextLine();
		s3.setTitle(titleName);
		System.out.print("Singer:");
		singerName=sc.nextLine();
		s3.setSinger(singerName);
		System.out.print("Price:");
		PriceOfSong=sc.nextInt();
		s3.setPrice(PriceOfSong);
		//Song3 -Song1과 동일한 방법 
		System.out.println("Choose song:");
		System.out.println("1."+s1.getTitle()+"2."+s2.getTitle()+"3."+s3.getTitle());
		int songNum=sc.nextInt(); //사용자로부터 song 선택 번호 입력받음 
		System.out.println("How many times?");
		repeatTime=sc.nextInt(); //사용자로부터 반복 횟수 입력받음 
	    if(songNum==1){ //songNum 이 1일 경우 
		for(int i=1;i<=repeatTime;i++){
		System.out.println(s1.getTitle()+" by "+s1.getSinger()); //반복 횟수만큼 문장 print 
		}
		s1.playIt(repeatTime); //결과 출력하는 메서드 호출 
		}
		else if(songNum==2){ //songNum 이 2일 경우 
		for(int i=1;i<=repeatTime;i++){
			System.out.println(s2.getTitle()+" by "+s2.getSinger()); //반복 횟수만큼 문장 print
			}
			s2.playIt(repeatTime); //결과 출력하는 메서드 호출 
		}
		else { //songNum 이 3일 경우 
		for(int i=1;i<=repeatTime;i++){
			System.out.println(s3.getTitle()+" by "+s3.getSinger()); //반복 횟수만큼 문장 print
			}
			s3.playIt(repeatTime); //결과 출력하는 메서드 호출 
		}
	}

}
