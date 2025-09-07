
//Write a program to print x to y (both inclusive) 
import java.util.Scanner;
public class printXtoY{
	public static void main(String[] args){
	int i,x,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter X starting number:");
	x=sc.nextInt();
	System.out.println("enter Y ending number:");
	y=sc.nextInt();
	for(i=x;i<=y;i++){
	System.out.println(i);
    }
  }
}