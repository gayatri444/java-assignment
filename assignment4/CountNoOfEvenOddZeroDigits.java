//23.Write a program to accept an integer and count the number of even digits, odd and zero digits in given number. 
import java.util.Scanner;
public class CountNoOfEvenOddZeroDigits{
public static void main(String[] args){
int n,r,even=0,odd=0,zero=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
while(n>0){
r=n%10;
if(r==0)
zero++;
else if(r%2==1)
odd++;
else
even++;
n=n/10;
}
System.out.println("count of even digits:"+even);
System.out.println("count of odd digits:"+odd);
System.out.println("count of zero digits:"+zero);
}
}