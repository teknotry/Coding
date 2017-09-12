
public class SwapTwoDigitInNumberToGetAnotherNumber{


	public static int[] swapDigit(int a,int b){
		int[] output=new int[2];

		char[] n1=String.valueOf(a).toCharArray();
		char[] n2=String.valueOf(b).toCharArray();

		int j=0;
		int count=0;
		for(int i=0;i<n1.length && count <2 ;i++,j++){
			if(n1[i] != n2[j]){
				System.out.println(n1[i]);
				count++;
				j++;
			}
		}




		return output;
	}



	public static void main(String args[]){

		swapDigit(1131,1312);

	}
	


}
