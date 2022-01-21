
public interface IGradeManager {

	public static final int PRINT_ALL = 0;
	public static final int PRINT_PASS = 1;
	public static final int PRINT_FAIL = 2;
	
	public abstract void printStudents(int printType);
	
}
