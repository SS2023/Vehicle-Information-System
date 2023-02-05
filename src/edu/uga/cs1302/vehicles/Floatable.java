package edu.uga.cs1302.vehicles;

//variablea declared public so other classes have access to them
//interface that is implemented in Ship, Amphibious, and Seaplane
public interface Floatable
{

	public int getTonnage();
	public void setTonnage(int tonnage);

}
