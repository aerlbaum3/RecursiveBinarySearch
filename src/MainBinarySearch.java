
public class MainBinarySearch {

	public static void main(String[] args) {

		//create a sorted array
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//number we are searching for 
		int search = 4;
		//call the recursive method sending in the array, the search and the lowest index  and highest index
		int result = binarySearch(nums, search, 0, nums.length -1);
		
		if(result != -1) {
			System.out.println("Element found at index: " + result);
		}
		else {
			System.out.println("Element not found");
		}
	}

	public static int binarySearch(int[] nums, int search, int left, int right) {
		
		if(left <= right) {
			//find your middle index
			
			int middle = left + (right - left) / 2;
			
			//if the middle index is equal to the search element return the middle
			
			if(nums[middle] == search) {
				return middle; //element was found
			}
			//if middle is less than search than only search now the right of middle
			//continuously search like this until element is found
			
			if(nums[middle] < search) {
				return binarySearch(nums, search, middle + 1, right);
				
			}
			//if middle is more than search than only search to the left of the middle.
			
			if(nums[middle] > search) {
				return binarySearch(nums, search, left, middle -1);
			}
		}
			
			return -1; //element not found
		
	}
}