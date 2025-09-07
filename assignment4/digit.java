//21.write a program that accepts a number and print it’s all digits. 
import java.util.Scanner;
public class digit{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n,digit;
	System.out.println("enter a number:");
	n=sc.nextInt();
	while(n>0){
	digit=n%10;
	System.out.println(digit);
	n=n/10;
   }
 }
}