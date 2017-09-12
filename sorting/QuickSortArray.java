import java.util.Random;

public class QuickSortArray{

	int[] theArray=new int[10];
	int arraySize=5;

	public void createArray(){

		for(int i=0;i<arraySize;i++){
				Random random=new Random();
				theArray[i]=random.nextInt(20);
		}
	}

	public void printArray(){
		for(int i=0;i<arraySize;i++){
			if(i!=0)
				System.out.print(", ");
			System.out.print(theArray[i]);
		}
		System.out.println("");
	}



	public void quickSort(int startIndex,int endIndex){
		System.out.println(startIndex + " "+ endIndex);
		if(startIndex == endIndex){
			return;
		}
		else if(endIndex - startIndex == 1){
			if(theArray[startIndex] > theArray[endIndex]){
				int temp=theArray[startIndex];
				theArray[startIndex]=theArray[endIndex];
				theArray[endIndex]=temp;
			}
		}else{
			int pivotIndex=(startIndex+endIndex)/2;
			quickSort(startIndex,pivotIndex);
			quickSort(pivotIndex+1,endIndex);
		}
		return;
	}




	public static void main(String args[]){
		QuickSortArray quickSort=new QuickSortArray();
		quickSort.createArray();
		quickSort.printArray();
		quickSort.quickSort(0,4);
		quickSort.printArray();
	}



}