package jhansipractice;

class Thre extends Thread{
	public void run() {
		Thread y=currentThread();
		System.out.println("jhansi");
		//System.out.println(y.isAlive());
		try {
			//y.join();
		y.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
class Thre3 extends Thread{
	public void run() {
		System.out.println("Priya");
	}

}
/*class Thre2 implements Runnable{
	public void run() {
		System.out.println("jhansi priya"); //interface
	}

}*/
public class Thre1{
	public static void main(String args[]) {
		Thre t1=new Thre();
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("Karanki");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		t1.setPriority(7);
		System.out.println(t1.getPriority());
		
		
		Thre3 t3=new Thre3();
		/*Thre2 t2=new Thre2();*/
		/*Thread t3=new Thread();*/
		t1.start();
		t3.start();
		
	}
	
}
