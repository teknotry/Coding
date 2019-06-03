public class Test{

	public static int lowest(int a,int b){
		if(a<b)
			return a;
		else
			return b;
	}

	public static int getValueOf(Integer[][] nums,int i,int j){
		
		if(i==0 && j==0){
			return nums[i][j];
		}
		if(i==0){
			return nums[i][j]+getValueOf(nums,i,j-1);
		}
		if(j==0){
			return nums[i][j]+getValueOf(nums,i-1,j);
		}
		return nums[i][j]+lowest(getValueOf(nums,i,j-1),getValueOf(nums,i-1,j));
	}



	public static void main(String args[]){

		Integer[][] nums=new Integer[][]{{1,3,1,1},{1,4,1,1},{3,2,2,1}};
		int row=3;
		int col=4;

		//Print the array
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println("");
		}

		//Get the lowest sum
		int sum=getValueOf(nums,2,3);
		System.out.println(sum);
	}

}