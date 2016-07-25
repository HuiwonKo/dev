package W14_2;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	public PrintThread(SharedArea sharedArea){ //constructor 
		this.sharedArea=sharedArea;
	}
	public void run(){ 
		if(sharedArea.isReady!=true){
		try{
			synchronized(sharedArea){ //synchronized
				sharedArea.wait();  //wait 
			}
		}catch(InterruptedException e){ //InterruptedException handling for wait method 
			System.out.println(e.getMessage());	
		}
		}
		System.out.println("Front Ratio:"+sharedArea.ratio+"%");
		}
}
