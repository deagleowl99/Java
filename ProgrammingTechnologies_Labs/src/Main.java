import java.util.*;
import java.net.*;
import java.io.*;
import Labs.RandomDigit;
import Labs.Squarix;
import Labs.Cubix;
import Labs.UrlContainer;
import Labs.UrlInfo;
import Labs.UrlScanner;
import Labs.SimpleGUI1;
import Labs.SimpleGUI2;
import Labs.SimpleGUI3;
import Labs.SimpleGUI4;

class Main
{
	public static void main(String[] args) throws IOException {
	double[][] immigrants = {{45785090, 19.8, 14.3}, {11048064, 4.8, 7.7}, 
			 {9845244, 4.3, 11.9}, {9060433, 3.9, 31.4}, 
			 {7826981, 3.4, 83.7}, {7824131, 3.4, 12.4},
			 {7439086, 3.2, 11.6}, {7284069, 3.1, 20.7},
			 {6468640, 2.8, 27.7}, {6466605, 2.8, 13.8}};
	String countries[] = {"United States", "Russia", "Germany", "Saudi Arabia", "United Arab Emirates",		
		  "United Kindgom", "France", "Canada", "Australia", "Spain"};
	int totalimmigrants = 0;
	double totalpercentage = 0;
	double maxpopimmigrant = 0;
	double minpopimmigrant = 100;
	int mincountry = 0;
	int maxcountry = 0;
	double totalpopulation = 0;
	for (int i = 0; i < immigrants.length; i++) 
	{
		if (Integer.toString((int)immigrants[i][0]).length() == 8)
		System.out.printf((int)immigrants[i][0] + " " + " " + " "  + " " + " " + " ");
		else
		System.out.printf((int)immigrants[i][0] + " " + " " + " "  + " " + " " + " " + " ");
		System.out.print((immigrants[i][1]) + "\t");
		System.out.print((immigrants[i][2]));
		System.out.println();
	}
	
	for (int i = 0; i < immigrants.length; i++)
	{
		for (int j = 0; j < immigrants[i].length; j++)
			if (j == 0)
				totalimmigrants += immigrants[i][j];
			else if (j == 1)
				totalpercentage += immigrants[i][j];
	}
	
	for (int i = 0; i < immigrants.length; i++)
	{
		for (int j = 2; j < immigrants[i].length; j++)
		{
			if (immigrants[i][j] < minpopimmigrant)
			{
				minpopimmigrant = immigrants[i][j];
				mincountry = i;
			}				
		}
	}
	
	for (int i = 0; i < immigrants.length; i++)
	{
		for (int j = 2; j < immigrants[i].length; j++)
		{
			if (immigrants[i][j] > maxpopimmigrant)
			{
				maxpopimmigrant = immigrants[i][j];
				maxcountry = i;
			}
		}
	}
	
	for (int i = 0; i < immigrants.length; i++)
	{
		totalpopulation += immigrants[i][0] / immigrants[i][2] * 100; 
	}
	System.out.println("Total immigrants: " + totalimmigrants);
	System.out.println("Total percentage of world`s immigrants: " + totalpercentage);
	System.out.println("Country with least immigration: " + countries[mincountry]);
	System.out.println("Country with greatest immigration: " + countries[maxcountry]);
	System.out.println("Total estimated population of all countries: " + (int)totalpopulation);
	System.out.println(" ");
	String s = "";
	Scanner sc = new Scanner(new BufferedReader(new FileReader("C://Users//Миша//Desktop//ТП//Lab2.txt")));		
	int rows = 10;
	int columns = 3;
	double[][] myArray = new double[rows][columns];
	while(sc.hasNextLine()) 
	{
		for (int i=0; i<myArray.length; i++) 
		{
			String[] line = sc.nextLine().trim().split(" ");
			for (int j=0; j<line.length; j++) 
			{
				myArray[i][j] = Double.parseDouble(line[j]);
			}
		}		      
	}
	
	System.out.println(" ");
	ArrayList<Double> array = new ArrayList<Double>();
	ArrayList<Double> array1 = new ArrayList<Double>();
	ArrayList<Integer> indexlist = new ArrayList<Integer>();
	for (int i=0; i < myArray.length; i++)
	{
		array.add(myArray[i][2]);
		array1.add(myArray[i][2]);
	}
	int[] indeces = new int[10];
	Collections.sort(array, Collections.reverseOrder());
	for(Object person : array)
	{
		indexlist.add(array1.indexOf(person));
	}
	System.out.printf("%-25s%-20s%-15s%-15s%n", "Country", "Immigrants", 
	 "% world total", "% population");
	for (Object person : indexlist)
	{
		System.out.printf("%-25s%-20s%-15s%-15s%n", countries[(int)person], (int)myArray[(int)person][0], 
				myArray[(int)person][1], myArray[(int)person][2]);
	}
	System.out.println(s);	
	
	if (args.length != 3)
	{
		System.out.println("usage: LR3 <URL> <depth> <threads count>");
		return;
	}
	
	UrlContainer urlContainer = new UrlContainer(args[0]);
	int maxDepth = Integer.parseInt(args[1]);
	int threadCount = Integer.parseInt(args[2]);
	
	ArrayList<UrlScanner> scanners = new ArrayList<>(threadCount);
	for (int i = 0; i < threadCount; i++)
	{
		UrlScanner scanner = new UrlScanner(urlContainer, maxDepth);
		scanner.setDaemon(true);
		scanner.start();
		scanners.add(scanner);
	}
	
	boolean processing = true;
	while (processing == true)
	{
		Thread.yield();
		processing = false;
		for (UrlScanner scanner : scanners)
		{
			if (scanner.getState() != Thread.State.WAITING)
			{
				processing = true;
				break;
			}
		}
	}
	
	Hashtable<String, UrlInfo> visitedUrl = urlContainer.getVisitedUrl();
	Enumeration<UrlInfo> val = visitedUrl.elements();
	while (val.hasMoreElements())
	{
		UrlInfo urlInfo = val.nextElement();
		System.out.println(urlInfo.getUrl());
	}
	System.out.println("Всего просмотрено url: " + Integer.toString(visitedUrl.size()));
	
	SimpleGUI1 app1 = new SimpleGUI1();
	app1.setVisible(true);
	SimpleGUI2 app2 = new SimpleGUI2();
	app2.setVisible(true);
	SimpleGUI3 app3 = new SimpleGUI3();
	app3.setVisible(true);
	SimpleGUI4 app4 = new SimpleGUI4();
	app4.setVisible(true);

	
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





