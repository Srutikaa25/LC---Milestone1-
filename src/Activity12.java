import java.util.*;
public class Activity12 {
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in); 
	     System.out.println("Enter a number: ");
	     int n=sc.nextInt(); 
	     int c=0;
	     for(int i=1;i<=n;i++)
	     {
	    	 if(n%i==0)
	    		 c=c+1;
	     }
	     if(c==2)
	    	 System.out.println(n+" is a Prime Number"); 
	     else 
	    	 System.out.println(n+"is not a Prime Number");
		}
}
