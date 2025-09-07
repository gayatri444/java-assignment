//15.write a program to find sum of even numbers from 1 to 10 (or odd numbers) 
import java.util.Scanner;
public class EvenNoSum1to10{
public static void main(String[] args){
int sum=0;
for(int i=1;i<=10;i++)
if(i%2==0){
sum+=i;
}
System.out.println("sum of number:"+sum);
}
}
