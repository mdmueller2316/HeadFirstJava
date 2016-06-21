package InheritanceAndPolymorphism;

/**
 * Created by michael on 6/15/2016.
 *
 */
public class TestRun {


	public static void Main(String[] args){
		AnimalList list = new AnimalList();
		TestRun t = new TestRun();

		t.go();

		Dog a = new Dog();
		Cat c = new Cat();

		list.add(a);
		list.add(c);
	}

	public void go() {
		Integer i = 341435465;
		String t = String.format("%,.2f d", i);

		System.out.println(t);
	}
}
