import java.util.*;
public class Activity1{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the array elements: ");
	    int l[] = new int[25];
	    for(int i=0;i<25;i++){
	        l[i] = sc.nextInt();
	    }
	    int max = l[0];
	    for(int i=0;i<25;i++){
	        if(l[i]>max){
	            max=l[i];
	        }
	    }
	    System.out.println("The maximum number in the array is: "+max);
	}
}
