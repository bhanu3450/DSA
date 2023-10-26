package solution01;


public class LinearSearch_Q1 {

	public static int linearSearch(int[] arr, int size, int key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if (arr[i] == key) {
              System.out.println("no. of comparisions are: " + count);
				return i;
			}
		}
		// if key is not found
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 45, 78, 69, 13, 89 };
		int sixtyNine[] = new int[70];
		for (int i = 1; i < sixtyNine.length; i++) {
			sixtyNine[i] = i;
		}
		
//		for (int i : sixtyNine) {
//			System.out.println("ele" + i);
//		}
		
		int comp = linearSearch(sixtyNine, sixtyNine.length, 69);
		System.out.println(" 69 found on top of " + comp);
		// no of comparisions
		int ind = linearSearch(arr, arr.length, 69);
	}
}
