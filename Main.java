import static java.lang.Math.*;
public class Main{
	public static double countbox(int i, int j) {
		double realj = j + 1, temp;
		switch (i) {
			case 5 -> temp = 2 * log((((PI/2) + ( abs(realj) / (abs(realj) +1))) / PI));
			case 0,1,3,7,8,9,11,12,16,19 -> temp = sin(pow(pow(realj, (PI / realj)) * (tan(realj) - 1) , 3));
			default -> temp = sin(2 * pow(pow(realj, realj / 6), (log(abs(realj)) - 1) * 4)); 
		}
		return temp;
	}
	public static void printMatrix(double[][] matrix) {
		for (var i = 0; i < 20; ++i) {
			for (var j = 0; j < 14; ++j) {
				if (matrix[i][j] > 0) System.out.print(" ");
				System.out.printf("%.4f ", matrix[i][j]);	
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		int[] z = new int[20];
		for (var i = 1; i < 21; ++i) {
			z[i-1] = i;
		}
		double[] x = new double[14];
		for (var i = 0; i < 14; ++i) {
			x[i] = (Math.random() * 16) - 8;
		}
		double[][] z1 = new double [20][14];
		for (var i = 0; i < 20; ++i) {
			for (var j = 0; j < 14; ++j) {
				z1[i][j] = countbox(i, j);
			}
		}
		printMatrix(z1);
		//printMatrix1(z1);
	}
	/*
	public static void printMatrix1(double[][] matrix) {
		for (double[]  i : matrix){
			for (double j : i) {
				if (j > 0) System.out.print(" ");
				System.out.printf("%.4f ", j);		
			}
			System.out.println();
		}
	}
	*/
}
