import java.util.*;
public class Activity9 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the total number of votes:");
	    int x = sc.nextInt();
	    int valid = (x*80*45)/10000;
	    System.out.println("The number of valid votes that the other candidate got: "+valid);
	}
}
