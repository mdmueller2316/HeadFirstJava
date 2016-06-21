package InheritanceAndPolymorphism;

/**
 * Created by Michael on 6/15/2016.
 *
 */
abstract public class Animal {
	String picture;
	String food;
	String hunger;
	String boundaries;
	String location;
	String name;

	public Animal(){

	}

	public Animal(String n) {
		name = n;
	}
	abstract public void MakeNoise();
	abstract public void Eat();



	public void Sleep() {}


	public void Roam() {}





}
