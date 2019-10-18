package jhansipractice;

public class Accessmod implements Interfase {
	 public void jhansi() {
		System.out.println("This is public class");
	}
	public void jhansi1() {
		System.out.println("This is Private class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accessmod A= new Accessmod();
Interfase B =new Accessmod();
B.jhansi();
B.jhansi1();
A.jhansi();
A.jhansi1();

	}
	@Override
	public void priya() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public
	 void Priya1() {
		// TODO Auto-generated method stub
		
	}

}
