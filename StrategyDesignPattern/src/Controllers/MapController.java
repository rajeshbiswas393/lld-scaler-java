package Controllers;
import models.Location;
import models.GoogleMap;
import java.util.*;

import StrategyDesignPattern.enums.pathFindingStrategies;
public class MapController {
	private GoogleMap gMap = new GoogleMap();
	public Location createLocation()
	{
		double latitude;
		double longitude;
		String name,address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Latitude:");
		latitude = sc.nextDouble();
		System.out.println("Please Enter the Longitude:");
		longitude = sc.nextDouble();
		System.out.println("Please Enter location name:");
		name = sc.next();
		System.out.println("Please Enter location address:");
		address = sc.next();
		Location location = new Location(latitude,longitude,name,address);
		return location;
		
	}
	public void nextMapMove()
	{
		System.out.println("Please Enter Source:");
		Location source = this.createLocation();
		gMap.setSource(source);
		System.out.println("Please Destinatio Source:");
		Location destination = this.createLocation();
		gMap.setDestination(destination);
		pathFindingStrategies ps;
		int psi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select path finding strategy 1.Walking 2. Bike 3.Car 4. Train");
		psi = sc.nextInt();
		switch(psi)
		{
		   case 1: ps = pathFindingStrategies.WALKING;  break;
		   case 2: ps = pathFindingStrategies.BIKE;  break;
		   case 3: ps = pathFindingStrategies.CAR;  break;
		   case 4: ps = pathFindingStrategies.TRAIN;  break;
		   default: ps = pathFindingStrategies.WALKING;
		}
		gMap.setfindingStrategy(ps);
		List<Location> path = gMap.findPath();
		this.showPath(path);
	}
	
	public void showPath(List<Location> path)
	{
		for (int i = 0; i < path.size(); i++) {
            System.out.println("Name: "+path.get(i).getName());
            System.out.println("Address: "+path.get(i).getAddress());
            System.out.println("Latitude: "+path.get(i).getLatitude());
            System.out.println("Latitude: "+path.get(i).getLongitude());
         }
	}
	

}
