import java.util.Scanner;
class ProfitLoss{
	public static void main(String args[]){
	float cp,sp;
	double l,p;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Cost price");
	cp=sc.nextFloat();
	System.out.println("Enter Selling price");
	sp=sc.nextFloat();
	if(sp>cp){
	 p=sp-cp;
	 System.out.println("Profit is"+p);
	}
	else if(cp>sp){
	 l=cp-sp;
	 System.out.println("loss is "+1);
	}
	else{
	 System.out.println("Enter Selling price");
    }
 }
}
	
