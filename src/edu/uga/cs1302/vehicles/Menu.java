package edu.uga.cs1302.vehicles;
import java.util.Scanner;

//variablea declared public so other classes have access to them
//main class
public class Menu
{

	public static void main(String[] args)
	{

		//Vehicle array. 3 of each type
		Vehicle[] vehicles = new Vehicle[ 15 ];

		vehicles[0] = new Automobile( "Mercedes GLE 350 ", "Mercedes-Benz ", "2018 ", 5, 160, "600" );
		vehicles[1] = new Automobile( "Mercedes AMG GT R", "Mercedes-Benz", "2017", 2, 260, "800" );
		vehicles[2] = new Automobile( "Mercedes G Wagon", "Mercedes-Benz", "2021", 4, 130, "500" );
		vehicles[3] = new Airplane( "Wingman", "Delta", "2020", 200, 200, 2, 50000, 8000 );
		vehicles[4] = new Airplane( "Wingwoman", "Delta", "2016", 300, 80, 4, 60000, 10000 );
		vehicles[5] = new Airplane( "Wingchild", "Delta", "2005", 400, 70, 8, 40000, 60000 );
		vehicles[6] = new Ship( "Merman", "Hyundai", "2000", "Hoki", 200, 60, 100000 );
		vehicles[7] = new Ship( "Mermaid", "Hyundai", "2016", "Hoki", 500, 100, 145677 );
		vehicles[8] = new Ship( "Merbutler", "Hyundai", "2018", "Hoki", 700, 120, 223454 );
		vehicles[9] = new Amphibious( "Frogger", "Danki", "2014", 800, "Kamini", 4, 130, 123456 );
		vehicles[10] = new Amphibious( "Alligator", "Doki", "2006", 788, "Yugi", 4, 90, 678900 );
		vehicles[11] = new Amphibious( "Snaker", "Doki", "2013", 878, "Harry", 2, 160, 456789 );
		vehicles[12] = new Seaplane( "Dragon", "Hodi", "2004", 4, "Sunny", 2, 120, 345678, 33000,70000 );
		vehicles[13] = new Seaplane( "Spider", "Holi", "2015", 5, "Hardik", 4, 140, 456678, 66000, 30000 );
		vehicles[14] = new Seaplane( "Starfish", "Hodi", "2018", 8, "Yugi", 2, 170, 666666, 55555, 77777 );

		int noVehicles = 15;
		int i;
		
		//take user input
		Scanner keyboard = new Scanner(System.in);

		//loops until value is false
		boolean loop = true;

		//loop for the user to insert commands back to back
		while (loop)
		{

			System.out.println("Please enter a command.");
			System.out.println("Press 1, 2, 3, 4, 5, 6, h, or q");

			//user input
			String command  = keyboard.nextLine();

			//ignores blank spaces
			command = command.trim();

			//calls the variable from Vehicle class to display the number of vehicles
			if (command.equalsIgnoreCase("1"))
			{
				System.out.println(Vehicle.countOfTheInstances);
			}

			//shows the name and type of each vehicle
			else if (command.equalsIgnoreCase("2"))
			{
				for(i = 0; i < noVehicles; i++)
				{
					System.out.println(vehicles[i].getClass().getSimpleName() + ": " + vehicles[i].getName());
				}
			}

			//shows vehicles that can fly so instanceof Airplane and Seaplane
			else if (command.equalsIgnoreCase("3"))
			{
				for(i = 0; i < noVehicles; i++)
				{
					if(vehicles[i] instanceof Airplane)
					{
						System.out.println("Type: " + vehicles[i].getClass().getSimpleName());
						System.out.println("Name: " + vehicles[i].getName() + "\n");
					}
				}
				
				for(i = 0; i < noVehicles; i++)
				{
					if(vehicles[i] instanceof Seaplane)
					{
						System.out.println("Type: " + vehicles[i].getClass().getSimpleName());
						System.out.println("Name: " + vehicles[i].getName() + "\n");
					}
				}
			}

			//shows vehicles that can float so instanceof Ship, Amphibious, and Seaplane
			else if (command.equalsIgnoreCase("4"))
			{
				for(i = 0; i < noVehicles; i++)
				{
					if(vehicles[i] instanceof Ship)
					{
						System.out.println("Type: " + vehicles[i].getClass().getSimpleName());
						System.out.println("Name: " + vehicles[i].getName() + "\n");
					}
				}
				
				for(i = 0; i < noVehicles; i++)
				{
					if(vehicles[i] instanceof Amphibious)
					{
						System.out.println("Type: " + vehicles[i].getClass().getSimpleName());
						System.out.println("Name: " + vehicles[i].getName() + "\n");
					}
				}
				
				for(i = 0; i < noVehicles; i++)
				{
					if(vehicles[i] instanceof Seaplane)
					{
						System.out.println("Type: " + vehicles[i].getClass().getSimpleName());
						System.out.println("Name: " + vehicles[i].getName() + "\n");
					}
				}
			}

			//shows vehicle that can float and fly so instanceof Seaplane
			else if (command.equalsIgnoreCase("5"))
			{
				for(i = 0; i < noVehicles; i++)
				{
					if(vehicles[i] instanceof Seaplane)
					{
						System.out.println("Type: " + vehicles[i].getClass().getSimpleName());
						System.out.println("Name: " + vehicles[i].getName() + "\n");
					}
				}
			}

			//shows description of all the vehicles
			else if (command.equalsIgnoreCase("6"))
			{
				for(i=0; i<noVehicles; i++)
					System.out.println( vehicles[i].toString() );
			}

			//shows all the possible commands and their functions
			else if (command.equalsIgnoreCase("h"))
			{
				System.out.println("Press 1 to see how many vehicles are in the system.");
				System.out.println("Press 2 to see the name and the class of each vehicle.");
				System.out.println("Press 3 to see which vehicles can fly.");
				System.out.println("Press 4 to see which vehicles can float.");
				System.out.println("Press 5 to see which vehicles can float AND fly.");
				System.out.println("Press 6 to see a description of each vehicle.");
				System.out.println("Press h to see brief help information for your system.");
				System.out.println("Press q to terminate the program.");
			}

			//the loop ends and the program is terminated.
			else if (command.equalsIgnoreCase("q"))
			{
				System.out.println("The program is terminated");
				loop = false;
				System.exit(0);
			}

			//handles invalid commands.
			else
			{
				System.out.println("Invalid command.");
				System.out.println("Please enter numbers 1-6 or the letters 'h' or 'q'");
			}

		}

		keyboard.close();

	}

}
