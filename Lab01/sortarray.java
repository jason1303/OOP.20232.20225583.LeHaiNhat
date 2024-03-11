import java.util.Scanner;
public class sortarray {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements in the array: ");
		n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter the integer at index " + i + " :" );
			a[i] = scanner.nextInt();
		}
		//sort increasing order
		for(int i = 0; i < n ; i++) {
			for(int j = i ; j < n; j++) {
				if(a[j] <a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum = 0;
		System.out.print("Sorted array: ");
		for (int i = 0; i <n ; i++) {
			sum += a[i];
			System.out.print(a[i]);
			System.out.print(" ");
			
		}
		System.out.println("");
		float avg = sum/n;
		System.out.print("average value of the array is: " + avg);
		System.exit(0);
		
		
	}
}
