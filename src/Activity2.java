import java.util.*;
public class Activity2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the array elements: ");
	    int l[] = new int[10];
	    for(int i=0;i<10;i++){
	        l[i] = sc.nextInt();
	    }
	    int max = l[0];
	    for(int i=0;i<10;i++){
	        if(l[i]>max){
	            max=l[i];
	        }
	    }
	    int c=0;
	    for(int i=0;i<10;i++){
	    	if(l[i]==max){
	    		c++;
	    	}
	    }
	    System.out.println("Count of occurence of maximum value in the array: "+c);
	}
}
