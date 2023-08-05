package Stratigies;

import java.util.ArrayList;
import java.util.List;
import models.Location;

public class CarPathFindingStrategy implements FindingStrategies {
	
	public List<Location> findPath(Location source,Location destination)
	{
		System.out.println("Finding Path by Car path finding strategies");
		List<Location> path  = new ArrayList<Location>();
		path.add(source);
		path.add(destination);
		return path;
	}

}
