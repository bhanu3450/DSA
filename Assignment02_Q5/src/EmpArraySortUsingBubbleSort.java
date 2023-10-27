import java.util.Arrays;
import java.util.Scanner;

public class EmpArraySortUsingBubbleSort {

	public static void bubbleSort(Employee arr[], int N) {
		int count = 0;
		int passes = 0;
		int flag;
		// 1. count number of passes
		for (int i = 1; i < N; i++) {
			passes++;
			flag = 0;
			// 2. compare two consecutive elements
			for (int j = 0; j < N - i; j++) {
				count++;
				// 3. if left element is greater than right element then swap
				if (arr[j].getSalary() > arr[j + 1].getSalary()) {
					Employee temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;
		}
		System.out.println("No of comparisions : " + count);
		System.out.println("No of passes : " + passes);
	}

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee(15, "Bhanu", 10000);
		arr[1] = new Employee(20, "Shikhar", 450);
		arr[2] = new Employee(39, "Nishant", 150);

		System.out.println("Array before sort : " + Arrays.toString(arr));

		bubbleSort(arr, arr.length);

		System.out.println("Array after sort : " + Arrays.toString(arr));

	}
}
