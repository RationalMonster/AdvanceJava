<<<<<<< HEAD
package DesignPattern.Decorator.ex1;


public class DecoratorTestA {
	//Action a = new Person();
			//Action a = new ListenDecorator(new Person());
			//Action a = new RelaxDecorator(new Person());
			//Action a = new RelaxDecorator(new ListenDecorator(new Person()));
			Action a = new ListenDecorator(new RelaxDecorator(new Person()));
//			a.go();
}
=======
package DesignPattern.Decorator.ex1;


public class DecoratorTestA {
	//Action a = new Person();
			//Action a = new ListenDecorator(new Person());
			//Action a = new RelaxDecorator(new Person());
			//Action a = new RelaxDecorator(new ListenDecorator(new Person()));
			Action a = new ListenDecorator(new RelaxDecorator(new Person()));
//			a.go();
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
