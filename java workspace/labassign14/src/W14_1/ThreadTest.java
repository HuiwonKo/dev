package W14_1;

public class ThreadTest {
		public static void main(String[] args) {
			System.out.println("===========================");
			System.out.println("Major:Computer Engineering");
			System.out.println("ID:1415005");
			System.out.println("Name:Ko Huiwon");
			System.out.println("===========================");
			ThreadOne t1=new ThreadOne();
			ThreadZero t2=new ThreadZero();
			
			t1.start();
			t2.start();
		}
}
