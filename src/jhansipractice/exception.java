package jhansipractice;

public class exception {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=0,c=0;
		try{
			c=a/b;
		
		System.out.println(c);
		}
		catch(ArithmeticException el)
		{
			System.out.println("this is Arthimatic catch block");
		}
		catch(Exception e){
			System.out.println("this is catch block");
		}
		
		finally{
			System.out.println("Execute always");
			
		}
	}

}
