package stringproblem;

public class FindHighestOccurence {
	
	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
		int n = str.length();
		
		int maxCount = 0;
		for(int i = 0; i < n-1; ++i) {
			int count = 0;
			for(int j = i; j < n; ++j) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
				}
			}
			
			if(maxCount < count) {
				maxCount = count;
			}
		}
		return maxCount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}

}
