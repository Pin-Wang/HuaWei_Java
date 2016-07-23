//package demo;
//
//import java.util.Scanner;
//import java.util.regex.Matcher;
//
//public class 字符串通配符 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String exp,str;
//		Scanner scanner=new Scanner(System.in);
//		exp=scanner.next();
//		str=scanner.next();
//		//转换大小写
//		exp=exp.toLowerCase();
//		str=str.toLowerCase();
//		
//		System.out.println(matcher(exp, str)?"true":"false");
//		
//	}
//	
//	public static boolean matcher(String exp,String str){
//		int i=0,j=0;
//		while(i<exp.length()&&j<str.length()){
//			//匹配字符
//			if(exp.charAt(i)==str.charAt(j)){
//				i++;
//				j++;
//			}
//			//匹配？
//			else if(exp.charAt(i)=='?'){
//				i++;
//				j++;
//			}
//			//匹配*
//			else if(exp.charAt(i)=='*'){
//				//*不在最后
//				while(i<exp.length()&&exp.charAt(i)=='*'){
//					i++;
//				}
//				//*在最后
//				if(i==exp.length()){
//					return true;
//				}
//				else{
//					char tmp=exp.charAt(i);
//					while(j<str.length()&&str.charAt(j)!=tmp){
//						j++;
//					}
//				}
//			}
//			else{
//				return false;
//			}
//			
//		}
//		if(i==exp.length()&&j==str.length()){
//			return true;
//		}
//		else if(exp.substring(i).matches("\\**")){
//			return true;
//		}
//		else{ 
//			return false;
//		}
//	}
//
//}
