package arrays;

public class ArrayAssignment7 {
	
	public static String[] findPermutations(String str){
        
		int[] string = new int[5];
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				for(int k = j+1; k < str.length(); k++) {
					string[i] += str.charAt(i);
				}
			}
		}
        return null;
    }

	public static void main(String[] args) {
		String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
		
	}

}
