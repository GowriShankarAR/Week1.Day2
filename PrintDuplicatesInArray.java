package week2.Day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};		
		int size = arr.length;		
				
		for(int i=0;i<size;i++){			
			for(int l=i+1;l<size;l++) {
				if (arr[i] == arr[l]) {
				
				System.out.println(arr[i] + " has duplicate entry in the array");
				}
		}

	}
	}
}
