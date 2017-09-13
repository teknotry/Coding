public class Lcs{


  int findLcs( char[] X, char[] Y, int m, int n )
  {
    if (m == 0 || n == 0)
      return 0;
    if (X[m-1] == Y[n-1])
      return 1 + findLcs(X, Y, m-1, n-1);
    else
      return max(findLcs(X, Y, m, n-1), findLcs(X, Y, m-1, n));
  }
 
  int max(int a, int b)
  {
    return (a > b)? a : b;
  }


	public static void main(String args[]){
		Lcs lcs=new Lcs();
		String s1="Hello";
		String s2="ll";
		int l = lcs.findLcs(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
		System.out.println(l);
	}


}


