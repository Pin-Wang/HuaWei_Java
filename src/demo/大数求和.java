package demo;

import java.util.Scanner;

/*
 *2016年8月10日	下午2:11:14
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class 大数求和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		String b=scanner.nextLine();
		String result=getAnd(new StringBuilder(a), new StringBuilder(b));
		System.out.println(result);
	}
	public static String getAnd(StringBuilder a,StringBuilder b){
		StringBuilder result=new StringBuilder();
		int la=a.length()-1;
		int lb=b.length()-1;
		while(la>=0&&lb>=0){
			int a1=a.charAt(la)-'0';
			int a2=b.charAt(lb)-'0';
			int tmp=a1+a2;
			//处理进位
			if(tmp>9){
				result.append((int)(tmp%10));
				
				
				//将进位放进长的String中
				if(a.length()>=b.length()){
					//如果当前位数不是是最高位
					if(la-1>=0){
						int jinwei=a.charAt(la-1)-'0'+tmp/10;
						a.replace(la-1, la, String.valueOf(jinwei));
					}
					//如果当前位数是最高位
					else{
						int jinwei=tmp/10;
						a.reverse();
						a.append(jinwei);
						a.reverse();
						la++;
					}
					
				}
				else{
					//如果当前位数不是是最高位
					if(lb-1>=0){
						int jinwei=b.charAt(lb-1)-'0'+tmp/10;
						b.replace(lb-1, lb, String.valueOf(jinwei));
					}
					//如果当前位数是最高位
					else{
						int jinwei=tmp/10;
						b.reverse();
						b.append(jinwei);
						b.reverse();
						lb++;
					}
				}
			}
			//不需要处理进位
			else{
				result.append((int)(tmp%10));
			}
			la--;
			lb--;
		}
		result.reverse();
		//a未处理完
		if(lb<0&&la>=0){
			return a.substring(0, la+1)+result.toString();
		}
		//b未处理完
		else if(la<0&&lb>=0){
			return b.substring(0, lb+1)+result.toString();
		}
		else{
			return result.toString();
		}
	}
}
