package hw2;

public class hw2_2 {

	public static void main(String[] args) {

		// 輸出1~49中沒有「4」的數字

//		int i = 1;
//		int count = 0;
//
//		for (i = 1; i < 40; i++) {
//			if ((i != 4) && (i % 10 != 4)) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println(count + "個");

		
		
		// 10到1的倒三角形

		for (int j = 10; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i);
			}
			System.out.println();			
		}
		



	}
}
