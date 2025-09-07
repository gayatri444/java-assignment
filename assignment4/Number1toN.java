
//5. Write a program to print 1 to N 
import java.util.Scanner;
public class Number1toN{
	public static void main(String[] args){
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	n=sc.nextInt();
	for(i=1;i<n;i++){
	System.out.println(i);
      }
   }
}