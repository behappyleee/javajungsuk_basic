import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
//		int[][] arr_1 = {{1,2,3,4,}, {5,6,7,8,}, {1,2,3,4,}};
//		System.out.println("arr_1 length : " + arr_1.length);
//		
//		for(int i=0; i<arr_1.length; i++) {
//			System.out.println(Arrays.toString(arr_1[i]));
//			for(int j=0; j<arr_1[i].length; j++) {
//				System.out.println(arr_1[i][j]);
//			}
//		}
//		
		
		System.out.println(true | false);
		System.out.println(4 | 5);
		System.out.println(3 | 2);
		System.out.println(2 | 3);
		System.out.println(3 | 4);
		System.out.println(11 | 12);
		// 1011
		// 1100
		// 1111
		// 11 100 111
		
		Thread test = new ThreadEx();
		test.start();
		
	}
}



class ThreadEx extends Thread {
	
}
