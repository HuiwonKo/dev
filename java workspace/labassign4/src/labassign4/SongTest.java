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
		Song s1=new Song(); //Song �� ���� ��ü1 ����
		Song s2=new Song(); //Song �� ���� ��ü2 ����
		Song s3=new Song(); //Song �� ���� ��ü3 ����
		
		System.out.println("*Song1*"); 
		System.out.print("Title:");
		titleName=sc.nextLine(); //����ڷκ��� title �Է�
		s1.setTitle(titleName); //�Է¹��� title set
		System.out.print("Singer:");
		singerName=sc.nextLine(); //����ڷκ��� singer �Է�
		s1.setSinger(singerName); //�Է¹��� singer set
		System.out.print("Price:");
		PriceOfSong=sc.nextInt(); //����ڷκ��� price �Է� 
		s1.setPrice(PriceOfSong); //�Է¹��� price set
		
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
		//Song2 -Song1 �� ������ ��� 
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
		//Song3 -Song1�� ������ ��� 
		System.out.println("Choose song:");
		System.out.println("1."+s1.getTitle()+"2."+s2.getTitle()+"3."+s3.getTitle());
		int songNum=sc.nextInt(); //����ڷκ��� song ���� ��ȣ �Է¹��� 
		System.out.println("How many times?");
		repeatTime=sc.nextInt(); //����ڷκ��� �ݺ� Ƚ�� �Է¹��� 
	    if(songNum==1){ //songNum �� 1�� ��� 
		for(int i=1;i<=repeatTime;i++){
		System.out.println(s1.getTitle()+" by "+s1.getSinger()); //�ݺ� Ƚ����ŭ ���� print 
		}
		s1.playIt(repeatTime); //��� ����ϴ� �޼��� ȣ�� 
		}
		else if(songNum==2){ //songNum �� 2�� ��� 
		for(int i=1;i<=repeatTime;i++){
			System.out.println(s2.getTitle()+" by "+s2.getSinger()); //�ݺ� Ƚ����ŭ ���� print
			}
			s2.playIt(repeatTime); //��� ����ϴ� �޼��� ȣ�� 
		}
		else { //songNum �� 3�� ��� 
		for(int i=1;i<=repeatTime;i++){
			System.out.println(s3.getTitle()+" by "+s3.getSinger()); //�ݺ� Ƚ����ŭ ���� print
			}
			s3.playIt(repeatTime); //��� ����ϴ� �޼��� ȣ�� 
		}
	}

}
