public class Solution{

	public static void test(String s){

		boolean[] result = new boolean[s.length() + 1];

		char[] str=s.toCharArray();
		for(int i=0;i<s.length();i++){
			for(int j=0;j<i;j++){
				System.out.println(s.substring(j,i));
			}
		}


	}



	public static void main(String args[]){

		String s="Hello";
		test(s);


	}
}