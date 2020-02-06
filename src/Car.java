
public class Car extends Vehicle{
	
	public Car()
	{
		this("No name Car");
	}
	
	public Car(String name)
	{
		this(name, 20);
	}
	
	public Car(String name, int milesPerGallon)
	{
		this(name, milesPerGallon, new Engine("Chevy", "Gas"));
	}
	
	public Car(String name, int milesPerGallon, Engine engine)
	{
		super(name, engine);
		mMilesPerGallon = milesPerGallon;
		mRadio = new Radio();
	}
	
	public Car(Car c)
	{
		this(c.getName(), c.getMilesPerGallon(), c.getEngine());
	}
	
	public void setRadio(Radio radio)
	{
		mRadio = radio;
	}
	
	public int getMilesPerGallon()
	{
		return mMilesPerGallon;
	}
	
	@Override
	public String toString()
	{
		return "Car: " + super.toString() + ", MPG: " + mMilesPerGallon + ", "  + mRadio;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Car)) return false;
		else
		{
			Car c = (Car)other;
			return getName().equals(c.getName()) && 
					mMilesPerGallon == c.mMilesPerGallon;
		}
	}
	
	@Override
	public int getTripCost(int miles)
	{
		return (miles / mMilesPerGallon) * CPG;
	}
	
	private int mMilesPerGallon;
	private Radio mRadio;
	
	private static final int CPG = 3;
}
