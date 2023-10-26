package solution02;

import java.util.Scanner;

public class EmpArrayCompUsingName {

	public static int linearSearch(Employee[] arr, int size, String key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if (arr[i].getName().equals(key)) {
				System.out.println("no. of comparisions are: " + count);
				return i;
			}
		}
		// if key is not found
		return -1;
	}

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee(15, "Bhanu", 10000000);
		arr[1] = new Employee(20, "Shikhar", 4500000);
		arr[2] = new Employee(39, "Nishant", 150);

		System.out.print("Enter key(name) to Search: ");
		String key = new Scanner(System.in).next();

		int index = linearSearch(arr, arr.length, key);

		System.out.println("Element found at index : " + index);

		try {
			System.out.println(arr[index]);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Element is not present inside the array");
		}

	}

}
