package labassign4;

public class Song {
	private String title;  
	private String singer;
	private int price; //private ���� title, singer, price ���� ���� 
	int repeatTime; //�ݺ� Ƚ�� 
	int cost; //�ݾ�
	public Song(){ //default constructor ����
	
	}
	public void setTitle(String titleName){ //titleName �� ���� setter 
		title=titleName;
	}
	public String getTitle(){ //titleName �� ���� getter
		return title;
	}
	public void setSinger(String singerName){ //singerName �� ���� setter
		singer=singerName;
	}
	public String getSinger(){ //singerName �� ���� getter
		return singer;
	}
	public void setPrice(int PriceOfSong){ //PriceOfSong �� ���� setter
		price=PriceOfSong;
	}
	public int getPrice(){ //PriceOfSong �� ���� getter
		return price;
	} //
	public void playIt(int repeatTime){ //Total cost �� ����ϰ� ����ϴ� �޼��� 
		cost=getPrice()*repeatTime;
		System.out.println("Total cost:"+cost);
	}
}
