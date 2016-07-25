/*
 * 求2的N次幂的值
描述:	
求2的N次幂的值（N最大不超过31，用位运算计算，结果以十六进制进行显示）。
运行时间限制:	无限制
内存限制:	无限制
输入:	
数字N
输出:	
2的N次方（16进制，需要按照16进制格式进行显示）
样例输入:	
5
样例输出:	
0x20
 * 
 */

package demo;

import java.util.Scanner;

public class 求2的N次幂的值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		Integer result=1<<n;
		System.out.println("0x"+Integer.toHexString(result));
		
	}

}
