
public class Airplane extends Vehicle
{
	
	public Airplane()
	{
		this("No name Airplane");
	}
	
	public Airplane(String name)
	{
		this(name, 500);
	}
	
	public Airplane(String name, int costPerHour)
	{
		this(name, costPerHour, new Engine("PrattAndWhitney", "Kerosene"));
	}
	
	public Airplane(String name, int costPerHour, Engine engine)
	{
		super(name, engine);
		mCostPerHour = costPerHour;
	}
	
	public Airplane(Airplane a)
	{
		this(a.getName(),a.getCostPerHour(),a.getEngine());
	}
	
	@Override
	public String toString(){
		return "Airplane: " + super.toString() + ", Cost per hour = " + mCostPerHour;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Airplane)) return false;
		else
		{
			Airplane a = (Airplane)other;
			return getName().equals(a.getName()) && getEngine().equals(a.getEngine()) 
					&& mCostPerHour == a.mCostPerHour;
		}
	}
	
	@Override
	public int getTripCost(int miles)
	{
		return (miles / MPH) * mCostPerHour;
	}
	
	public int getCostPerHour()
	{
		return mCostPerHour;
	}
	
	private int mCostPerHour;
	private static final double MPH = 500;
	
}