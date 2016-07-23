//package demo;
//
//import java.util.Scanner;
//
//import javax.xml.transform.ErrorListener;
//
//public class 密码强度等级 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String pass;
//		Scanner scanner=new Scanner(System.in);
//		pass=scanner.next();
//		System.out.println(passwd(pass));
//	}
//	
//	public static String passwd(String pass){
//		//密码等级结果
//		String result=null;
//		//密码得分
//		Integer count=0;
//		int len=pass.length();
//		Integer AalphaC=0;
//		Integer aalphaC=0;
//		Integer digitC=0;
//		Integer charC=0;
//		//根据长度加分
//		if(len<=4){
//			count=5;
//		}
//		else if(len>=5&&len<=7){
//			count=10;
//		}
//		else if(len>=8){
//			count=25;
//		}
//		
//		for(int i=0;i<len;i++){
//			//是数字
//			if(pass.charAt(i)>='0'&&pass.charAt(i)<='9'){
//				digitC++;
//			}
//			
//			//是大写字母
//			else if((pass.charAt(i)>='A'&&pass.charAt(i)<='Z')){
//				AalphaC++;
//			}
//			//小写字母
//			else if((pass.charAt(i)>='a'&&pass.charAt(i)<='z')){
//				aalphaC++;
//			}
//			
//			//是符号
//			else if((pass.charAt(i)>=33&&pass.charAt(i)<=47)||(pass.charAt(i)>=58&&pass.charAt(i)<=64)||(pass.charAt(i)>=91&&pass.charAt(i)<=96)){
//				charC++;
//			}
//		}
//		//全部都是小写
//		if(AalphaC==0&&aalphaC!=0){
//			count+=10;
//		}
//		//大小写混合
//		else if(AalphaC!=0&&aalphaC!=0){
//			count+=20;
//		}
//		
//		//1个数字
//		if(digitC==1){
//			count+=10;
//		}
//		//大于1个数字
//		else if(digitC>1){
//			count+=20;
//		}
//		
//		//1个符号
//		if(charC==1){
//			count+=10;
//		}
//		//大于1个符号
//		else if(charC>1){
//			count+=25;
//		}
//		
//		//字母和数字
//		if((aalphaC!=0||AalphaC!=0)&&digitC!=0&&charC==0){
//			count+=2;
//		}
//		//字母和数字，和符号
//		if((aalphaC!=0||AalphaC!=0)&&digitC!=0&&charC!=0){
//			count+=3;
//		}
//		//大写字母和数字
//		if(digitC!=0&&aalphaC==0&&AalphaC!=0&&charC==0){
//			count+=5;
//		}
//		
//		//给分
//		if(count>=90){
//			result="VERY_SECURE";
//		}
//		else if(count>=80){
//			result="SECURE";
//		}
//		else if(count>=70){
//			result="VERY_STRONG";
//		}
//		else if(count>=60){
//			result="STRONG";
//		}
//		else if(count>=50){
//			result="AVERAGE";
//		}
//		else if(count>=25){
//			result="WEAK";
//		}
//		else if(count>=0){
//			result="VERY_WEAK";
//		}
//		return result;
//	}
//
//}
