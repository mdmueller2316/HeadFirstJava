package InheritanceAndPolymorphism;

/**
 * Created by Michael on 6/15/2016.
 *
 */
public class Dog extends Canine implements Pet {

	 public Dog() {
		 this("Jake");
	 }

	public Dog(String n) {
		super(n);
	}




	public void MakeNoise() {}

	public void Eat() {}

	public void BeFriendly() {}

	public void Play() {}


}
