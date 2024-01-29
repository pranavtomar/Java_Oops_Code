package pallindrome;
import java.util.*;

public class checkPallindrome {
	
	 public static boolean checkPalindrome(String str){
		    String revString = "";
//		    int n = str.length();
//		    for(int i = n-1; i >= 0; --i) {
//		    	revString += str.charAt(i);
//		    }
		    int i = 0;
		    int n = str.length()-1;
		    while(i <= n/2) {
		    	if(str.charAt(i) != str.charAt(n)) {
		    		return false;
		    	}
		    	i++;
		    	n--;
		    }
		    
	        return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}

}
