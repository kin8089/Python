
public class ArrayTest4 {

	public static void main(String[] args) {
		int[] nums;
		int[] nums2;
		 
		nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		nums2 = new int[]{100,100,100,100,100,100,100,100,100,100};
		
		System.arraycopy(nums, 3, nums2, 3, 6);       //nums�� 4��°���� 6���� ī���Ͽ� nums2�� 4��°���� �ٿ��ֱ�
		 
		for(int e : nums2) {
			System.out.println(e+ " ");  
		
		
		
		
}
	

}
	
}
