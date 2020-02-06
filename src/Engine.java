// Assignment One
// Mikayla Freitas
// Michael Kriesel

public class Engine 
{
	public Engine()
	{
		this("PrattAndWhitney", "Gas");
	}
	
	public Engine(String maker)
	{
		this(maker, "Gas");
	}
	
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
	
	
	@Override
	public String toString()
	{
		return "Engine: Maker = " + mMaker + ", Fuel = " + mFuel;
	}
	
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Engine)) return false;
		else
		{
			Engine e = (Engine)other;
			return mMaker == e.mMaker && mFuel == e.mFuel;
		}
	}
	
	private String mMaker;
	private String mFuel;
}