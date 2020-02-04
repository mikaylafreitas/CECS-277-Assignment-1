
public abstract class Vehicle 
{
	public Vehicle()
	{
		this("No Name Vehicle");
	}
	
	public Vehicle(String name)
	{
		this(name, new Engine("GE", "Gas"));
	}
	
	public Vehicle(String name, Engine engine)
	{
		mName = name;
		mEngine = new Engine(engine);
	}
	
	public String getName()
	{
		return mName;
	}
	
	public Engine getEngine()
	{
		return mEngine;
	}
	
	@Override
	public String toString()
	{
		return "Name = " + mName + ", " + mEngine;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Vehicle)) return false;
		else
		{
			Vehicle v = (Vehicle)other;
			return mEngine.equals(v.mEngine);
		}
	}
	public abstract int getTripCost(int miles);
	
	private String mName;
	private Engine mEngine;
}
