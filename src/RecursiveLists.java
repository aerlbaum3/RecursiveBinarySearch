import java.util.LinkedList;

public class RecursiveLists {

	public static void main(String[] args) {
		
		LinkedList<Integer> nums = new LinkedList<Integer>();
		
		nums.add(1);
		nums.add(19);
		nums.add(28);
		nums.add(17);
		nums.add(4);
		int index = 0;
		boolean checkInList = recursiveSearch(nums, 4, index);
		System.out.println(checkInList);
		
		
		
	}

	private static boolean recursiveSearch(LinkedList<Integer> nums, int search, int index) {
		
		if(index == nums.size()) {
			return false;
		}
		
		
		if(nums.get(index)==search) {
			return true;
		}
		
		
		return recursiveSearch(nums,search,index+1); 
		
		
		
	}

}
