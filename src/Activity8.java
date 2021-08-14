import java.util.*;
public class Activity8 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the length of the train:");
	    Double x = sc.nextDouble();
	    System.out.println("Enter the time in seconds:");
	    Double y = sc.nextDouble();
	    if(x<=0 || y<=0){
	        System.out.println("Invalid Input");
	        return;
	    }
	    Double s = ((x/y)*3.6) + 5;
	    System.out.println("The speed of the train is: "+s+"km/hr");
	}
}
