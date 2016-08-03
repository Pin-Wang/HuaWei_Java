/*
 * 数字字符串转二进制
描述:	
输入一串整数，将每个整数转换为二进制数，如果倒数第三个Bit是“0”，则输出“0”，如果是“1”，则输出“1”。
运行时间限制:	10 Sec
内存限制:	128 MByte
输入:	
一串整数，长度小于1024，整数以空格隔开
输出:	
1/0的整数串，空格隔开
样例输入:	
240 0
样例输出:	
0 0
 */


package demo;

import java.util.Scanner;

public class 数字字符串转二进制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Integer n=0;
		String str=scanner.nextLine();
		String[] arr=str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			//将字符串转换为整数
			n=Integer.valueOf(arr[i]);
			
			//转换为二进制字符串
			String re=Integer.toBinaryString(n);
			if(re.length()<3){
				System.out.print(0);
			}
			else if(re.charAt(re.length()-3)=='0'){
				System.out.print(0);
			}
			else{
				System.out.print(1);
			}
			if(i!=arr.length-1){
				System.out.print(" ");
			}
		}
		
	}

}
