
public class Radio{
	
	public Radio(){
		this("Original Radio");
	}
	
	public Radio(String name){
		mName = name;
	}
	
	public String getName(){
		return mName;
	}
	
	private String mName;
}