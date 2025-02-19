import java.util.Scanner;

public class primeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		
		System.out.print("prime factor of " + num + " : ");
		primeFactor(num);
		
		System.out.print("prime factor of Efficient sol " + num + " : ");
		efficientSolPrimeFactor(num);
	

	}
	
	private static void efficientSolPrimeFactor(int num) {
		if(num <= 1) {
			return;
		}
		for(int i = 2; i*i <= num; i++) {
			while(num%i == 0) {
				System.out.print("Inside");
				System.out.print(i+ ", ");
				num = num/i;
			}
		}
		if(num > 1) {
			System.out.print("Outside");
			System.out.print(num);
		}
		
	}

	private static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		if(num == 2 || num == 3) {
			return true;
		}
		if(num%2 == 0 || num%3 == 0) {
			return false;
		}
		for(int i=5; i*i <=num;i=i+6) {
			if(num%i == 0 || num%(i+2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeFactor(int num) {
		// TODO Auto-generated method stub
		for(int i=2; i < num; i++) {
			if(isPrime(i)) {
				int x = i;
				while(num%x == 0) {
					System.out.print(i+ ", ");
					x = x*i;

				}
			}
		}
		
	}

}
