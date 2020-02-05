
public class Car extends Vehicle{
	
	public Car(){
		this("No name Car");
	}
	
	public Car(String name){
		this(name, 20);
	}
	
	public Car(String name, double milesPerGallon){
		this(name, milesPerGallon, new Engine("Chevy", "Gas"));
	}
	
	public Car(String name, double milesPerGallon, Engine engine){
		super(name, engine);
		mMilesPerGallon = milesPerGallon;
	}
	
	@Override
	public String getName(){
		return super.getName();
	}
	
	@Override
	public Engine getEngine(){
		return super.getEngine();
	}
	
	@Override
	public boolean equals(Object other){
		if(!(other instanceof Car)){
			return false;
		}
		else{
			Car c = (Car)other;
			return getName().equals(c.getName()) && getEngine().equals(a.getEngine()) 
					&& mMilesPerGallon.equals(c.mMilesPerGallon);
		}
	}
	
	private double mMilesPerGallon;
	private final double CPG = 3;
}
