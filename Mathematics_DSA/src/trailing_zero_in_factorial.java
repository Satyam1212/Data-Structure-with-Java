
public class trailing_zero_in_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Trailing zeroes in factorial : " + trailingZeroFactorial(20));
		
		System.out.println("Trailing zeroes in factorial with efficient solution : " + efficientTrailingZeroFact(20));

	}

	private static int efficientTrailingZeroFact(int n) {
		int res = 0;
		
		for(int i = 5; i <=n; i=i*5)
			res = res + n/5;
		return res;
	}

	private static long trailingZeroFactorial(int i) {
		long factorial = 1;
		if (i <= 1) {
			factorial = 1;
		}
		for(int j = 2; j <= i; j++) {
			factorial = factorial*j;
		}
		int trailing=0;
		while(factorial%10 == 0) {
			factorial = factorial/10;
			trailing++;
		}
		return trailing;
	}

}
