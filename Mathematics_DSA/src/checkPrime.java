
public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Prime number : " + isPrimeNaive(11));

	}

	private static boolean isPrimeNaive(int i) {
		// TODO Auto-generated method stub
		if(i == 1) {
			return false;
		}
		if(i == 2 || i == 3) {
			return true;
		}
		if(i%2 == 0 || i %3 == 0) {
			return false;
		}
		for(int j=5; j*j <= i; j=j+6) {
			if(i%j == 0 || i%(j+2) == 0) {
				return true;
			}
		}
		
		return true;
	}

}
