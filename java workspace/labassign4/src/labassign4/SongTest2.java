package labassign4;

import java.util.Scanner;

public class SongTest2 {
	public static void main(String[] args) {
		
	String titleName;
	String singerName;
	int PriceOfSong;
	int repeatTime;
	int k;
	Scanner sc=new Scanner(System.in);
	Song[] s=new Song[3];
	for(k=0;k<3;k++){
	System.out.println("*Song*");
	System.out.print("Title:");
	titleName=sc.nextLine();
	s[k].setTitle(titleName);
	System.out.print("Singer:");
	singerName=sc.nextLine();
	s[k].setSinger(singerName);
	System.out.print("Price:");
	PriceOfSong=sc.nextInt();
	s[k].setPrice(PriceOfSong);
	}
	System.out.println("Choose song:");
	System.out.println("1."+s[0].getTitle()+"2."+s[1].getTitle()+"3."+s[2].getTitle());
	int songNum=sc.nextInt();
	System.out.println("How many times?");
	repeatTime=sc.nextInt();
	System.out.println(s[(songNum-1)].getTitle()+"by"+s[(songNum-1)].getSinger());
	s[(songNum-1)].playIt(repeatTime);
	
	}
}
