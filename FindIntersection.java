package week2.Day2;

public class FindIntersection {
	public static void main(String[] args) {
		
		int [] array1 = {3,2,11,4,6,7};
		int [] array2 = {1,2,8,4,9,7};
		int length1 = array1.length;
		int length2 = array2.length;
		
		for (int i=0;i<length1;i++) {
			for (int l=0;l<length2;l++)
				
			if (array1[i]==array2[l]) {
				System.out.println(array1[i]);
			}
		}
				
	}

}
