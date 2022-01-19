
public class Quiz1 {

	public static void main(String[] args) {
		
		
		for(int i = 2; i <= 100; i++) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if (i%j ==0) {
					count ++ ;
					
				}
				
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
		
	}
//		 int i =0;
//	       int num =0;
//	       System.out.println("Prime numbers from 1 to 100 are :");
//
//	       for (i = 1; i <= 100; i++)       { 		  	  
//	           int counter=0; 	  
//	           for(num =i; num>=1; num--)	  {
//	              if(i%num==0)  {
//	            	     counter = counter + 1;
//	                }
//	            }                                //inner for end
//		 if (counter ==2)	  {	     
//		      System.out.print( i + " ");
//		 }	
//	       }                                     //outer for end	     
//	       
//	   }                                         //main end
}