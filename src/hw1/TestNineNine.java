package hw1;

public class TestNineNine {
	public static void main(String[] args) {

		// for迴圈+while迴圈
//		int i;
//		for (i = 1; i <= 9; i++) {
//		
//			int k = 1;
//			while (k <= 9) {
//				System.out.print(i + "*" + k + "=" + i * k + "\t");
//				k++;
//
//			}
//			System.out.println();

		// for迴圈+do while迴圈
//
//		int i;
//		for (i = 1; i <= 9; i++) {
//
//			int k = 1;
//			do {
//				System.out.print(i + "*" + k + "=" + i * k + "\t");
//				k++;
//			} while (k <= 9);
//				System.out.println();
//		}
//		

		// while迴圈+do while迴圈

		int i = 1;
		while (i <= 9) {

			int k = 1;
			do {
				System.out.print(i + "*" + k + "=" + i * k + "\t");
				k++;
			} while (k <= 9);
			i++;
			System.out.println();
		}
	}
}