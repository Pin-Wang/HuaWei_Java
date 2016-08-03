/*
 * 描述	
给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号。要求以字典序排序输出火车出站的序列号。
知识点	栈
运行时间限制	0M
内存限制	0
输入	
有多组测试用例，每一组第一行输入一个正整数N（0<N<10），第二行包括N个正整数，范围为1到9。
输出	
输出以字典序排序的火车出站序列号，每个编号以空格隔开，每个输出序列换行，具体见sample。
样例输入	3 1 2 3
样例输出	1 2 3 1 3 2 2 1 3 2 3 1 3 2 1
 */

//此问题就是按照顺序进栈后，有几中出栈的可能性。

package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 火车进站 {
	private static Scanner scanner=new Scanner(System.in);
	//最终结果
	private static List<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		//while(scanner.hasNext()){
			//输入火车数量
			Integer n=scanner.nextInt();
			//存储火车编号
			Integer[] trains=new Integer[n];
			for(int i=0;i<n;i++){
				trains[i]=scanner.nextInt();
			}
			//计算结果
			List<Integer> out=new ArrayList<Integer>();
			List<Integer> unout=new ArrayList<Integer>();
			getSeq(0, trains, out, unout);
			for(int i=0;i<result.size();i+=1){
				for(int j=0;j<result.get(i).size();j++){
					System.out.print(result.get(i).get(j));
					if(i!=result.size()-1||j!=result.get(i).size()-1){
						System.out.print(" ");
					}
				}
			}
			
			result.clear();
		//}
		
	}
	//计算可能的出战顺序
	/**
	 * @param train  进站的火车编号
	 * @param trains 所有的火车
	 * @param out	  在车站外面的火车
	 * @param unout  在车站里面的火车
	 */
	public static void getSeq(Integer train,Integer[] trains,List<Integer> out,List<Integer> unout){
		//所有火车都已经进站
		if(train>=trains.length){
			//将车站外面的火车出战顺序加入到结果
			ArrayList<Integer> list=new ArrayList<>();
			for(Integer i:out){
				list.add(i);
			}
			//将车站里面的火车出战顺序加入到结果中
			for(int i=unout.size()-1;i>=0;i--){
				list.add(unout.get(i));
			}
			result.add(list);
			return;
		}
		//进站了又马上出来了
		out.add(trains[train]);
		getSeq(train+1, trains, out, unout);
		//计算完成后清除
		out.remove(out.size()-1);
		
		//进站了没有出来
		unout.add(trains[train]);
		getSeq(train+1, trains, out, unout);
		//计算完成后清除
		unout.remove(unout.size()-1);
	}

}
