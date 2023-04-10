package practice;

public class InstanceOfClass {
	private static int counter = 0;

	InstanceOfClass() {
		counter++;
	}

	public static int getNumOfInstances() {
		return counter;

	}

	public static void main(String[] args) {

		InstanceOfClass i1 = new InstanceOfClass();
		// InstanceOfClass i2 = new InstanceOfClass();
		InstanceOfClass i3 = new InstanceOfClass();

		System.out.println(getNumOfInstances());
	}
}
