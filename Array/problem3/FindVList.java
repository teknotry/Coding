import java.util.Random;

public class FindVList{



	public int[][] findV(int[] list){
		int[][] vpattern=new int[10][10];

		list=new int[]{3,2,4,5,1};

		if(list.length<=1)
			return vpattern;

		int vStartIndex=0;
		int vEndIndex=0;
		boolean decreasing=false;
		boolean increasing=false;

		String vString=""+list[0];
			
			for(int i=1;i<list.length;i++){

				if(list[i] > list[i-1]){
					if(decreasing == true){
						vString=vString+" "+list[i];
					}else{
						System.out.println(vString);
						vString=""+list[i];
						decreasing=false;
					}

				}else{
					if(decreasing ==false){
						vString=" "+list[i];
						decreasing=true;
					}else{
						decreasing=true;
						vString=vString+" "+list[i];
					}
					

				}

			}

		System.out.println(vString);

		return vpattern;
	}


	public void printList(int[] list){
		for(int i=0;i<list.length;i++){
			System.out.print(list[i] + " ");
		}
		System.out.println("");
	}


	public int[] createList(){

		int[] list =new int[20];
		Random rand=new Random();
		for(int i=0;i<20;i++){
			list[i]=rand.nextInt(99)+1;
		}
		return list;
	}



	public static void main(String args[]){

		FindVList findVList=new FindVList();
		int[] pattern=findVList.createList();
		findVList.printList(pattern);
		findVList.findV(pattern);


	}



}