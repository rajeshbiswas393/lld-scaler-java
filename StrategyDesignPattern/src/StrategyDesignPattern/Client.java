package StrategyDesignPattern;
import java.util.Scanner;

import Controllers.MapController;
public class Client {
	
	public static void main(String args[])
	{
		MapController mp = new MapController();
		boolean nextStep = true;
		while(nextStep)
		{
			mp.nextMapMove();
			int flag;
			Scanner sc = new Scanner(System.in);
			System.out.print("Do you want to continue ? 1. Yes / 2. No");
			flag = sc.nextInt();
			if(flag == 2)
				nextStep = false;
		}
	}

}
