
public class Method2 {
	static int number; //�迭�� ������ ���� 
	static int[] array; //���ҵ��� ������ �迭 
	public Method2(int number, int[] array){ //constructor 
		this.number=number; 
		this.array=array;
	}
	public static int compute(int[] array, int firstIndex, int lastIndex){
		int maxLeftSum, maxRightSum; //left,right SubArray�� max 
		int maxLeftBorderSum, maxRightBorderSum; //border ���� left,right SubArray�� max 
		int leftBorderSum, rightBorderSum; //border ���� left,right SubArray�� sum 
		int midIndex; //�߰� Index 
		int maxSum; //�ִ� �κ���
		
		if(firstIndex == lastIndex){ //�迭�� ���Ұ� �� ���� ��� 
			return array[0]; //�� ���� ���� 
		} 
	
		midIndex=(firstIndex+lastIndex)/2; //�߰� Index ��� 
		
		maxLeftSum=compute(array,firstIndex,midIndex); //left SubArray�� max Sum ���ϱ� 
		maxRightSum=compute(array,midIndex+1,lastIndex); //right SubArray�� max Sum ���ϱ� 
		
		maxLeftBorderSum=0; 
		leftBorderSum=0; //border ������ left SubArray ���� ���� �ʱ�ȭ 
		for(int i=midIndex; i>firstIndex; i--){
			leftBorderSum+=array[i];
			if(leftBorderSum>maxLeftBorderSum)
				maxLeftBorderSum=leftBorderSum;
		} //leftBorderSum ���ϱ� 
		maxRightBorderSum=0;
		rightBorderSum=0; //border ������ right SubArray ���� ���� �ʱ�ȭ 
		for(int j=midIndex+1;j<=lastIndex;j++){
			rightBorderSum+=array[j];
			if(rightBorderSum>maxRightBorderSum){
				maxRightBorderSum=rightBorderSum;
			}
		} //rightBorderSum ���ϱ� 
		
		maxSum=maxLeftSum; //maxSum�� maxLeftSum �̶�� �����ϰ� 
		
		if(maxSum<maxRightSum){
			maxSum=maxRightSum;
		}
		if(maxSum<(maxLeftBorderSum+maxRightBorderSum)){
			maxSum=maxLeftBorderSum+maxRightBorderSum;
		} //maxLeftSum, maxRightSum, maxLeftBorderSum+maxRightBorderSum �� �ִ밪 ���ϱ� 
		return maxSum; 
	}
	public static void print(){ //����� ��� �޼��� 
		System.out.println("(Method2)"); 
		compute(array,0,number-1); 
	}
}

