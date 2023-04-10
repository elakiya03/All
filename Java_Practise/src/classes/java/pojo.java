package classes.java;

class pojoclass {
	private int value = 78;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class pojo {
	public static void main(String args[]) {
		pojoclass p = new pojoclass();
		p.setValue(56);
		System.out.println(p.getValue());
	}

}