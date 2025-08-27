import java.util.Scanner; 
class DistancsTravelled {
    public static void main(String args[]){
	float initialvelocity,acceleration,time;
	double finalVelocity,distance;
	Scanner sc=new Scanner(System.in);
	System.out.println("Initial Velocity :");
	initialvelocity=sc.nextFloat();
	System.out.println("acceleration:");
	acceleration=sc.nextFloat();
	System.out.println("Time:");
	time=sc.nextFloat();
	finalVelocity=initialvelocity+acceleration*time;
	distance=(initialvelocity*time)+(1*acceleration*time*time)/2;
	System.out.println("Finalvelocity:"+finalVelocity);
	System.out.println("Distanc:"+distance);
 }
}