//9. Write a program to find sum of 1 to N (sum of first N numbers) (with and without loop) 
import java.util.Scanner;
public class Sum1toN{
	public static void main(String[] args){
	int n,sum=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	n=sc.nextInt();

	for(i=1;i<=n;i++){
	sum+=i;
	}
	System.out.println("sum is 1 to N:"+sum);
      
   }
}