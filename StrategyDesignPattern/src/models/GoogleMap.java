package models;

import java.util.List;

import StrategyDesignPattern.enums.pathFindingStrategies;
import Stratigies.*;

public class GoogleMap {
	private pathFindingStrategies findingStrategy;
	private Location source;
	private Location destination;
	public Location getSource()
	{
		return source;
	}
	public void setSource(Location source)
	{
		this.source = source;
	}
	public Location getDestination()
	{
		return destination;
	}
	
	public void setDestination(Location destination)
	{
		this.destination = destination;
	}
	public pathFindingStrategies getfindingStrategy()
	{
		return this.findingStrategy;
	}
	public void setfindingStrategy(pathFindingStrategies findingStrategy)
	{
		this.findingStrategy =  findingStrategy;
	}
	
	public List<Location> findPath()
	{
		FindingStrategies fs;
		if(findingStrategy == pathFindingStrategies.BIKE)
		{
			fs = (FindingStrategies) new BikePathFindingStrategy();
		}
		else if(findingStrategy == pathFindingStrategies.WALKING)
		{
			fs = (FindingStrategies) new WalkingPathFindingStrategy();
		}
		else if(findingStrategy == pathFindingStrategies.CAR)
		{
			fs = (FindingStrategies) new CarPathFindingStrategy();
		}
		else
		{
			fs = (FindingStrategies) new TrainPathFindingStrategy();
		}
		return fs.findPath(this.source,this.destination);
		
	}

}
