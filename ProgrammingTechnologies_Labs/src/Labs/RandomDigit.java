package Labs;

public class RandomDigit extends Thread
{
	public static int randomget(int d)
	{			
		return (int) (Math.random() * 20);			
	}
}
