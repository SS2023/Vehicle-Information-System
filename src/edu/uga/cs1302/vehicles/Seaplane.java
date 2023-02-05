package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//Seaplane is a subclass of Vehicle that implements from Flyable and Floatable
public class Seaplane extends Vehicle implements Flyable, Floatable
{


        public String shippingLineOwner;
        public int numberOfEngines;
        public int tonnage;
        public int maxAltitude;
        public int maxRange;
        
        public Seaplane()
        {
        	super();
        	shippingLineOwner = "unknown";
        	numberOfEngines = 0;
        	tonnage = 0;
        	maxAltitude = 0;
        	maxRange = 0;
        }
 
	//contructor. super method calls from Vehicle       
        public Seaplane( String name, String manufacturer, String yearOfManufacture, int numberOfEngines, String shippingLineOwner, 
			int maxPassenger, int topSpeed, int maxAltitude, int maxRange, int tonnage )
        {
                super( name, manufacturer, yearOfManufacture, maxPassenger, topSpeed );
                this.numberOfEngines = numberOfEngines;
                this.shippingLineOwner = shippingLineOwner;
                this.tonnage = tonnage;
                this.maxAltitude = maxAltitude;
                this.maxRange = maxRange;
                countOfTheInstances++;	//increases each time constructor is called
        }

	//getter for shipping line owner
        public String getShippingLineOwner()
        {
                return shippingLineOwner;
        }

	//setter for shipping line owner
        public void setShippingLineOwner( String shippingLineOwner )
        {
                this.shippingLineOwner = shippingLineOwner;
        }

	//getter for number of engines
        public int getNumberOfEngines()
        {
                return numberOfEngines;
        }

	//setter for number of engines
        public void setNumberOfEngines( int numberOfEngines )
        {
                this.numberOfEngines = numberOfEngines;
        }
        
	//getter for tonnage
        public int getTonnage()
        {
                return tonnage;
        }

	//setter for tonnage
        public void setTonnage( int tonnage )
        {
                this.tonnage = tonnage;
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
        String seaplane = this.getClass().getSimpleName();

	//returns string to the main method
        @Override
        public String toString()
        {
                return "Type: " + seaplane + "\nName: " + getName() +  "\nManufacturer: " + getManufacturer() + "\nManufacture year: "
                + getYearOfManufacture() + "\nNumber of engines: " + numberOfEngines + "\nOwner: " + getShippingLineOwner() + "\nMax passengers: " +
                getMaxPassengers() + "\nTop speed: " + getTopSpeed() + " mph" + "\nTonnage: " + getTonnage() + "\nMax altitude: " + getMaxAltitude() 
		+ " ft" +
                "\nMax range: " + getMaxRange() + " mi" + "\n";
        }

}
