package Stratigies;
import java.util.*;
import models.Location;
public class WalkingPathFindingStrategy implements FindingStrategies {
	
	public List<Location> findPath(Location source,Location destination)
	{
		System.out.println("Finding Path by walking path finding strategies");
		List<Location> path  = new ArrayList<Location>();
		path.add(source);
		path.add(destination);
		return path;
	}
}
