
public class Method2 {
	static int number; //배열의 원소의 갯수 
	static int[] array; //원소들을 저장할 배열 
	public Method2(int number, int[] array){ //constructor 
		this.number=number; 
		this.array=array;
	}
	public static int compute(int[] array, int firstIndex, int lastIndex){
		int maxLeftSum, maxRightSum; //left,right SubArray의 max 
		int maxLeftBorderSum, maxRightBorderSum; //border 기준 left,right SubArray의 max 
		int leftBorderSum, rightBorderSum; //border 기준 left,right SubArray의 sum 
		int midIndex; //중간 Index 
		int maxSum; //최대 부분합
		
		if(firstIndex == lastIndex){ //배열의 원소가 한 개일 경우 
			return array[0]; //그 원소 리턴 
		} 
	
		midIndex=(firstIndex+lastIndex)/2; //중간 Index 계산 
		
		maxLeftSum=compute(array,firstIndex,midIndex); //left SubArray의 max Sum 구하기 
		maxRightSum=compute(array,midIndex+1,lastIndex); //right SubArray의 max Sum 구하기 
		
		maxLeftBorderSum=0; 
		leftBorderSum=0; //border 인접한 left SubArray 관련 변수 초기화 
		for(int i=midIndex; i>firstIndex; i--){
			leftBorderSum+=array[i];
			if(leftBorderSum>maxLeftBorderSum)
				maxLeftBorderSum=leftBorderSum;
		} //leftBorderSum 구하기 
		maxRightBorderSum=0;
		rightBorderSum=0; //border 인접한 right SubArray 관련 변수 초기화 
		for(int j=midIndex+1;j<=lastIndex;j++){
			rightBorderSum+=array[j];
			if(rightBorderSum>maxRightBorderSum){
				maxRightBorderSum=rightBorderSum;
			}
		} //rightBorderSum 구하기 
		
		maxSum=maxLeftSum; //maxSum을 maxLeftSum 이라고 가정하고 
		
		if(maxSum<maxRightSum){
			maxSum=maxRightSum;
		}
		if(maxSum<(maxLeftBorderSum+maxRightBorderSum)){
			maxSum=maxLeftBorderSum+maxRightBorderSum;
		} //maxLeftSum, maxRightSum, maxLeftBorderSum+maxRightBorderSum 중 최대값 구하기 
		return maxSum; 
	}
	public static void print(){ //결과값 출력 메서드 
		System.out.println("(Method2)"); 
		compute(array,0,number-1); 
	}
}

