import java.util.Scanner;
public class twoDoubles {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first double: ");
		double first = scanner.nextDouble();
		System.out.print("Enter the second double: ");
		double second = scanner.nextDouble();
		
		System.out.println("The sum of two double is: " + (first + second));
		System.out.println("The difference of two double is: " + (first - second));
		System.out.println("The product of two double is: " + (first * second));
		if (second == 0) {
			System.out.println("Cannot devided by zero.");
		}else {
			System.out.println("The sum of two double is: " + (first + second));
		}
		System.exit(0);
		
	}
}
