package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		
		double winlimit = in.nextDouble();
		for (int totalSimulation = 1; totalSimulation <10; totalSimulation ++)
		{
		    while (startAmount>0 && winlimit> startAmount) {
			if (winChance> Math.random()) {
				startAmount = startAmount+1;
			}
			else {
				startAmount = startAmount-1;
			}
		if (startAmount = 0) {
	         System.out.println("ruin");
	     }
	     else 
	     {
	         System.out.println("success");
	     }
	  }
	}
	}
}
