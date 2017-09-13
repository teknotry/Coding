public class LongestString{

	public static String findLongest(String s){


		String lastoutput="";
		String output="";


		for(int i=0;i<s.length();i++){
			if(output.contains(String.valueOf(s.charAt(i)))){
				i=s.substring(0,i).lastIndexOf(String.valueOf(s.charAt(i)));
				output="";
			}else{
				output=output+s.charAt(i);
				if(lastoutput.length() < output.length()){
					lastoutput=output;
				}
			}
		}

		return lastoutput;
	}

	public static void main(String args[]){
		System.out.println(findLongest("Habcdeflklddlkxjlfgko"));
	}
}
