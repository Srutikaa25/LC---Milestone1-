import java.util.*;
public class Activity6 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string:");
	    String str = sc.nextLine();
	    char s[] = str.toCharArray();  
	    int a=0;
	    for(int i=0;i<s.length;i++){
	        int j;
	        for(j=0;j<i;j++){
	            if(s[i]==s[j]){
	                break;
	            }
	        }
	        if(j == i)    
            {   
                s[a++] = s[i];   
            }   
	    }
	    System.out.println(String.valueOf(Arrays.copyOf(s,a)));
	}
}
