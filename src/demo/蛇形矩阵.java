package demo;

import java.util.Scanner;

/*
 *2016年9月1日	下午9:00:07
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class 蛇形矩阵 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		//初始化二维0矩阵
		int[][] matrix=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=0;
			}
		}
		//计算
		//值
		int v=1;
		int i=0,j=-1;
		while(true){
			if(j+1<n&&j-1>=0&&i+1<n&&i-1>=0&&matrix[i][j+1]!=0&&matrix[i+1][j]!=0&&matrix[i-1][j]!=0&&matrix[i][j-1]!=0){
				break;
			}
			//向右走
			while(j+1<n&&matrix[i][j+1]==0){
				matrix[i][j+1]=v++;
				j++;
			}
			
			//向下走
			while(i+1<n&&matrix[i+1][j]==0){
				matrix[i+1][j]=v++;
				i++;
			}
			
			//向左走
			while(j-1>=0&&matrix[i][j-1]==0){
				matrix[i][j-1]=v++;
				j--;
			}
			
			//向上走
			while(i-1>=0&&matrix[i-1][j]==0){
				matrix[i-1][j]=v++;
				i--;
			}
		}
		
		//输出
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				System.out.print(matrix[x][y]);
			}
			System.out.println();
		}
		
		
	}
}
