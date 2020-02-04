
public class Engine 
{
	public Engine(String maker, String fuel)
	{
		mMaker = maker;
		mFuel = fuel;
	}
	
	public Engine(Engine e)
	{
		this(e.getMaker(), e.getFuel());
	}
	
	public String getMaker()
	{
		return mMaker;
	}
	
	public String getFuel()
	{
		return mFuel;
	}
	
	/*
	@Override
	public String toString()
	
	@Override
	public boolean equals(Object other)
	
	*/
	
	private String mMaker;
	private String mFuel;
}
