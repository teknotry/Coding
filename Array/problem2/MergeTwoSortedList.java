
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MergeTwoSortedList{



	//Merge two lists.
	public List<Integer> mergeLists(List<Integer> list1,List<Integer> list2){

		List<Integer> finalList=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i < list1.size() && j < list2.size() ){

			if(list1.get(i) < list2.get(j)){
				finalList.add(list1.get(i));
				i++;
			}else{
				finalList.add(list2.get(j));
				j++;
			}
		}

		while(i < list1.size()){
			finalList.add(list1.get(i));
			i++;
		}

		while(j < list2.size()){
			finalList.add(list2.get(j));
			j++;
		}

		return finalList;

	}


	//Create sorted list
	public List<Integer> createSortedList(){
		List<Integer> list=new ArrayList<Integer>();
		Random rand=new Random();
		for(int i=0;i<10;i++){
			list.add(rand.nextInt(20)+1);
		}
		Collections.sort(list);
		return list;
	}

	//Printing the list
	public void printList(List<Integer> list){
		for(int element:list){
			System.out.print(element + " ");
		}
		System.out.println("");
	}

	//Test program
	public static void main(String args[]){
		MergeTwoSortedList mergeTwoSortedList=new MergeTwoSortedList();
		List<Integer> list1=mergeTwoSortedList.createSortedList();
		List<Integer> list2=mergeTwoSortedList.createSortedList();

		mergeTwoSortedList.printList(list1);
		mergeTwoSortedList.printList(list2);
		List<Integer> output=mergeTwoSortedList.mergeLists(list1,list2);
		mergeTwoSortedList.printList(output);
	}


}