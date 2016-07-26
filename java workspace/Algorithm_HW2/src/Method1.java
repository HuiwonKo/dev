
public class Method1 {
	int number; //배열의 원소의 갯수
	int[] array; //원소들을 저장할 배열
	public Method1(int number,int[] array){ //constructor
		this.number=number;
		this.array=array;
	}
	public void compute(){
		int firstIndex; //SubList의 시작 Index
		int lastIndex; //SubList의 마지막 Index
		int maxSum; //SubList의 각 원소들의 합의 Max
		int currentSum; //현재까지의 부분합

		firstIndex=0;
		lastIndex=0;
		maxSum=0; //Loop 수행 전 Index와 sum 변수들의 초기화

		for(int i=0;i<number;i++){ //firstIndex를 1씩 증가시키는 loop
			currentSum=0; //firstIndex가 변화할 때마다 currentSum값 reset
			for(int j=i;j<number;j++){ //lastIndex를 1씩 증가시키는 loop
				currentSum+=array[j]; //currentSum에 배열의 원소들을 하나씩 더해나감
				if(currentSum>maxSum){ //currentSum에 계속 더해나가는 도중 maxSum보다 값이 커지면
					maxSum=currentSum; //currentSum 이 maxSum이 되고
					firstIndex=i;
					lastIndex=j; //현재의 루프 수행상태 == i,j. 따라서 firstIndex, lastIndex 값을 i,j로 update
				}
			}
		}

		System.out.println("(Method1)");
		System.out.println("The Maximum sum = "+maxSum+", Indices "+firstIndex+","+lastIndex); //결과값 출력
	}
}
