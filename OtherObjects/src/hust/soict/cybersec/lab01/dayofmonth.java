import java.util.Scanner;
public class dayofmonth {
	public static void main(String args[]) {
		// input month and year
		Scanner keyboard = new Scanner(System.in);
		int month;
		int year;
		while (true) {
			System.out.print("Enter month: ");
			if (keyboard.hasNextInt()) {
				month = keyboard.nextInt();
				if (month >= 1 && month <= 12) {
					break;
				}else {
					System.out.println("In valid month. Please enter a value between 1 and 12");
					
				}
			}else {
				System.out.println("Invalid input. Please enter a valid integer");
				keyboard.next();
			}
		}
		while(true) {
			System.out.print("Enter year: ");
			if (keyboard.hasNextInt()) {
				year = keyboard.nextInt();
				break;
			}else {
				System.out.println("Invalid input. Please enter a valid integer");
				keyboard.next();
			}
		}

		//return day of provided month
		int months31[] = {1,3,5,7,8,10,12};
		int months30[] = {4,6,9,11};
		System.out.print("Number of day is: ");
		if (month == 2) {
			// check years
			if (year % 400 == 0) { 
				System.out.print("29");
				System.exit(0);
			}
			else if (year % 100 == 0) {
				System.out.print("28");
				System.exit(0);
			} else if (year % 4 == 9) {
				System.out.print("29");
				System.exit(0);
			} else {
				System.out.print("28");
				System.exit(0);
			}
		}
		
		for (int i : months31) {
			if(month == i) { 
				System.out.print("31");
				System.exit(0);
			}
			
		}
		for(int i : months30) { 
			if ( i == month) {
				System.out.print("30");
				System.exit(0);
			}
			
		}
		
		
	}
	
}
