package demo;

import java.util.Scanner;

public class 求数组最大乘积序列 {
	static Integer n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		Double[] arr=new Double[n];
		for(int i=0;i<n;i++){
			arr[i]=scanner.nextDouble();
		}
		
		double max=0;  
		double start=0;  
		double end=0;  
		for (int i=0;i<n;i++) {  
		    double x=arr[i];  
		    for (int j = i+1; j < n; j++) {  
		        x*=arr[j];  
		        if(x>max){  
		            max=x;  
		            start=arr[i];  
		            end=arr[j];  
		        }  
		    } 
		}
		System.out.println(max);
	}

}
