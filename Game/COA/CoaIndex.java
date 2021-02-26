/* Some important notes beforehand for running this:
1. Make sure to compile the file with javac fileName.java
2. After complying, run the file with java fileName (without including the .java suffix)
*/

/* Some further disclaimers:
This is file will be just a trial of a bigger idea, that just came up to my mind.
This is an adaptation of the statistics of objects for Curse of Aros (a game that I play), but in class's version. As the project progresses,
the file will be converted as a Database (SQL)
*/

import java.lang.Math;
import java.util.*;
class Index {
	static class Equipment{
		// int[] weapons = {};
		
		static class Weapons {
			HashMap weapons = new HashMap<String, List<String>>();
			static class WeakWoodenSword {
				String weaponName = "Weak Wooden Sword";
				int level = 1;
				int accuracy = 1;
				int strength = 1;
				int defence = 0;
				int hp = 0;
				int cost = 30;
				String[] statistics = {"level:" + level, "accuracy:" + accuracy, "strength:" + strength, "defence:" + defence, "hp:" + hp, "cost:" + cost};
			}
			static class 
		}

		// static class Shields {

		// }
	}
}

public class CoaIndex {
	public static void main(String[] args) {
		Index.Equipment.Weapons.WeakWoodenSword mySword = new Index.Equipment.Weapons.WeakWoodenSword();
		System.out.println(mySword.weaponName + ":" + Arrays.toString(mySword.statistics));
	}
}	
	
