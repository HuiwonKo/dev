package W14_2;

public class SimulThread extends Thread{
	SharedArea sharedArea;
	private int num;
	public SimulThread(int num,SharedArea sharedArea){ //constructor
		this.num=num;
		this.sharedArea=sharedArea;
	}
	public void run(){
		int count=0; //front 나온 횟수
		for(int i=0;i<num;i++){
		if(Math.round(Math.random())==0) //0일 경우 front로 간주
			count++; 
			}
		sharedArea.ratio=((double)count/(double)num)*100; //ratio
		sharedArea.isReady=true; //finished computing ratio
		synchronized(sharedArea){
			sharedArea.notify(); //notify
		}
	}
}
