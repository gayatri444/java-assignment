import java.util.Scanner;
public class Operation{
  public static void main(String arg[]){
      int a,b;
      char op;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter A");
        a=sc.nextInt();
      System.out.println("Enter a Operation");
       op=sc.next().charAt(0);
      System.out.println("Enter B");
       b=sc.nextInt();

      switch(op){
       case '+' ->System.out.println("Addition ="+(a+b));
       case '-' ->System.out.println("Subtraction="+(a-b));
       case '*' ->System.out.println("Multiplication ="+(a*b));
       case '/' ->System.out.println("Division ="+(a/b));
        }
    }
}