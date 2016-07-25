
public class Method3 {
	int number; //�迭�� ������ ���� 
	int[] array; //���ҵ��� ������ �迭 
	public Method3(int number,int[] array){ //constructor 
		this.number=number; 
		this.array=array;
	}
	public void compute(){ 
		int firstIndex; //SubList�� ���� Index 
		int lastIndex;  //SubList�� ������ Index
		int currentSum; //��������� �κ��� 
		int maxSum;  //SubList�� �� ���ҵ��� ���� Max
		
		firstIndex=0; 
		lastIndex=0;
		currentSum=0;
		maxSum=0; //Loop ���� �� Index�� sum �������� �ʱ�ȭ 
		
		for(int i=0;i<number;i++){ //maxSum�� 0���� �ʱ�ȭ�����Ƿ� index=0 ���� ���� 
			currentSum+=array[i]; //currentSum�� array�� ���ҵ��� �ϳ��� ���ؼ� ����
			if(currentSum>maxSum){ //currentSum�� maxSum�� �ʰ��� ��� 
				maxSum=currentSum;
				lastIndex=i; //currentSum�� maxSum���� update�ϰ� lastIndex�� update 
			}
			if(currentSum<0){ //currentSum�� ������ ��� 
				currentSum=0;
				firstIndex=i+1; //currentSum�� 0���� ����� firstIndex�� update
			}
		}
		System.out.println("(Method3)");
		System.out.println("The Maximum sum = "+maxSum+", Indices 83224,"+lastIndex); //����� ���
	}
}
