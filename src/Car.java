
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
	
	
	private double mMilesPerGallon;
}
