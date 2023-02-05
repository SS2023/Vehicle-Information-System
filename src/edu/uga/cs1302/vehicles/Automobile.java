package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//Automobile is a subclass of Vehicle
public class Automobile extends Vehicle
{

	public String horsepower;
	
	public Automobile()
	{
		super();
		horsepower = "unknown";
	}

	//constructor. super method calls from Vehicle.
	public Automobile(String name, String manufacturer, String yearOfManufacture, int maxPassenger, int topSpeed, String horsepower)
	{
		super( name, manufacturer, yearOfManufacture, maxPassenger, topSpeed );
		this.horsepower = horsepower;
		countOfTheInstances++;	//increases each time the constructor is called
	}

	//getter for horsepower
	public String getHorsepower()
	{
		return horsepower;
	}

	//setter for horsepower
	public void setHorsepower( String horsepower )
	{
		this.horsepower = horsepower;
	}
	
	//get the class name. (Type)
	String automobile = this.getClass().getSimpleName();

	//returns string to the main method
	@Override
	public String toString()
	{
		return "Type: " + automobile + "\nName: " + getName() +  "\nManufacturer: " + getManufacturer() + "\nManufacture year: "
				+ getYearOfManufacture() + "\nEngine power: " + horsepower + " hp" + "\nMax passengers: " + getMaxPassengers() 
				+ "\nTop speed: " + getTopSpeed() + " mph" + "\n";
	}

}

