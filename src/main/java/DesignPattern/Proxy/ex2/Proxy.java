<<<<<<< HEAD
package DesignPattern.Proxy.ex2;

public class Proxy implements Sourceable{
	Source source;
	
	public Proxy(Source source) {
		this.source = source;
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void before() {
		System.out.println("before proxy");
	}
	private void after(){
		System.out.println("after proxy");
	}

}
=======
package DesignPattern.Proxy.ex2;

public class Proxy implements Sourceable{
	Source source;
	
	public Proxy(Source source) {
		this.source = source;
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void before() {
		System.out.println("before proxy");
	}
	private void after(){
		System.out.println("after proxy");
	}

}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
