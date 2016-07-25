
package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class 树遍历 {
	
	private static Scanner scanner=new Scanner(System.in);
	private static ArrayList<Integer> yezi=new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] jz=construct();
		for (int i = 0; i < jz.length; i++) {
			for (int j = 0; j < jz.length; j++) {
				System.out.print(jz[i][j]);
			}
			System.out.println();
		}
	}
	
	//建立树
	public static 	Integer[][] construct(){
		Integer[][] jz=null;
		//节点个数
		Integer num=0;
		//计算输入的行数
		Integer count=0;
	    while(scanner.hasNextLine()){
	    	count++;
	    	String line=scanner.nextLine();
	    	String[] arr=line.split(" ");
	    	//节点的个数
	    	if(count==1){
	    		num=Integer.valueOf(arr[0]);
	    		jz=new Integer[num+1][num+1];
	    		for(int i=0;i<num+1;i++){
	    			for (int j = 0; j <num+1; j++) {
						jz[i][i]=0;
					}
	    		}
	    	}
	    	
	    	//保存叶子节点
	    	else if(count==num){
	    		for (int i = 0; i < arr.length; i++) {
					yezi.add(Integer.valueOf(arr[i]));
				}
	    	}
	    	
	    	//根据其它节点建立树
	    	else{
	    		jz[Integer.valueOf(arr[0])][Integer.valueOf(arr[1])]=1;
	    		jz[Integer.valueOf(arr[1])][Integer.valueOf(arr[0])]=1;
	    	}
	    	
	    }	
	    return jz;
	}

}

