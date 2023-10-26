package solution01;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
		int count = 0;

		while (left <= right) {
			mid = (left + right) / 2;
			count++;
			if (key == arr[mid]) {
				System.out.println("No. of comparisions: " + count);
				return mid;
			} else { 
				if(key < arr[mid])
					right = mid - 1;
				else
					left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 48, 23, 49, 16, 100, 79 };
		Arrays.sort(arr);
		System.out.println("Enter key to be searched");
		int key = new Scanner(System.in).nextInt();
		int index = binarySearch(arr, arr.length, key);
		System.out.println("element found at index " + index);
	}

}
