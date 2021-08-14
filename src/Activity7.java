import java.util.*;
public class Activity7 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the speed:");
	    int x = sc.nextInt();
	    System.out.println("Enter the time in seconds:");
	    int y = sc.nextInt();
	    if(x<=0 || y<=0){
	        System.out.println("Invalid Input");
	        return;
	    }
	    int l = y * (x*1000)/3600;
	    System.out.println("The length of the train is: "+l+"m");
	}
}
