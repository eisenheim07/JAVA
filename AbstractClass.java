/*ABSTRACTION EXAMPLE.*/

package javac;

abstract class Abstraction {

	int abstractVar;
	abstract void start();

}

class First extends Abstraction {

	@Override
	void start() {
		System.out.println("FIRST");
	}
	
}

class Second extends Abstraction {

	@Override
	void start() {
		System.out.println("SECOND");
	}

}

public class AbstractClass {

	public static void main(String[] args) {
		Abstraction obj;	/* REFERENCE VARIABLE */
		
		obj = new First();
		obj.abstractVar = 10;
		obj.start();
		System.out.println(obj.abstractVar);

		obj = new Second();
		obj.abstractVar = 20;
		obj.start();
		System.out.println(obj.abstractVar);
	}

}
