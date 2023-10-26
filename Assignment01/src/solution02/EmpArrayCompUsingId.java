package solution02;

import java.util.Scanner;

public class EmpArrayCompUsingId {

	public static int binarySearch(Employee arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
		int count = 0;

		while (left <= right) {
			mid = (left + right) / 2;
			count++;
			if (key == arr[mid].getId()) {
				System.out.println("No. of comparisions: " + count);
				return mid;
			} else {
				if (key < arr[mid].getId())
					right = mid - 1;
				else
					left = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee(15, "Bhanu", 10000);
		arr[1] = new Employee(20, "Shikhar", 45000);
		arr[2] = new Employee(39, "Nishant", 1500);
		
		System.out.print("Enter key to Search: ");
		int key = new Scanner(System.in).nextInt();
		int index = binarySearch(arr, arr.length, key);
		System.out.println("Element found at index : " + index );
		try {
		System.out.println(arr[index]);
		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println("Element is not present inside the array");
		}

	}

}
