package hw2;

public class hw2_3 {

	public static void main(String[] args) {
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64));
			}
			System.out.println();
		}

	}

}
