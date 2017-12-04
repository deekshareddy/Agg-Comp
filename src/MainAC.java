

class Charger
{
	public String name;
	
	public Charger(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class OS
{
	public String name;

	public OS(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}	
}

class Mobile
{
	OS os = new OS("android");
	
	public void hasA(Charger ch)
	{
		System.out.println(ch.getName());
	}
		
}


public class MainAC
{
	public static void main(String[] args)
	{
		Mobile m = new Mobile();
		Charger ch = new Charger("samsung");
	
		System.out.println(m.os.getName());
		m.hasA(ch);
		
		m=null;
		
		System.out.println(m.os.getName());
		m.hasA(ch);
		System.out.println(ch.getName());
	}

}
