import java.util.Scanner;
public class AreaOfCircleAndCir
{
public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    double area,Circumference;
    float r,PI;
    System.out.println("Enter radius of circle");
    r=sc.nextFloat();
    area=Math.PI*r*r;
    System.out.println("area of circle is "+area);
    Circumference=2*Math.PI*r;
    System.out.println("Circumference circle is "+Circumference);
  }
}