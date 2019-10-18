package jhansipractice;

public class Constructo {
	public Constructo () {
		System.out.println("This is default Constructor /No arg constructor");
		//no need of calling constructor in main method
	}
	public Constructo (String str) {
		System.out.println("This is Paramaterized constructor");
		//no need of calling constructor in main method
	}
	
	public void jhansi() {
		System.out.println("This is not Contructor");
	}
	
	public static void main(String[] args) {
		//Constructo d = new Constructo();
		Constructo sd = new Constructo("jhnasi");
		//d.jhansi(); // We've class this
	}

}
