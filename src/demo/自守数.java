/*
 	
描述	
自守数是指一个数的平方的尾数等于该数自身的自然数。例如：252 = 625，762 = 5776，93762 = 87909376。请求出n以内的自守数的个数
 
接口说明

 功能: 求出n以内的自守数的个数

 输入参数：
 int n
 返回值：
     n以内自守数的数量。
 
 
知识点	查找
运行时间限制	10M
内存限制	128
输入	
int型整数
输出	
n以内自守数的数量。
样例输入	2000
样例输出	8
 
 */


package demo;

import java.util.Scanner;

public class 自守数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=0;
		Integer count=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for (int i =0; i<=n; i++) {
			if(getN(i)){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean getN(Integer n){
		
		boolean flag=true;
		Integer ws=1;
		Integer k=n;
		//计算位数
		while(k/10!=0){
			k/=10;
			ws++;
		}
		//System.out.println(ws);
		Integer pf=n*n;
		//判断尾数
		for(int i=1;i<=ws;i++){
			Integer tmp_1=pf%10;
			Integer tmp_2=n%10;
			//System.out.print(tmp_2+" ");
			if(tmp_1!=tmp_2){
				flag=false;
				break;
			}
			pf/=10;
			n/=10;
			
		}
		return  flag;
	}
	
	

}
