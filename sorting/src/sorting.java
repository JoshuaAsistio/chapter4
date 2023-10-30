public class sorting {    
    public static void main(String[] args) {
    	int[] nums = {88, 33, 99, 22, 54};
    	
    	System.out.print("Unsorted array is [ ");
    	for (int num : nums) {
    		System.out.print(num + ", ");
    	}
    	System.out.print(" ]");
    	
    	System.out.print("\n");
    	
    	bubbleSort(nums);
    	
    	System.out.print("Sorted array is [ ");
    	for (int num : nums) {
    		System.out.print(num + ", ");
    	}
    	System.out.println(" ]");	
    }
    
    public static void bubbleSort(int[] nums) {
    	int temp;
    	int comparisonsToMake = nums.length - 1;
		for(int a = 0; a < nums.length - 1; ++a) {
			for(int b = 0; b < comparisonsToMake; ++b)  {
				if(nums[b] > nums[b + 1]){
					temp = nums[b];
					nums[b] = nums[b + 1];
					nums[b + 1] = temp;
				}
			}
			--comparisonsToMake;
		}
    }
}
