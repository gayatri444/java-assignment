//24.write a program to find sum of digits of given number. 
import java.util.Scanner;
public class SumOfdigit{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n,digit,sum=0;
	System.out.println("enter a number:");
	n=sc.nextInt();
	while(n>0){
	digit=n%10;
	n=n/10;
	}
	System.out.println("sum of digit is:"+sum);
	
   }
 }
