package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 求最大和子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		//处理输入
		while(scanner.hasNext()){
			list.add(scanner.nextInt());
		}
		System.out.println("最大子序列为  索引"+max(list).get(0)+"--索引"+max(list).get(1)+"  的子序列  最大和是"+max(list).get(2));
	}
	
	/**
	 * @param list
	 * @return lsit分别为所求子序列的开始位置和结束为止索引，所求子序列的和
	 */
	public static List<Integer> max(List<Integer> list){ 
		List<Integer> result=new ArrayList<Integer>();
		Integer sum=0;
		//最大值
		Integer max=0;
		//最后求得的序列索引
		int s=0,e=0;
		result.add(0);
		result.add(0);
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i);
			if(sum>max){
				max=sum;
				e=i;
				result.set(0, s);
				result.set(1, e);
			}
			else if(sum<0){
				sum=0;
				s=i+1;
			}
			
		}
		result.add(max);
		return result;
	}
}
