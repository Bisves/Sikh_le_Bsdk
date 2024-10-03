public class Program02 {

	public static void main(String[] args) {
		long n1 = 9223372036854775807L; // 8
		float n2 = 9223372036854775808f; // widening // 4

	}

	public static void main1(String[] args) {

		int n1 = 10;
		double n2 = n1; // Widening

		double n3 = 12.34;
		int n4 = (int) n3; // Narrowing

		boolean status = true;
		// int n5 = (int) status; // NOT OK
		// boolean cannot be converted to other any type

		char ch = 'a';
		int n5 = ch; // type conversion
		double n6 = ch;
		// short n7 = ch;
		// byte n7 = ch;
		byte n7 = 65;
		ch = (char) n7;
	}

}
