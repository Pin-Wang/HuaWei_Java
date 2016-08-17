package demo;

import java.util.Scanner;

/*
 *2016年8月16日	下午7:37:42
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class 数组右上三角置0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//处理输入
		Scanner scanner=new Scanner(System.in);
		//二维存储数组
		int[][] arr=new int[3][3];
		while(scanner.hasNext()){
			for(int k=0;k<3;k++){
				for(int n=0;n<3;n++){
					int tmp=scanner.nextInt();
					arr[k][n]=tmp;
				}
			}
			//处理
			SetArrayTopRightCornerTobeZero(arr);
			for(int k=0;k<3;k++){
				for(int n=0;n<3;n++){
					System.out.print(arr[k][n]);
				}
			}
		}

	}
	
	public static void SetArrayTopRightCornerTobeZero(int[][] a){
		//行数
		for(int k=0;k<3;k++){
			//列数
			for(int n=k;n<3;n++){
				a[k][n]=0;
			}
		}
		
	}
}
