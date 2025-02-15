import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number whose digit you want to count");
		
		Scanner n = new Scanner(System.in);
		long digit = n.nextLong();
		
		System.out.print("Count of Digit of Number " + digit + " is : " + countDigit(digit));

	}

	private static int countDigit(long digit) {
		// TODO Auto-generated method stub
		if (digit/10 == 0) {
			return 1;
		}
		return 1 + countDigit(digit/10);
	}

}
