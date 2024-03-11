import java.util.Scanner;
public class StarsTriangle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the height of triangle: ");
		int n = keyboard.nextInt();
		
		for(int i = 0; i <n ; i++) {
			for(int j = n - 2 - i;  j >= 0; j-- ) {
				System.out.print(" ");
			}
			for(int j = 1 + 2*i; j > 0;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
