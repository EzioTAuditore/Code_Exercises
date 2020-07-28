package practice.java;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int randomNumber = new Random().nextInt(10);
		System.out.println("随机数已生成！");
		System.out.println("-----请您输入猜的数字-----");
		Scanner sc = new Scanner(System.in);
		int enterNumber = sc.nextInt();
		while (enterNumber != randomNumber) {
			if (enterNumber > randomNumber) {
				System.out.println("Sorry，您猜大了。");
			} else {
				System.out.println("Sorry,您猜小了。");
			}
			System.out.println("请再次输入：");
			enterNumber = sc.nextInt();
		}
		System.out.println("您猜对了。");
	}

}
