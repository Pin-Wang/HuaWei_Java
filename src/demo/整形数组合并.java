package demo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class 整形数组合并 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer num1,num2,temp;
	     TreeSet<Integer> iset=new TreeSet<Integer>();
	     Scanner scanner=new Scanner(System.in);
	     num1=scanner.nextInt();
		    for(int i=0;i<num1;i++)
		        {
		            temp=scanner.nextInt();
		            iset.add(temp);
		        }
		    num2=scanner.nextInt();
		    for(int i=0;i<num2;i++)
		        {
		    	temp=scanner.nextInt();
		         iset.add(temp);
		        }
		   Iterator<Integer> is=iset.iterator();
		   while(is.hasNext()){
			   System.out.print(is.next());;
		   }
	}
}
