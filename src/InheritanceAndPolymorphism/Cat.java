package InheritanceAndPolymorphism;

/**
 * Created by Michael on 6/15/2016.
 *
 */
public class Cat extends Feline implements Pet {

	public Cat(String n) {
		super(n);
	}

	public void MakeNoise() {}



	public void Eat() {}

	public void BeFriendly(){}

	public void Play() {}
}
