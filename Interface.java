package practice;

interface Testing {
	public static final int var = 0;	// ALLOWED

	public abstract void show();	// ALLOWED

	// ALLOWED
	private void display() {
		System.out.print("");
	}

	// ALLOWED AFTER JDK 8
	default void add() {
	}

	// ALLOWED AFTER JDK 9
	public static void func() {
	}
}

public class Interface implements Testing {

	public static void main(String[] args) {

	}

	@Override
	public void show() {

	}

}
