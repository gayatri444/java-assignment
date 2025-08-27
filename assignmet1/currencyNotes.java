import java.util.Scanner;
class currencyNotes{
	public static void main(String args[]){
	int amount;
	int note10,note5,note1,rem10,rem5;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a amount to withdrawn:");
	amount=sc.nextInt();

	note10=amount/10;
	rem10=amount%10;

	note5=rem10/5;
	rem5=rem10%5;

	note1=rem5;

	System.out.println("Currency Note:");
	System.out.println("Number of 10 note:"+note10);
	System.out.println("Number of 5 note:"+note5);
	System.out.println("Number of 1 note:"+note1);
  }
}