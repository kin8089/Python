
public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] nums;
		
//		 nums = new int[5][5];
//		 nums = new int[5][];
//		 nums = new int[][5];    //컴파일 오류
		 nums = new int[][]{  {1} , {1 , 2} , {1 , 2 , 3} , {1 , 2 , 3 , 4}  }; 
		 
		 System.out.println(nums.length);      //2차원 배열의 행size
		 System.out.println(nums[0].length);   //2차원 배열의 첫번째 1차원 배열의size
		 System.out.println(nums[1].length);   //2차원 배열의 두번째 1차원 배열의size
		 
		 for(int idx=0; idx<nums.length;idx++) {
			 for(int j=0; j<nums[idx].length;j++) {
			 
				 System.out.print(nums[idx][j]+" ");
}
			 	 System.out.println();
}
	
}
}