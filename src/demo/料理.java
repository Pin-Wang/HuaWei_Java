package demo;

import java.util.Scanner;
import java.util.TreeSet;

public class 料理 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		TreeSet set=new TreeSet<String>();
		while(scanner.hasNext()){
			set.add(scanner.next());
		}
		System.out.println(set.size());
	}
}
