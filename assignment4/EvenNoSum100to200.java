//16.write a program to find sum of even numbers from 100 to 200 (or odd numbers) 
import java.util.Scanner;
public class EvenNoSum100to200{
public static void main(String[] args){
int sum=0;
for(int i=100;i<=200;i++)
if(i%2==0){
sum+=i;
}
System.out.println("sum of number:"+sum);
}
}
