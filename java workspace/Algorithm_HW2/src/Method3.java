
public class Method3 {
	int number; //배열의 원소의 갯수 
	int[] array; //원소들을 저장할 배열 
	public Method3(int number,int[] array){ //constructor 
		this.number=number; 
		this.array=array;
	}
	public void compute(){ 
		int firstIndex; //SubList의 시작 Index 
		int lastIndex;  //SubList의 마지막 Index
		int currentSum; //현재까지의 부분합 
		int maxSum;  //SubList의 각 원소들의 합의 Max
		
		firstIndex=0; 
		lastIndex=0;
		currentSum=0;
		maxSum=0; //Loop 수행 전 Index와 sum 변수들의 초기화 
		
		for(int i=0;i<number;i++){ //maxSum을 0으로 초기화했으므로 index=0 부터 시작 
			currentSum+=array[i]; //currentSum에 array의 원소들을 하나씩 더해서 저장
			if(currentSum>maxSum){ //currentSum이 maxSum을 초과할 경우 
				maxSum=currentSum;
				lastIndex=i; //currentSum을 maxSum으로 update하고 lastIndex를 update 
			}
			if(currentSum<0){ //currentSum이 음수일 경우 
				currentSum=0;
				firstIndex=i+1; //currentSum을 0으로 만들고 firstIndex를 update
			}
		}
		System.out.println("(Method3)");
		System.out.println("The Maximum sum = "+maxSum+", Indices 83224,"+lastIndex); //결과값 출력
	}
}
