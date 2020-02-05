
public class Airplane extends Vehicle{
	
	public Airplane(){
		this("No name Airplane");
	}
	
	public Airplane(String name){
		this(name, 500);
	}
	
	public Airplane(String name, double costPerHour){
		this(name, costPerHour, new Engine("PrattAndWhitney", "Kerosene"))
	}
	
	public Airplane(String name, double costPerHour, Engine engine){
		super(name, engine);
		mCostPerHour = costPerHour;
	}
	
	public Airplane(Airplane a){
		this(a.getName(),a.getCostPerHour(),a.getEngine());
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
		if(!(other instanceof Airplane)){
			return false;
		}
		else{
			//complete here
		}
	}
	
	public double getCostPerHour(){
		return mCostPerHour;
	}
	
	private double mCostPerHour;
}