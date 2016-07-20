//package demo;
//
//import java.util.Scanner;
//
//import org.w3c.dom.css.ElementCSSInlineStyle;
//
//public class 记负均正 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		Integer n;
//		n=scanner.nextInt();
//		Integer[] arr=new Integer[n];
//		int count=0;
//		Integer sum=0;
//		for(int i=0;i<n;i++){
//			arr[i]=scanner.nextInt();
//			if(arr[i]<0){
//				count++;
//			}
//			else{
//				sum+=arr[i];
//			}
//		}
//		
//		System.out.print(count+" ");
//		int c=n-count;
//		if(sum==0){
//			System.out.print(0);
//		}
//		else if(sum%c==0){
//			System.out.print(sum/c);
//		}
//		else{
//			System.out.print((float)sum/c);
//		}
//	}
//
//}
