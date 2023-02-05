package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//Ship is a subclass of Vehicle that implements Floatable
public class Ship extends Vehicle implements Floatable
{

        public String shippingLineOwner;
        public int tonnage;
        
        public Ship()
        {
        	super();
        	shippingLineOwner = "unknown";
        	tonnage = 0;
        }

	//constructor. Super calls from Vehicle.
        public Ship( String name, String manufacturer, String yearOfManufacture, String shippingLineOwner, int maxPassenger, int topSpeed, int tonnage )
        {
                super( name, manufacturer, yearOfManufacture, maxPassenger, topSpeed );
                this.shippingLineOwner = shippingLineOwner;
                this.tonnage = tonnage;
                countOfTheInstances++;	//increases each time the constructor is called
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
        
	//variable to store class name. (Type)
        String ship = this.getClass().getSimpleName();
        
	//returns string to the main method
        @Override
        public String toString()
        {
                return "Type: " + ship + "\nName: " + getName() +  "\nManufacturer: " + getManufacturer() + "\nManufacture year: "
                + getYearOfManufacture() + "\nOwner: " + shippingLineOwner + "\nMax passengers: " + getMaxPassengers() + "\nTop speed: " 
		+ getTopSpeed() + " mph"
                + "\nTonnage: " + getTonnage() + "\n";
        }

}
