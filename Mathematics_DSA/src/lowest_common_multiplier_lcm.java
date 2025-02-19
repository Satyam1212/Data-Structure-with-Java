
public class lowest_common_multiplier_lcm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LCM of given number : " + lcmNaive(100,200));
		
		System.out.println("LCM of given number : " + lcmNaiveSecond(100,230));
		
		System.out.println("LCM of given number : " + lcmEfficient(100,207));

	}
	
	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		if( j == 0) {
			return i;
		}
		return gcd(j, i%j);
	}

	private static int lcmEfficient(int i, int j) {
		// TODO Auto-generated method stub
		
		return (i*j)/gcd(i,j);
	}

	private static int lcmNaiveSecond(int i, int j) {
		// TODO Auto-generated method stub
		int res = Math.max(i,j);
		
		while(true) {
			if(res%i ==0 && res%j==0) {
				break;
			}
			res++;
			
		}
		return res;
	}

	private static int lcmNaive(int i, int j) {
		// TODO Auto-generated method stub
		int res = 1;
		
		int max= Math.max(i, j);
		int min= Math.min(i, j);
		int start = 1;
		
		while(res%max != 0) {
			res = min*start;
			start++;
		}
		return res;
	}

}
