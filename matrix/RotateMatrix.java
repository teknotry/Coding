import java.util.Random;

public class RotateMatrix{

	int SIZE=0;
	public RotateMatrix(int size){
		this.SIZE=size;
	}


	public int[][] createMatrix(){
		int[][] m=new int[SIZE][SIZE];

		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				Random random=new Random();
				m[i][j]=random.nextInt(20)+1;
			}
		}
		return m;
	}


	public void printMatrix(int[][] m){

		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				System.out.print(" | " + m[i][j]);
			}
			System.out.println("");
		}

		System.out.println("\n\n");

	}

	public int[][] transpose(int[][] m){
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE/2;j++){
				int temp=m[i][j];
				m[i][j]=m[j][i];
				m[j][i]=temp;
			}
		}
		return m;
	}

	public int[][] reverseCol(int[][] m){
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE/2;j++){
				int temp = m[i][j];
				m[i][j]= m[SIZE-i-1][j];
				m[SIZE-i-1][j] =temp;
			}
		}
		return m;
	}




	public int[][] rotate(int[][] m,int times){
		for(int i=0;i<times;i++){
			transpose(m);
			reverseCol(m);
		}
		return m;
	}

	public static void main(String args[]){

		RotateMatrix rotateMatrix =new RotateMatrix(2);
		int[][] m=rotateMatrix.createMatrix();
		rotateMatrix.printMatrix(m);

		rotateMatrix.rotate(m,1);
		rotateMatrix.printMatrix(m);


	}


}