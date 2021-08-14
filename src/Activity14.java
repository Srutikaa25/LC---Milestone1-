import java.util.*;
public class Activity14 {
	static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
	public static void main(String[] args) {
	    int a=43, b=91, c=183;
	    int res = gcd(b-a,c-b);
	    System.out.println("The greatest number that will divide 43, 91 and 183 is: "+gcd(res,c-a));
	}
}
