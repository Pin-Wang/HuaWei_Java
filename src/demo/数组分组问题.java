/*
   
描述	
编写一个函数，传入一个int型数组，返回该数组能否分成两组，使得两组中各元素加起来的和相等，并且，所有5的倍数必须在其中一个组中，所有3的倍数在另一个组中（不包括5的倍数），能满足以上条件，返回true；不满足时返回false。 
知识点	字符串,循环,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
运行时间限制	10M
内存限制	128
输入	
输入输入的数据个数
输入一个int型数组

输出	
返回true或者false

样例输入	4 1 5 -5 1
样例输出	true

 */


package demo;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

import javax.management.NotificationListener;

import org.omg.Messaging.SyncScopeHelper;


//实质是个背包问题
public class 数组分组问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer sum=0;
		Scanner scanner=new Scanner(System.in);
		  //计算真正存储在数组中的个数
        Integer count=0;
        String str=scanner.nextLine();
        String[] arr=str.split(" ");
        Integer[] a=new Integer[arr.length];
        Integer[] a_re=new Integer[arr.length];
       
        for(int i=0;i<arr.length;i++){
        	Integer tmp=Integer.valueOf(arr[i]);
        	a[i]=tmp;
        	if(i!=0){
        		sum+=a[i];
        	}
        }
        
        //如果布恩那个整除返回false
        if(sum%2!=0){
        	System.out.println("false");
        	return;
        }
        Integer sum3_result=sum/2;
        Integer sum5_result=sum/2;
        
        int k=0;
        for(int i=1;i<a.length;i++){
        	if(a[i]%3==0){
        		sum3_result-=a[i];
        	}else if(a[i]%5==0){
        		sum5_result-=a[i];
        	}
        	else{
        		a_re[k++]=a[i];
        		count++;
        	}
        }
        
        
        if(isOk(sum3_result, a_re, count)&&isOk(sum5_result, a_re, count)){
        	System.out.println("true");
        }
        else{
        	System.out.println("false");
        }
	}
	
	//背包问题递归处理
	public static boolean isOk(Integer sum,Integer[] a,Integer n){
		if(sum==0){
			return true;
		}
		else if(sum<0||(sum>0&&n-1<0)){
			return false;
		}
		else if(isOk(sum-a[n-1], a, n-2)){
			return true;
		}
		else {
			return isOk(sum, a, n-2);
		}
	}
	

}
