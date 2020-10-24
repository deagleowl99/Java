package Labs;

public class Enemy extends Person
{
	String name;
    public Enemy(String name) 
    {
        super(name);
        this.name = name;
    }

    public static void checkRandom(int a1, Player p, Enemy e)
    {
    	if (e.a == a1)
    	{
    		e.loseLives(e);
    		System.out.println("Вы угадали, теперь у врага с именем " + e.name + " осталось " + e.lives + " жизней");
    	}
    	else if (e.a > a1)
    		System.out.println("Вы не угадали! Число, что вы пытаетесь угадать больше");
    	else if (e.a < a1)
    		System.out.println("Вы не угадали! Число, что вы пытаетесь угадать меньше");
    }
}
