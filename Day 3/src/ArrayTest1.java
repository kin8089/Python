
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] nums;
		int[] nums2;
		
		nums = new int[5];                    
	    nums2 = new int[]{100,200,300};
	    
	    System.out.println(nums.length);
	    System.out.println(nums2.length);
	    for(int idx = 0; idx<nums.length; idx++) {
	    	System.out.print(nums[idx]+" ");
	    		
	    }
	    System.out.println();
	    for(int n : nums2) {           //순차적 접근만 가능. advanced for문
	    	System.out.print(n+" ");
}
}
}