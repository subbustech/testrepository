package exceptionsEx;

public class Example1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 40;
		int d = 0;
		int e = 160;
		int f = 320;

		try {
			System.out.println(b/a);  //20/10
		}
		catch(Exception e1) {
			System.out.println("Something wrong");
		}
		finally {
			System.out.println("I always execute");
		}

		try {
			System.out.println(c/b);  //0/20
		}
		catch(Exception e1) {
			System.out.println("Something wrong");
		}
		finally {
			System.out.println("I always execute");
		}
		
		try {
			System.out.println(d/c);  //80/0
		}
		catch(Exception e1) {
			System.out.println("Something wrong");
		}
		finally {
			System.out.println("I always execute");
		}
		
		try {
			System.out.println(e/d);  //160/80
		}
		catch(Exception e1) {
			System.out.println("Something wrong");
		}
		finally {
			System.out.println("I always execute");
		}
		
		try {
			System.out.println(f/e);  //320/160
		}
		catch(Exception e1) {
			System.out.println("Something wrong");
		}
		finally {
			System.out.println("I always execute");
		}
		
	}
}
