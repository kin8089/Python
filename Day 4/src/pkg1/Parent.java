package pkg1;

public class Parent {

//	public String name = "Parent";
//	protected String name = "Parent";
//	String name = "Parent";
	private String name = "Parent";
	
	public String getName() {
		//권한 체크, 유효성 체크등
		return name;
	}
	public void setName(String name) {
		//권한 체크, 유효성 체크등
		this.name = name;
	}
}
