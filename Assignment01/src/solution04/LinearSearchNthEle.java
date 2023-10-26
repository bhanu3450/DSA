package solution04;

//4. Implement linear search algorithm to find the nth occurence of the given element.
//If nth occurrence is not found, return -1.

public class LinearSearchNthEle {

	public static int linearSearch(int[] arr, int size, int key, int n) {
		int count = 0;
		int comp = 0;
		for (int i = 0; i < size; i++) {
			comp++;
			if (arr[i] == key) {
				++count;
				if (count == n) {
					System.out.println("no. of comparisions are: " + comp);//
					return i;
				}
			}
		}
		// if key is not found
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 8, 9, 1, 3 };
		int index = linearSearch(arr, arr.length, 1, 2);
		System.out.println("nth element : " + arr[index]);
	}

}
