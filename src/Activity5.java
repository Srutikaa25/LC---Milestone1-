import java.util.*;
public class Activity5 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the numbers: ");
	    int sum=0;
	    for(int i=0;i<10;i++){
	        int n = sc.nextInt();
	        sum += n;
	    }
	    System.out.println("The average is: "+sum/10);
	    
	}
}
