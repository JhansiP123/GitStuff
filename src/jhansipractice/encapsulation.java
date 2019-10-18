package jhansipractice;

 class encapsulation {
	private int s;
	public int getdata() {
		return s;
	}
public void setdata(int g) {
		s = g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation e =new encapsulation();
		e.setdata(5);
		System.out.println(e.getdata());
	}

}
