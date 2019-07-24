package algorithm.demo;

import java.util.Scanner;

public class Money {
	private static int count = 0;
	public static void main(String[] args) {
		int num = 4399;
		System.out.println("游戏开始");
		System.out.println("范围最大值(1000000),您输入的数字大于需猜测的数，会提示大了，\n输入的数字小于了需要猜测的数，我会提示小了，否则提示猜对了");
		Scanner scanner = new Scanner(System.in);
		int guess = 0;
		
		do {
			guess = scanner.nextInt();
			chick(num, guess);
		} while (guess != num);
		scanner.close();
	}

	private static void chick(int num, int guess) {
		count++;
		if (num < guess) {
			System.out.println("大了\n");
		} else if (num > guess) {
			System.out.println("小了\n");
		} else {
			System.out.println("猜对了,使用了" + count + "次");
			return;
		}
	}
}
