package jhansipractice;

public class Child extends Parent {
	String Str = "Child class";
	
	public Child()
	{
		super();
	}
	public void jhansi()
	{
		super.jhansi();
		System.out.println(Str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c = new Child();
c.jhansi();


	}

}
