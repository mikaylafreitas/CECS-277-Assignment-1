
public class Radio 
{
	public Radio()
	{
		this("Original");
	}
	
	public Radio(String name)
	{
		mName = name;
	}
	
	public String getName()
	{
		return mName;
	}
	
	public void setName(String name)
	{
		mName = name;
	}
	
	@Override
	public String toString()
	{
		return "Radio: " + mName;
	}
	
	private String mName;
}
