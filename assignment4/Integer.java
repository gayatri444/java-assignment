//20.write a program to accept to integers x and n computer x^n.
import java.util.Scanner;
public class Integer{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x,n,i,result=1;
	System.out.println("enter X:");
	x=sc.nextInt();
	System.out.println("enter n:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	result*=x;
	System.out.println(x +"raised to power of "+n+"=");
  }
}
