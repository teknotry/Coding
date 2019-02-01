import java.util.PriorityQueue;

class ArrayNode implements Comparable<ArrayNode>{

	int[] arr;
	int index;
	public ArrayNode(int arr[],int index){
		this.arr = arr;
		this.index = index;
	}

	@Override
	public int compareTo(ArrayNode arrayNode){
		return this.arr[this.index] - arrayNode.arr[arrayNode.index];
	}
}



public class Solution{

	
	public static int[] mergeSortedArray(int[][] arr,int total){

	
		int[] res = new int[total];
		PriorityQueue<ArrayNode> pq = new PriorityQueue<ArrayNode>();

		for(int i = 0 ;i<arr.length ; i++){
			pq.add(new ArrayNode(arr[i],0));
		}

		int m = 0;
		while(!pq.isEmpty()){
			ArrayNode an = pq.poll();
			res[m] = an.arr[an.index];
			m++;
		
			if(an.index < an.arr.length-1){
				pq.add(new ArrayNode(an.arr,an.index+1));
			}
		}
		return res;

	}



	public static void main(String args[]){


		int[][] arr = {
			{1,2,3},
			{7,8,9},
			{4,5,6}
		};

		int total = 0;
		for(int i = 0;i< arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
				total++;
			}
		}


		int []sol = mergeSortedArray(arr,total);
		
		for(int i = 0;i< sol.length;i++){
				System.out.print(sol[i]+ " ");
		}
		

	}

}
