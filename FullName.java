package hw6JavaWrapperAndCasting;

public class FullName {

	public String fullName(int fName, int lName) {
		String convertedName = (String.valueOf(fName) + String.valueOf(lName));// converted
		System.out.println("Family Member: " + fName + " " + lName);
		return convertedName;
	}

	public int salary(String januarySalary, double februarySalary) {
		System.out.println("Average Salary: " + (Integer.parseInt(januarySalary) + (int) (februarySalary)) / 2);// converted

		return 0;

	}

	public static void main(String[] args) {

		FullName member = new FullName();

		// I can call the method multiple times with different arguments
		member.fullName(120, 23);
		member.fullName(13, 24);
		member.salary("123", 1.33);
		member.salary("10", 20.33);

	}

}