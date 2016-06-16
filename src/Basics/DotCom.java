package Basics;
import java.util.ArrayList;

/**
 * Created by micha on 6/15/2016.
 *
 */
public class DotCom {

	private ArrayList<String> locationCells;
	private String name;

	public void setLocationCells(ArrayList<String> loc) {locationCells = loc;}
	public void setName(String name) {this.name = name;}

	public String CheckYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);

		if (index >= 0) {
			locationCells.remove(index);
		}

		if (locationCells.isEmpty()) {
			result = "kill";
			System.out.println("Ouch! You sunk " + name + "  :( ");
		} else {
			result = "hit";
		}

		return result;
	}
}
