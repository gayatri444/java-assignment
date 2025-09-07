//32.Write a program to print, count and sum of factors 
import java.util.Scanner;
public class printSumCountFactorial{
public static void main(String[] args){
int n,i,sum=0,cnt=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
n=sc.nextInt();
System.out.println("factorial are "+n+"is");
for(i=1;i<=5;i++)
if(n%i==0){
  sum+=i;
  cnt++;
  System.out.println(i);
 }
System.out.println();
System.out.println("count is :"+cnt);
System.out.println("sum of factorial is :"+sum);
}
}
