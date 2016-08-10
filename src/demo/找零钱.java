package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 *2016年8月10日	下午2:58:40
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class 找零钱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		while(true){
			int n=scanner.nextInt();
			if(n==0){
				break;
			}
			else{
				list.add(n);
			}
		}
		for (int i = 0; i<list.size(); i++) {
			System.out.println(get(list.get(i)));
		}
		
	}
	
	public static int get(int n){
		int result=0;
		for(int i=0;i<=n;i++){
			for (int j2 = 0; j2 <=n/2; j2++) {
				for (int j5 = 0; j5 <=n/5; j5++) {
					for (int j10 = 0; j10 <=n/10; j10++) {
						for (int j20 = 0; j20 <=n/20; j20++) {
							for (int j50 = 0; j50 <=n/50; j50++) {
								for (int j100 = 0; j100 <=n/100; j100++) {
									if(i+j2*2+j5*5+j10*10+j20*20+j50*50+j100*100==n){
										result++;
									}
								}
							}
						}
					}
				}
			}
		}
		
		return result;
	}

}
