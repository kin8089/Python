
public class ArrayTest2 {

	public static void main(String[] args) {
		String[] strings;
		String[] strings2;
		String[] strings3;
		
		strings = new String[5];                    
	    
		strings2 = new String[]{"Django","jsp/servlet","spring framework"};
	    
		strings3 = new String[]{new String("java"),new String("python"), new String("db")};
	    
	    	for(int idx=0; idx<strings.length;idx++) {
	    		System.out.print(strings[idx]+" ");
	    		
	    	}
	    	     System.out.println();
	    	     for(String n : strings2) {
	 	    		System.out.print(n+" ");
	}
	    	     System.out.println();
	    	     for(String n : strings3) {
	 	    		System.out.print(n+" ");
	
}
	
}
	
}


