package InheritanceAndPolymorphism;

/**
 * Created by Michael on 6/18/2016.
 */
public class AnimalList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;

	public void add(Animal a) {
		if (nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
		}
	}
}
