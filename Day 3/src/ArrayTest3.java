
public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] nums;
		
//		 nums = new int[5][5];
//		 nums = new int[5][];
//		 nums = new int[][5];    //������ ����
		 nums = new int[][]{  {1} , {1 , 2} , {1 , 2 , 3} , {1 , 2 , 3 , 4}  }; 
		 
		 System.out.println(nums.length);      //2���� �迭�� ��size
		 System.out.println(nums[0].length);   //2���� �迭�� ù��° 1���� �迭��size
		 System.out.println(nums[1].length);   //2���� �迭�� �ι�° 1���� �迭��size
		 
		 for(int idx=0; idx<nums.length;idx++) {
			 for(int j=0; j<nums[idx].length;j++) {
			 
				 System.out.print(nums[idx][j]+" ");
}
			 	 System.out.println();
}
	
}
}