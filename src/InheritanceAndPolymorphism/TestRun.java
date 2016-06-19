package InheritanceAndPolymorphism;

/**
 * Created by michael on 6/15/2016.
 *
 */
public class TestRun {

	public static void Main(String[] args){
		AnimalList list = new AnimalList();

		Dog a = new Dog();
		Cat c = new Cat();

		list.add(a);
		list.add(c);


	}
}
