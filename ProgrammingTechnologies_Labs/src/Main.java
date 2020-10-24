import Labs.RandomDigit;
import Labs.Squarix;
import Labs.Cubix;
import java.util.*;
import java.net.*;
import java.io.*;

class Main
{
	public static void main(String[] args) {	
	RandomDigit random = new RandomDigit();
	Squarix sqr = new Squarix();
	Cubix cub = new Cubix();
	random.start();
	sqr.start();
	cub.start();
	int d = 0;
	for (int i = 0; ; i++)
	{
		d = RandomDigit.randomget(d);
		try
		{
			random.sleep(1000);
			if (d % 2 == 0)
				sqr.square(d);
			else
				cub.cube(d);
		}
		catch(InterruptedException e){}
	}
}
	
}





