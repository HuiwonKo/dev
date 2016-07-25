package W14_1;

public class ThreadZero extends Thread{
		public void run(){
			for(int i=0;i<100;i++){
			try{
				Thread.sleep(1); //sleep 1 milli sec
			}catch(InterruptedException e){ //InterruptedException handling for sleep method
				System.out.print(e.getMessage());
			}
			System.out.print("0"); //print 0
			}
		}
}
