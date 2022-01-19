public class ArrayTest {

	public static void main(String[] args) {
		Array src = new Array("첫번째 Array", 3, 4);
		Array dest = new Array("두번째 Array", 3, 4);
		src.makeArrayData();
		dest.makeArrayData();
		src.printArray();
		dest.printArray();
		src.findMatchNumber(src, dest);
	}

}
