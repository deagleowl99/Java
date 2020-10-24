package Labs;

public class Person 
{
	public int a;
    public int lives; 
    String name; 
    public Person(String name) 
    {
        this.name = name;
        this.lives = 100;
    } 
    public static void loseLives(Person p)
    {
    	p.lives -= 10;
    }
}
