///*
//   				Tom的生日礼物
//描述:	
//四月一日快到了，Tom想了个愚人的好办法——送礼物。嘿嘿，不要想的太好，这礼物可没那么简单，Tom为了愚人，准备了一堆盒子，其中有一个盒子里面装了礼物。盒子里面可以再放零个或者多个盒子。假设放礼物的盒子里不再放其他盒子。
//用()表示一个盒子，A表示礼物，Tom想让你帮她算出愚人指数，即最少需要拆多少个盒子才能拿到礼物。
// 
//运行时间限制:	无限制
//内存限制:	无限制
//输入:	
//本题目包含多组测试，请处理到文件结束。
//每组测试包含一个长度不大于1000,只包含'(',')'和'A'三种字符的字符串，代表Tom设计的礼物透视图。
//你可以假设，每个透视图画的都是合法的。
//输出:	
//对于每组测试，请在一行里面输出愚人指数。
//样例输入:	
//((((A)()))())
//(A)
//样例输出:	
//4
//1
// * 
// * 
// */
//
//
//package demo;
//
//import java.util.Scanner;
//
//public class Tom的生日礼物 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		String str=null;
//		while(scanner.hasNextLine()){
//			//结果
//			Integer result_l=0;
//			Integer k_l=0;
//			Integer result_r=0;
//			Integer k_r=0;
//			str=scanner.nextLine();
//			int index=str.indexOf('A');
//			//向左遍历
//			for(int i=index;i>=0;i--){
//				if(str.charAt(i)=='('){
//					result_l++;
//				}
//			}
//			//减去A左边的空盒子数量
//			for(int i=index;i>=0;i--){
//				if(str.charAt(i)==')'){
//					k_l++;
//				}
//			}
//			result_l-=k_l;
//			
//			//向右遍历
//			for(int i=index;i<str.length();i++){
//				if(str.charAt(i)==')'){
//					result_r++;
//				}
//			}
//			
//			//减去A右边的空盒子数量
//			for(int i=index;i<str.length();i++){
//				if(str.charAt(i)=='('){
//					k_r++;
//				}
//			}
//			result_r-=k_r;
//			System.out.println(result_l<result_r?result_l:result_r);
//		}
//		
//	}
//
//}
