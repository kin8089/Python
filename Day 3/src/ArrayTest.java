public class ArrayTest {

	public static void main(String[] args) {
		Array src = new Array("ù��° Array", 3, 4);
		Array dest = new Array("�ι�° Array", 3, 4);
		src.makeArrayData();
		dest.makeArrayData();
		src.printArray();
		dest.printArray();
		src.findMatchNumber(src, dest);
	}

}
