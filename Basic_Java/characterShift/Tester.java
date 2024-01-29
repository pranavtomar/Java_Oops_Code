package characterShift;

public class Tester {
	
	public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
        String resultString = "";
        String specialResultingStr = "";
		for(int i = 0; i < str.length(); ++i) {
			if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				resultString = resultString + str.charAt(i);
			}else {
				specialResultingStr += str.charAt(i);
			}
		}
		return resultString+specialResultingStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
    
}
