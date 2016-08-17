package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *2016年8月16日	下午9:04:04
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class 在二叉树中找出和为某一值的所有路径 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextLine()){
			Integer add;
			add=new Integer(scanner.nextLine());
			String[] arr=scanner.nextLine().split(",");
			List<Integer> list=new ArrayList<Integer>();
			list.add(10000);
			//从索引1处开始存储
			for(int i=0;i<arr.length;i++){
				list.add(Integer.valueOf(arr[i]));
			}
			//计算
			//从叶子节点开始寻找
			int len=list.size()-1;
			boolean flag=false;
			//寻找最后一层第一个索引
			int first=1;
			while(first<=len){
				first*=2;
			}
			first/=2;
			//寻找最后一层
			for(int i=first;i<=len;i++){
				//存储节点
				List<Integer> tmp_list=new ArrayList<Integer>();
				Integer tmp=0;
				int j=i;
				while(j!=0){
					tmp_list.add(list.get(j));
					tmp+=list.get(j);
					//向上找父节点
					j/=2;
				}
				//判断是否和设定的和相等
				if(tmp.equals(add)){
					flag=true;
					for(int index=tmp_list.size()-1;index>=0;index--){
						System.out.print(tmp_list.get(index));
						if(index!=0){
							System.out.print(",");
						}
					}
					System.out.println();
				}
				
			}
			
			//寻找倒数第二层
			for(int i=len/2+1;i<=first-1;i++){
				//存储节点
				List<Integer> tmp_list=new ArrayList<Integer>();
				Integer tmp=0;
				int j=i;
				while(j!=0){
					tmp_list.add(list.get(j));
					tmp+=list.get(j);
					//向上找父节点
					j/=2;
				}
				//判断是否和设定的和相等
				if(tmp.equals(add)){
					flag=true;
					for(int index=tmp_list.size()-1;index>=0;index--){
						System.out.print(tmp_list.get(index));
						if(index!=0){
							System.out.print(",");
						}
					}
					System.out.println();
				}
				
			}
			if(!flag){
				System.out.println("error");
			}
			
		}
		
	}

}
