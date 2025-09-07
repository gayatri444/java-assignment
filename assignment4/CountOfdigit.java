//22.write a program that accepts a number and count the number of digits in given number.
import java.util.Scanner;
public class CountOfdigit{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n,digit,cnt=0;
	System.out.println("enter a number:");
	n=sc.nextInt();
	while(n>0){
	digit=n%10;
	cnt++;
	n=n/10;
	}
	System.out.println("Count:"+cnt);
	
   }
 }
