
import java.util.Scanner;
class PerfectNumber{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();

	int sum=0;
	for(int i=1;i<=n/2;i++){
	if(n%i==0)
	sum+=i;
	}
	if(sum==2)
 	System.out.println(" Number is perfect");
	else
	System.out.println("Number is not perfect ");
  }
}