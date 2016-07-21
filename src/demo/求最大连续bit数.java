//package demo;
//
//import java.util.Scanner;
//
//public class 求最大连续bit数 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		Integer n;
//		n=scanner.nextInt();
//		String str;
//		str=Integer.toBinaryString(n);
//		
//		Integer max=0;
//		for(int i=0;i<str.length();){
//			Integer count=0;
//			while(i<str.length()&&str.charAt(i)=='1'){
//				count++;
//				i++;
//			}
//			if(count>max){
//				max=count;
//			}
//		}
//		System.out.println(max);
//	}
//
//}
