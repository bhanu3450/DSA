import java.util.Arrays;

public class DescInsertionSort {

	public static void insertionSort(int[] arr, int N) {

		int count = 0;
		int pass = 0;
		// 1. Count number of passes
		for (int i = 0; i < N; i++) {
			pass++;
			// 2. take backup of one element
			int temp = arr[i];
			// 3. find immediate left neighbour
			int j = i - 1;
			// 4. compare backed up element with all its left neighbour
			while (j >= 0 && arr[j] < temp) {
				count++;
				// 5. if left element is greater than backed up element then move it one
				// position
				// ahead
				arr[j + 1] = arr[j];
				j--;
			}
			// 6. insert backed up element at its appropriate position
			arr[j + 1] = temp;
		}
		System.out.println("pass: " + pass);
		System.out.println("no. of comparisions: " + count);
	}

	public static void main(String[] args) {
		int arr[] = { 48, 13, 94, 75, 16 };
//		int arr[] = {5, 4, 3, 2, 1};
		System.out.println("before sort: " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("after sort: " + Arrays.toString(arr));
	}

}
