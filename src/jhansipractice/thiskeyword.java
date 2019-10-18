package jhansipractice;

public class thiskeyword {
	int a=2;
	public void jhansi() {
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
	}
	
public static void main(String[] args) {
	thiskeyword t = new thiskeyword();
	t.jhansi();
}
}
