package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import javax.xml.soap.SAAJResult;

/*
*2016年8月4日下午8:22:05
*@Author Pin-Wang
*@E-mail 1228935432@qq.com
*/


public class 求算术表达式 {
	//存储转换后的list
	private static List<String> list=new ArrayList<String>();
	//存储操作数字的栈
	private static Stack<Integer> digitStack=new Stack<Integer>();
	//存储操作符的栈
	private static Stack<String> charStack=new Stack<String>();
	

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextLine()){
			String str=scanner.nextLine();
			list=stringToList(str);
			for (int i = 0; i < list.size(); i++) {
				//System.out.print(list.get(i)+" ");
			}
			//System.out.println();
			System.out.println(calculate(list));
		}
	
	}
	
	//计算表达式
	public static Integer calculate(List<String> list){
		Integer result=0;
		
		for(int i=0;i<list.size();i++){
			String tmp=list.get(i);
			//是左括号
			if(tmp.equals("(")){
				charStack.push(tmp);
			}
			//是右括号
			else if(tmp.equals(")")){
				//一直计算到左括号的地方
				while(!charStack.peek().equals("(")){
					Integer b=digitStack.pop();
					System.out.println(b+"出栈");
					Integer a=digitStack.pop();
					System.out.println(a+"出栈");
					Integer r=getR(a, b, charStack.pop());
					//计算结果进栈
					digitStack.push(r);
					System.out.println(r+"进栈");
				}
				//弹出左括号
				charStack.pop();
			}
			//是运算符
			else if(isCalculateChar(tmp)){
				//如果比前一个运算符优先级别低或者相等则进行前一个运算符的运算
				while(charStack.size()>=1&&!charStack.peek().equals("(")&&compare(tmp,charStack.peek())<=0){
					Integer b=digitStack.pop();
					System.out.println(b+"出栈");
					Integer a=digitStack.pop();
					System.out.println(a+"出栈");
					Integer r=getR(a, b, charStack.pop());
					//计算结果进栈
					digitStack.push(r);
					System.out.println(r+"进栈");
				}
				
				charStack.push(tmp);
				
			}
			//是数字
			else{
				digitStack.push(Integer.valueOf(tmp));
				System.out.println(Integer.valueOf(tmp)+"进栈");
			}
		}
		//将剩下的数字计算完
		while(digitStack.size()!=1){
			Integer b=digitStack.pop();
			System.out.println(b+"出栈");
			Integer a=digitStack.pop();
			System.out.println(a+"出栈");
			Integer r=getR(a, b, charStack.pop());
			//计算结果进栈
			digitStack.push(r);
			System.out.println(r+"进栈");
		}
		System.out.println("size= "+digitStack.size());
		result=digitStack.pop();
		return result;
	}
	
	//将数字或者字符单个装到List中
	public static List<String> stringToList(String str){
		//为截取字符串方便加个标识符
		str+="#";
		List<String> result=new ArrayList<String>();
		int i=0;
		//数字字符的开始和结束位置
		int s=0;
		
		while(i!=str.length()){
			//数字字符的个数
			int count=0;
			//表是是否是数字字符
			boolean flag=false;
			//寻找数字
			while(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				count++;
				i++;
				flag=true;
			}
			//存储数字字符串
			if(flag){
				result.add(str.substring(s,s+count));
			}
			//得到符号
			while(i!=str.length()&&str.charAt(i)!='#'&&!(str.charAt(i)>='0'&&str.charAt(i)<='9')){
				result.add(str.charAt(i)+"");
				i++;
			}
			//如果走到了#处
			if(str.charAt(i)=='#'){
				i++;
			}
			s=i;
		}
		
		return result;
	}
	
	//判断是不是四则运算符
	public static boolean isCalculateChar(String c){
		if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")){
			return true;
		}
		return false;
	}
	
	//比较四则运算符的级别
	public static Integer compare(String a,String b){
		if((a.equals("+")||a.equals("-"))&&(b.equals("+")||b.equals("-"))){
			return 0;
		}
		else if((a.equals("*")||a.equals("/"))&&(b.equals("*")||b.equals("/"))){
			return 0;
		}
		else if((a.equals("*")||a.equals("/"))&&(b.equals("+")||b.equals("-"))){
			return 1;
		}
		else{
			return -1;
		}
	}
	//计算两数字的运算结果
	public static Integer getR(Integer a,Integer b,String c){
		if(c.equals("+")){
			return a+b;
		}
		else if(c.equals("-")){
			return a-b;
		}
		else if(c.equals("*")){
			return a*b;
		}
		else{
			return a/b;
		}
	}

}
