package stringproblem;
import java.util.Scanner;
public class ReverseEachWord {
	
	public static String revString(String part1) {
		String revStr = "";
		int n = part1.length();
		for(int i = n-1; i >= 0; --i) {
		    revStr += part1.charAt(i);
		    
		}
		return revStr;
	}
	
	public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
        String newStr = "";
		String[] parts = str.split(" ");
		
		for(int i = 0; i < parts.length; i++) {
			if(i == parts.length-1) {
				newStr += revString(parts[i]);
			}else {
				newStr += revString(parts[i]);
				newStr += " ";
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}

}
