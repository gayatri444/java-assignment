//30.write a program to print sum of factors of a given number 
import java.util.Scanner;
public class FactorsSum{
public static void main(String[] args){
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
n=sc.nextInt();
System.out.println("Factorial of"+n+"are");
int sum=0;
for(i=1;i<n;i++)
if(n%i==0)
sum+=i;

System.out.println("Sum is "+sum);
}
}