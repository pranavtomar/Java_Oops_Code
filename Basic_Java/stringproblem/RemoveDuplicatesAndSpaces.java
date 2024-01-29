package stringproblem;

public class RemoveDuplicatesAndSpaces {
	
	public static String removeDuplicatesandSpaces(String str) {
		String newStr = "";
		str = str.replaceAll(" ", "");
		for(int i = 0; i < str.length(); ++i) {
			boolean flag = true;
			for(int j = 0; j < i; ++j) {
				if(str.charAt(i) == str.charAt(j)) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}

}
