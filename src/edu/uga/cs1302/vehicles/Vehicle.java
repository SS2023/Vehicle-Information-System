package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//Vehicle class is a abstract class that implements from Transporter. Thus, all subclasses have the methods
public abstract class Vehicle implements Transporter
{
	
	public int topSpeed;
	public int maxPassengers;
	public String name;
	public String manufacturer;
	public String yearOfManufacture;
	public static int countOfTheInstances; //static variable because it is the common place for all objects. It is used throughout 
				        	//the applicaton and need to know every instance
	
	public Vehicle()
	{
		super();
		name = "unknown";
		manufacturer = "unknown";
		yearOfManufacture = "unknown";
	}

	//constructor. All subclasses call from this	
	public Vehicle (String name, String manufacturer, String yearOfManufacture, int maxPassengers, int topSpeed)
	{
		this.name = name;
		this.manufacturer = manufacturer;
		this.yearOfManufacture = yearOfManufacture;
		this.maxPassengers = maxPassengers;
		this.topSpeed = topSpeed;
	}

	//getter for max passengers
	public int getMaxPassengers()
	{
		return maxPassengers;
	}

	//setter for max passengers
	public void setMaxPassengers (int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
	}

	//getter for top speed
	public int getTopSpeed()
	{
		return topSpeed;
	}

	//setter for top speed
	public void setTopSpeed (int topSpeed)
	{
		this.topSpeed = topSpeed;
	}

	//getter for name
	public String getName()
	{
		return name;
	}

	//setter for name
	public void setName (String name)
	{
		this.name = name;
	}

	//getter for manufacturer
	public String getManufacturer()
	{
		return manufacturer;
	}

	//setter for manufacturer
	public void setManufacturer (String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	//getter for year of manufacture
	public String getYearOfManufacture()
	{
		return yearOfManufacture;
	}

	//setter for year of manufacture
	public void setYearOfManufacture (String yearOfManufacture)
	{
		this.yearOfManufacture = yearOfManufacture;
	}

}
