package jhansipractice;

public class Ty1 extends Thread{
	public void run() {
	Thread T1 = currentThread();
	System.out.println("2");
		try{
			T1.sleep(1000);
		}
		catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ty1 t=new Ty1();
t.start();
	}

}
