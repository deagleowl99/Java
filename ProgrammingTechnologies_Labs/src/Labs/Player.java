package Labs;

public class Player extends Person
{
	String name;
    public Player(String name) 
    {
    	super(name);
        this.name = name;
    }

    public static void checkRandom(int a1, Enemy e, Player p)
    {
    	if (e.a == a1)
    	{
    		p.loseLives(p);
    		System.out.println("���� ����� � ���! � " + p.name + " �������� " + p.lives + " ������");
    	}
    	else
    		System.out.println("���� �� ������ �����");
    }

}
