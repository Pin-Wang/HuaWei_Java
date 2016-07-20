//package demo;
//
//import java.util.Scanner;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//import org.omg.CORBA.WStringSeqHelper;
//
//
//public class 多线程 {
//	private static StringBuilder str=new StringBuilder();
//	Lock lock=new ReentrantLock();
//	Condition printB=lock.newCondition();
//	Condition printC=lock.newCondition();
//	Condition printD=lock.newCondition();
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		多线程  m=new 多线程();
//		
//		for(int i=0;i<n;i++){
//			CountDownLatch cdl=new CountDownLatch(4);
//			m.new ThreadD(cdl).start();
//			m.new ThreadC(cdl).start();
//			m.new ThreadB(cdl).start();
//			m.new ThreadA(cdl).start();
//			try {
//				cdl.await();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println(str.toString());
//	}
//	
//	//线程A
//	class ThreadA extends Thread{
//		CountDownLatch cdl;
//		public ThreadA(CountDownLatch cdl){
//			this.cdl=cdl;
//		}
//		public void run(){
//			lock.lock();
//			str.append("A");
//			printB.signal();
//			cdl.countDown();
//			lock.unlock();
//		}
//	}
//	
//	//线程B
//	class ThreadB extends Thread{
//		CountDownLatch cdl;
//		public ThreadB(CountDownLatch cdl){
//			this.cdl=cdl;
//		}
//		public void run(){
//			lock.lock();
//			try {
//				String s=str.toString();
//				while(s.length()==0||s.charAt(s.length()-1)!='A'){
//					printB.await();
//					s=str.toString();
//				}
//				str.append("B");
//				printC.signal();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			finally {
//				cdl.countDown();
//				lock.unlock();
//			}
//			
//		}
//	}
//	//线程C
//	class ThreadC extends Thread{
//		CountDownLatch cdl;
//		public ThreadC(CountDownLatch cdl){
//			this.cdl=cdl;
//		}
//		public void run(){
//			lock.lock();
//			try {
//				String s=str.toString();
//				while(s.length()==0||s.charAt(s.length()-1)!='B'){
//					printC.await();
//					s=str.toString();
//				}
//				
//				str.append("C");
//				printD.signal();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			finally {
//				cdl.countDown();
//				lock.unlock();
//			}
//			
//		}
//	}
//	//线程D
//	class ThreadD extends Thread{
//		CountDownLatch cdl;
//		public ThreadD(CountDownLatch cdl){
//			this.cdl=cdl;
//		}
//		public void run(){
//			lock.lock();
//			try {
//				String s=str.toString();
//				while(s.length()==0||s.charAt(s.length()-1)!='C'){
//					printD.await();
//					s=str.toString();
//				}
//				
//				str.append("D");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			finally {
//				cdl.countDown();
//				lock.unlock();
//			}
//			
//		}
//	}
//
//}
//
//
