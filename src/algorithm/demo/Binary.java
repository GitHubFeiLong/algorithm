package algorithm.demo;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		getBinary();
	}
	
	public static String getBinary() {
		System.out.println("请输入需要转换二进制的数，按回车结束：");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String regex = "\\d+";
		if (input.matches(regex)) {
			System.out.println("匹配");
		} else {
			System.err.println("输入格式错误！");
			throw new RuntimeException();
		}
		
		int num = Integer.parseInt(input);
		
		// 商
		int merchant = -1;
		// 余数
		int remainder = -1;
		StringBuilder builder = new StringBuilder();
		// 商=0时直接退出循环
		while (merchant != 0) {
			merchant = num / 2;
			remainder = num % 2;
			num = merchant;
			builder.append(remainder);
		}
		// 反转字符串
		String result = builder.reverse().toString();
		System.out.println(input + "的二进制是：" + result);
		return result;
		
	}

}
