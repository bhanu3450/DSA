package solution05;

import java.util.Arrays;

// 3. find the first non-repeating element:
//Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
//Ouput: 3

public class NonRepeatingEle {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
//		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 0) {
				System.out.println("first non repeating ele is " + arr[i]);
				break;
			}
		}
	}
}
