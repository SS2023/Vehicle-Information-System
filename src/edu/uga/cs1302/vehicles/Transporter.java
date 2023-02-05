package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//interface class which is implemented in Vehicle. Thus, all the subclasses of Vehicle
public interface Transporter
{

	public int getMaxPassengers();
	public void setMaxPassengers(int maxPassengers);
	public int getTopSpeed();
	public void setTopSpeed(int topSpeed);

}
