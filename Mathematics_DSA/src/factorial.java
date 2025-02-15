
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Factorial :" + factorialrec(19));
		
		System.out.print("digits factorial : "+ digitsFactorial(19));

	}
	
	private static int digitsFactorial(int N) {
		// TODO Auto-generated method stub
        int res = 1;
         
        for(int i=2; i<=N; i++){
            res = res*i;
        }
        
        int digit = 0;
        while(res > 0){
            res=res/10;
            digit++;
        }
        return digit;
	}

	private static long factorialrec(long n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorialrec(n-1);
	}

}
