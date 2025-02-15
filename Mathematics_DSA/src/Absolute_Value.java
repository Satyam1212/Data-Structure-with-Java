
public class Absolute_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Using Bitwise Absolute value : " + bitwise(-23123312));

	}

	private static int bitwise(int i) {
		// TODO Auto-generated method stub
		int mask = i >> 31;
		return (i ^ mask) - mask;
	}

}
