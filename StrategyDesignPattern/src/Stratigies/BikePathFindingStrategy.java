package Stratigies;

import java.util.ArrayList;
import java.util.List;

import models.Location;

public class BikePathFindingStrategy implements FindingStrategies {
	
	public List<Location> findPath(Location source,Location destination)
	{
		System.out.println("Finding Path by Bike path finding strategies");
		List<Location> path  = new ArrayList<Location>();
		path.add(source);
		path.add(destination);
		return path;
	}

}
