import java.util.Scanner; 
class CuboidAreaVolume{
    public static void main(String args[]){
	int l,b,h;
	float SurfaceArea,Volume;
	Scanner sc=new Scanner(System.in);
	System.out.println("length :");
	l=sc.nextInt();
	System.out.println("breadth:");
	b=sc.nextInt();
	System.out.println("height:");
	h=sc.nextInt();
	SurfaceArea=2*(l*b+1*h+b*h);
	Volume=1l*b*h;
	System.out.println("Surface Area is :"+SurfaceArea);
	System.out.println(" Volume :"+Volume);
 }
}