import java.util.Scanner;
class Multiplication{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number N");
	int n=sc.nextInt();
	for(int num=1;num<=n;num++){
	System.out.println("Multiplication:"+num);
	for(int i=1;i<=10;i++){
	System.out.println(num+"*"+i+"="+(num*i));
     }
    }
  }
}