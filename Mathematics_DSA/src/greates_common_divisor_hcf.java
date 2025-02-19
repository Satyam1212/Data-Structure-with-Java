
public class greates_common_divisor_hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Greatest Common divisor of both numbers are : " + naiveSol(4, 5));
		
		System.out.println("\nGreatest Common divisor of both numbers with Euclidean algorithm are : " + naiveEuclidean(4, 5));

		System.out.println("\nGreatest Common divisor of both numbers with Euclidean algorithm are : " + EfficientEuclidean(4, 5));

	}

	private static int EfficientEuclidean(int i, int j) {
		// TODO Auto-generated method stub
		if( j == 0) {
			return i;
		}
		return EfficientEuclidean(j, i%j);
	}

	private static int naiveEuclidean(int i, int j) {
		// TODO Auto-generated method stub
		while( i != j) {
			if(i > j) {
				i= i-j;
			}
			else {
				j = j-i;
			}
		}
		return i;
	}

	private static int naiveSol(int i, int j) {
		// TODO Auto-generated method stub
		int res = Math.min(i, j);
		
		while(res > 0) {
			if(i%res == 0 && j%res==0) {
				break;
			}
			res--;
		}
		
		return res;
	}

}
