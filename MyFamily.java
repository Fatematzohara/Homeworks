package hw6JavaWrapperAndCasting;

public class MyFamily {
	public float child1Age = 20.00f; // public
	protected int child2Age = 24; // protected
	double child3Age = 25.40;
	public int child4Age = 27; // public

	public int myFamily() {

		int sum = (int) (child1Age + child2Age + child3Age + child4Age);// converting to integer
		System.out.println("The sum of my childrens age is: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		MyFamily family = new MyFamily();
		family.myFamily();

	}
}