<<<<<<< HEAD
package DesignPattern.ChainOfResponsibility.ex2;

public class HandlerTest {
	public static void main(String[] args) {
		MyHandler h1=new MyHandler("h1");
		MyHandler h2=new MyHandler("h2");
		MyHandler h3=new MyHandler("h3");
		
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		h1.operator();
	}
}
=======
package DesignPattern.ChainOfResponsibility.ex2;

public class HandlerTest {
	public static void main(String[] args) {
		MyHandler h1=new MyHandler("h1");
		MyHandler h2=new MyHandler("h2");
		MyHandler h3=new MyHandler("h3");
		
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		h1.operator();
	}
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
