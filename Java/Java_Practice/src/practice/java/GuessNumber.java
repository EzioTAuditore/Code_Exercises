/*
 * 设计一个猜数字的小程序，随机生成0~9的整数，
 * 获取用户输入的整数，如果不正确，判断后输出对应的结果，并重新输入。
 * 
 * 使用Random类来获取随机数
 * 使用nextInt()方法来获取整数
 */

package practice.java;

// 接入随机数和获取屏幕输入方法
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		// 定义一个随机数，使用nextInt()方法，10代表10个数
		int randomNumber = new Random().nextInt(10);
		
		// 输出信息
		System.out.println("随机数已生成！");
		System.out.println("-----请您输入猜的数字-----");
		
		// 获取屏幕输入内容
		Scanner sc = new Scanner(System.in);
		int enterNumber = sc.nextInt();
		
		// 进入循环体，进行判断
		while (enterNumber != randomNumber) {
			if (enterNumber > randomNumber) {
				System.out.println("Sorry，您猜大了。");
			} else {
				System.out.println("Sorry,您猜小了。");
			}
			// 当输入内容不对时再次获取输入。
			System.out.println("请再次输入：");
			enterNumber = sc.nextInt();
		}
		System.out.println("您猜对了。");
	}

}
