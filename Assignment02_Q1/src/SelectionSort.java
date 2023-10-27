import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr, int N) {
		int pass = 0;
		int count = 0;
		int temp = 0;
		
		//1. count number of passes
		for (int i = 0; i < N - 1; i++) {
			pass++;
			//2. select one position from array - i
			//3. compare ith element with all other elements(right side)
			System.out.println("pass: " + pass);
			for (int j = i + 1; j < N; j++) {
				//3.1 if selected element is greater than other element then swap
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
					System.out.println("count: " + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 48, 13, 94, 75, 16 };
		System.out.println("before sort: " + Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("after sort: " + Arrays.toString(arr));
	}

}
