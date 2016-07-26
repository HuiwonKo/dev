
public class Method1 {
	int number; //�迭�� ������ ����
	int[] array; //���ҵ��� ������ �迭
	public Method1(int number,int[] array){ //constructor
		this.number=number;
		this.array=array;
	}
	public void compute(){
		int firstIndex; //SubList�� ���� Index
		int lastIndex; //SubList�� ������ Index
		int maxSum; //SubList�� �� ���ҵ��� ���� Max
		int currentSum; //��������� �κ���

		firstIndex=0;
		lastIndex=0;
		maxSum=0; //Loop ���� �� Index�� sum �������� �ʱ�ȭ

		for(int i=0;i<number;i++){ //firstIndex�� 1�� ������Ű�� loop
			currentSum=0; //firstIndex�� ��ȭ�� ������ currentSum�� reset
			for(int j=i;j<number;j++){ //lastIndex�� 1�� ������Ű�� loop
				currentSum+=array[j]; //currentSum�� �迭�� ���ҵ��� �ϳ��� ���س���
				if(currentSum>maxSum){ //currentSum�� ��� ���س����� ���� maxSum���� ���� Ŀ����
					maxSum=currentSum; //currentSum �� maxSum�� �ǰ�
					firstIndex=i;
					lastIndex=j; //������ ���� ������� == i,j. ���� firstIndex, lastIndex ���� i,j�� update
				}
			}
		}

		System.out.println("(Method1)");
		System.out.println("The Maximum sum = "+maxSum+", Indices "+firstIndex+","+lastIndex); //����� ���
	}
}
