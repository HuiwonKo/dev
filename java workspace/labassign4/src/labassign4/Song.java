package labassign4;

public class Song {
	private String title;  
	private String singer;
	private int price; //private 으로 title, singer, price 변수 선언 
	int repeatTime; //반복 횟수 
	int cost; //금액
	public Song(){ //default constructor 생성
	
	}
	public void setTitle(String titleName){ //titleName 에 대한 setter 
		title=titleName;
	}
	public String getTitle(){ //titleName 에 대한 getter
		return title;
	}
	public void setSinger(String singerName){ //singerName 에 대한 setter
		singer=singerName;
	}
	public String getSinger(){ //singerName 에 대한 getter
		return singer;
	}
	public void setPrice(int PriceOfSong){ //PriceOfSong 에 대한 setter
		price=PriceOfSong;
	}
	public int getPrice(){ //PriceOfSong 에 대한 getter
		return price;
	} //
	public void playIt(int repeatTime){ //Total cost 를 계산하고 출력하는 메서드 
		cost=getPrice()*repeatTime;
		System.out.println("Total cost:"+cost);
	}
}
