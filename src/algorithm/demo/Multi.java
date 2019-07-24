package algorithm.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Multi {
	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		String str1 = num1 + "";
		String str2 = num2 + "";
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		int[] ints1 = new int[chars1.length];
		int[] ints2 = new int[chars2.length];
		for(int i = 0; i < chars1.length; i++) {
			ints1[i] = chars1[i] - '0';
		}
		for(int i = 0; i < chars2.length; i++) {
			ints2[i] = chars2[i] - '0';
		}
		multi(ints1, ints2);
		// System.out.println("结果：" + Arrays.toString(ints2));
	}
	
	public static int multi(int[] ints1, int[] ints2) {
		int[] results = new int[ints1.length + ints2.length];
		int i = 0;
		for (int m = ints1.length - 1; m >= 0; m--) {
			
			// 最后一位为个位
			int offset = results.length - 1 - i;
			
			for (int n = ints2.length - 1; n >= 0; n--, i++) {
				int prod = ints1[m] * ints2[n];
				
				results[offset] += prod % 10;
				
				results[offset - 1] += prod / 10;
			}
		}
		
		return 0;
	}

}
