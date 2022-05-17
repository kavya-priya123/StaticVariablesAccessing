package ai.jobiak.statics;

public class Static {
	 
	static int a = 12;
	static void display() {
		System.out.println("static method");
	}
    static {
    	System.out.println("static block");
    }

	public static void main(String args[]) {
		
		System.out.println(a);
	    display();
	}
}

