package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//interface class that is implemented in class Airplane, and Seaplane
public interface Flyable
{

	public int getMaxAltitude();
	public void setMaxAltitude(int maxAltitude);
	public int getMaxRange();
	public void setMaxRange(int maxRange);

}
