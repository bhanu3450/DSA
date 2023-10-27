import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr, int N) {
		int pass = 0;
		int count = 0;
		boolean flag;
		//1. count number of passes
		for (int i = 1; i < N; i++) {
			pass++;
			System.out.println("pass: " + pass);
			flag = false;
			//2. compare two consecutive elements
			for (int j = 0; j < N-i; j++) {
				//3. if left element is greater than right element then swap
				count++;
				System.out.println("no. of comparisions: " + count);
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
            // flag is used for checking if the array is sorted or not if the flag remains 
			//false that means no swapping took place and every time swappin happens flag is
			// turned to true
			if (flag == false)
				break;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 48, 13, 94, 75, 16 };
		System.out.println("before sort: " + Arrays.toString(arr));
		bubbleSort(arr, arr.length);
		System.out.println("after sort: " + Arrays.toString(arr));
	}

}
