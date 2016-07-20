package demo;

import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class 质数因子 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		List list=new ArrayList<Integer>();
		
		for(int i=2;i<=n;i++){
			while(n%i==0){
					list.add(i);
					n/=i;
			}
		}
		
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next());
			if(iterator.hasNext()){
				System.out.print(" ");
			}
		}
	}

}
