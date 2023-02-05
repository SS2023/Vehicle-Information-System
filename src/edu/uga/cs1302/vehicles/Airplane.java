package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//Airplane is a subclass of Vehicle that implements from Flyable
public class Airplane extends Vehicle implements Flyable
{

        public int numberOfEngines;
        public int maxAltitude;
        public int maxRange;
        
	//default
        public Airplane()
        {
        	super();
        	numberOfEngines = 0;
        	maxAltitude = 0;
        	maxRange = 0;
        }
	
	//constructor. super method calls from Vehicle class. 
	//countOfTheInstances increases each time an Airplane constructor is called. 
        public Airplane( String name, String manufacturer, String yearOfManufacture, int maxPassenger, int topSpeed, int numberOfEngines,
			 int maxAltitude, int maxRange )
        {
                super( name, manufacturer, yearOfManufacture, maxPassenger, topSpeed );
                this.numberOfEngines = numberOfEngines;
                this.maxAltitude = maxAltitude;
                this.maxRange = maxRange;
                countOfTheInstances++;
        }

	//getter for number of engines.
        public int getNumberOfEngines()
        {
                return numberOfEngines;
        }

	//setter for number of engines.
        public void setNumberOfEngines( int numberOfEngines )
        {
                this.numberOfEngines = numberOfEngines;
        }
        
	//getter for max altitude
        public int getMaxAltitude()
        {
                return maxAltitude;
        }

	//setter for max altitude
        public void setMaxAltitude( int maxAltitude )
        {
                this.maxAltitude = maxAltitude;
        }
 
	//getter for max range       
        public int getMaxRange()
        {
                return maxRange;
        }

	//setter for max range
        public void setMaxRange( int maxRange )
        {
                this.maxRange = maxRange;
        }

	//variable to get class name. (Type)
        String airplane = this.getClass().getSimpleName();
        
	//returns string to the main class
        @Override
        public String toString()
        {
                return "Type: " + airplane + "\nName: " + getName() +  "\nManufacturer: " + getManufacturer() + "\nManufacture year: "
                + getYearOfManufacture() + "\nNumber of engines: " + numberOfEngines + "\nMax passengers: " + getMaxPassengers() +
		 "\nTop speed: " + getTopSpeed() 
                + " mph" + "\nMax altitude: " + getMaxAltitude() + " ft" + "\nMax range: " + getMaxRange() + " mi" + "\n";

        }

}
