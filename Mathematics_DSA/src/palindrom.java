
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Palindrom Number : " + palindrom(060060));

	}

	private static boolean palindrom(int i) {
		// TODO Auto-generated method stub
		int rev = 0;
		int num = i;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		return (rev == i);
	}

}
