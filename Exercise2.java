import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Create a HashMap of vehicles

public class Exercise2 {
	
	public static void main(String[] args)
	{
	
	  //Map<keyType,valueType>
		Map<String, String> vehicleList = new HashMap<>();
		
		//Define your car models and makes
		vehicleList.put("Charger", "Dodge");
		vehicleList.put("Cherokee", "Jeep");
		vehicleList.put("Civic", "Honda");
		vehicleList.put("Scion", "Toyota");
		vehicleList.put("CT6", "Cadillac");
		vehicleList.put("Outback", "Subaru");
		
		//Prompt the customer what kind of car they want to see, given what you have available
		Scanner userInput = new Scanner(System.in);
        System.out.println("What kind of car are you looking for?");
        System.out.println("We currently have a Charger, Cherokee, Civic, Scion, CT6, and an Outback.");
        String customerChoice = userInput.nextLine();
        
        //Define the value for customerMake
        String customerMake = vehicleList.get(customerChoice);
        
        //Check to make sure customerChoice equals one of the Models you actually have, and respond
        if(vehicleList.containsKey(customerChoice) == true)
        {
        	System.out.println("Great! We have one " + customerChoice + " over here in the " + customerMake + " section.");
        } else {
        	System.out.println("Sorry, we don't have that car in our current inventory.");
        };
		
	}

}


/*
//Alternative option with a TreeMap, so we can use String.CASE_INSENSITIVE_ORDER

import java.util.TreeMap;

public class Exercise2 {
	
	public static void main(String[] args)
	{
	
	  //Map<keyType,valueType>
		Map<String, String> vehicleList = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		
		//Define your car models and makes
		vehicleList.put("Charger", "Dodge");
		vehicleList.put("Cherokee", "Jeep");
		vehicleList.put("Civic", "Honda");
		vehicleList.put("Scion", "Toyota");
		vehicleList.put("CT6", "Cadillac");
		vehicleList.put("Outback", "Subaru");
		
		//Prompt the customer what kind of car they want to see, given what you have available
		Scanner userInput = new Scanner(System.in);
        System.out.println("What kind of car are you looking for?");
        System.out.println("We currently have a Charger, Cherokee, Civic, Scion, CT6, and an Outback.");
        String customerChoice = userInput.nextLine();
        
        //Define the value for customerMake
        String customerMake = vehicleList.get(customerChoice);
        
        //Check to make sure customerChoice equals one of the Models you actually have
        if(vehicleList.containsKey(customerChoice) == true)
        {
        	//Pull a valueType
        	System.out.println("Great! We have one over here in the " + customerMake + " section.");
        } else {
        	System.out.println("Sorry, we don't have that car in our current inventory.");
        };
	}
}
*/