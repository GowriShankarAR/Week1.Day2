package week2.Day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,7,6,8};
		int length = array.length;
		Arrays.sort(array);
		for (int i = array[0]; i < length; i++) {
			if(array[i]!=i+1) {
			System.out.println("Print the missing number :"+ (i+1));	
			break;
		}
		}
	}
}
