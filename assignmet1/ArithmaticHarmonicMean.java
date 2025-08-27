import java.util.Scanner;
public class ArithmaticHarmonicMean{
public static void main(String args[]){		
        int a,b;
	double AM,HM;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	AM=(a+b)/2;
	HM=2*a*b/(a+b);
	System.out.println("Arithmatic mean :"+AM);
	System.out.println("Harmonic mean :"+HM);
  }
}