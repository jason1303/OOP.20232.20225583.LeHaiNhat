import java.util.Scanner;
public class sum2matrices {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// matrix A
		System.out.print("Enter the number of rows of matrix A: ");
		int rowA = scanner.nextInt();
		System.out.print("Enter the number of column of matrix A: ");
		int columnA = scanner.nextInt();
		
		System.out.println(("Enter the value matrix A"));
		int[][] A = new int [rowA][columnA];
		
		for(int i = 0;i < rowA; i++) {
			for(int j = 0 ; j < columnA; j++) {
				System.out.print("Enter the value at [" + i + "][" + j+  "]: ");
				A[i][j] = scanner.nextInt();
			}
		}
		
		// matrix B
				System.out.print("Enter the number of rows of matrix B: ");
				int rowB = scanner.nextInt();
				System.out.print("Enter the number of column of matrix B: ");
				int columnB = scanner.nextInt();
				
				System.out.println(("Enter the value matrix B"));
				int[][] B = new int [rowA][columnA];
				
				for(int i = 0;i < rowB; i++) {
					for(int j = 0 ; j < columnB; j++) {
						System.out.print("Enter the value at [" + i +"][" + j+ "]: ");
						B[i][j] = scanner.nextInt();
					}
				}
				
		if (rowA != rowB || columnA != columnB) {
			System.out.print("Cannot sum 2 matrix with different size!");
			System.exit(0);
		}
		
		for(int i = 0; i < rowA; i++) {
			for(int j = 0; j < columnA; j++) {
				A[i][j] = A[i][j] + B[i][j];
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.exit(0);

	}

}
