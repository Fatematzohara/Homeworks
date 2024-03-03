package hw5JavaMethods;

public class FullName {

	public String fullName(String fName, String lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return "fullName";
	}

	public static void main(String[] args) {

		FullName member = new FullName();

		// I can call the method multiple times with different arguments
		member.fullName("Fatematuz", "Zohara");
		member.fullName("Silia", "khan");
		member.fullName("Raihan", "Khan");
		member.fullName("Sunny", "khan");

	}
}