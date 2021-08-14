import java.util.*;
public class Activity10 {
	public static void main(String[] args) {
		int n=8;
		int x =n*n;
		while(true){
			x=n*n;
			if(x%21==0 && x%36==0 && x%66==0){
				break;
			}
			n++;
		}
		System.out.println("The least perfect square which is divisible by each of 21, 36 and 66 is: "+x);
	}
}
