package hw5JavaMethods;

public class MyFamily {
	public int child1Age = 20; // public
	protected int child2Age = 24; // protected
	int child3Age = 25; // default
	public int child4Age = 27; // public

	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of my children's age is: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		MyFamily family = new MyFamily();
		 family.myFamily();
		
	}
}