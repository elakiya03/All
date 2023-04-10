//implements list interface
package collection.list;

public class Arraylist {

	String name;

	Arraylist(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {

//		ArrayList<String> l = new ArrayList<>();
//
//		l.add("Ram");
//		l.add("Virat");
//
//		for (String string : l) {
//			System.out.println(string);
//		}

		new Arraylist("Elaksssssss").display();

	}

}
