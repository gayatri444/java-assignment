//10. Write a program to find sum of x to y (both inclusive)
import java.util.Scanner;
public class SumXtoY{
	public static void main(String[] args){
	int x,y,sum=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter X starting number:");
	x=sc.nextInt();
	System.out.println("enter Ystarting number:");
	y=sc.nextInt();
	for(i=x;i<=y;i++){
	sum+=i;
	}
	System.out.println("sum is X to Y:"+sum);
      
   }
} 