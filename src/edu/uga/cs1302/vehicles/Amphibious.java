package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//Amphibious is a subclass of Vehicle that implements from Floatable
public class Amphibious extends Vehicle implements Floatable
{

        public int horsepower;
        public String shippingLineOwner;
        public int tonnage;
        
        public Amphibious()
        {
        	super();
        	horsepower = 0;
        	shippingLineOwner = "unknown";
        	tonnage = 0;
        }
	
	//constructor. super calls from Vehicle.
        public Amphibious( String name, String manufacturer, String yearOfManufacture, int horsepower, String shippingLineOwner,
			 int maxPassenger, int topSpeed, int tonnage )
        {
                super( name, manufacturer, yearOfManufacture, maxPassenger, topSpeed );
                this.shippingLineOwner = shippingLineOwner;
                this.horsepower = horsepower;
                this.tonnage = tonnage;
                countOfTheInstances++; //increases every time Amphibious is called
        }

	//getter for horsepower
        public int getHorsepower()
        {
                return horsepower;
        }

	//setter for horsepower
        public void setHorsepower( int horsepower )
        {
                this.horsepower = horsepower;
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
        
	//variable to get class name. (Type)
        String amphibious = this.getClass().getSimpleName();

	//returns string to the main method
        @Override
        public String toString()
        {
                return "Type: " + amphibious + "\nName: " + getName() +  "\nManufacturer: " + getManufacturer() + "\nManufacture year: "
                + getYearOfManufacture() + "\nEngine power: " + horsepower + " hp" + "\nOwner: " + shippingLineOwner +  
		"\nMax passengers: " + getMaxPassengers()
                + "\nTop speed: " + getTopSpeed() + " mph" + "\nTonnage: " + getTonnage() + "\n";

        }

}
