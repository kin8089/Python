
public class ArrayTest4 {

	public static void main(String[] args) {
		int[] nums;
		int[] nums2;
		 
		nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		nums2 = new int[]{100,100,100,100,100,100,100,100,100,100};
		
		System.arraycopy(nums, 3, nums2, 3, 6);       //nums의 4번째부터 6개를 카피하여 nums2의 4번째부터 붙여넣기
		 
		for(int e : nums2) {
			System.out.println(e+ " ");  
		
		
		
		
}
	

}
	
}
