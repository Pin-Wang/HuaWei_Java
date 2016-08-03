/*
 * 
 * 描述：
在一个圆形操场的四周摆放着n 堆石子。现要将石子有次序地合并成一堆。
规定每次只能选相邻的2 堆石子合并成新的一堆，并将新的一堆石子数记为该次合并的得分。
试设计一个算法，计算出将n堆石子合并成一堆的最小得分和最大得分。
 */


/*
 * 
 * 开始以为通过贪心算法可能很快解决问题，可是是行不通的。

      首先我们可以把这么堆石子看成一列

      我们假如5堆的石子，其中石子数分别为7，6，5，7，100

      •按照贪心法，合并的过程如下：
        每次合并得分
        第一次合并  7  6   5   7    100   =11
   　  第二次合并  7   11     7   100=18
    　 第三次合并  18    7    100 =25
        第四次合并   25   100 =125

        总得分＝11＋18＋25+125＝179

       •另一种合并方案
        每次合并得分
  　 　第一次合并  7  6   5   7    100   ->13
         第二次合并  13   5     7   100->12
         第三次合并  13    12    100 ->25
         第四次合并   25   100 ->125

         总得分＝13＋12＋25+125＝175

         显然利用贪心来做是错误的，贪心算法在子过程中得出的解只是局部最优,而不能保证使得全局的值最优。
 */

package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

public class 搬书游戏__石子合并问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//数字数量
		Integer n=0;
		//最后得分
		Integer score=0;
		Integer[] list=null;
		//处理输入
		int count=0;
		while(scanner.hasNextInt()){
			count++;
			if(count==1){
				n=scanner.nextInt();
				list=new Integer[n];
				continue;
			}
			else{
				for (int i = 0; i <n; i++) {
					list[i]=scanner.nextInt();
				}
			}
			minStone(list);
			count=0;
			score=0;
		}
	}
	
	public static void  minStone(Integer[] a)
	 {
	  int n=a.length;
	  int[][] s=new int[a.length][a.length+1];
	  for(int j=2;j<=n;j++) 
	  for(int i=0;i<n;i++)
	  { 
	    s[i][j]=s[i][1]+s[(i+1)%n][j-1]+sum(a,i,j);
	    for(int k=2;k<=j-1;k++)
	   { 
	    int t=(i+k)%n;
	    int temp=s[i][k]+s[t][j-k]+sum(a,i,j);
	    
	     
	    if(s[i][j]>temp)
	    {
	      s[i][j]=temp;
	    }
	   }
	  }
	 int temp=s[0][n];
	 for(int i=1;i<n;i++)
	 {
	  
	  if(s[i][n]<temp)
	  temp=s[i][n];
	 }
	 System.out.println(temp);

	 }
	 public static int sum(Integer[] a,int i,int j)
	 {
	  int sum=0;
	  int length=a.length;
	  
	  for(int k=i;k<i+j;k++)
	  { 
	   int t=k;
	   if(k>length-1) t=t%length;
	   sum+=a[t];
	  }
	  return sum;
	 }
}
