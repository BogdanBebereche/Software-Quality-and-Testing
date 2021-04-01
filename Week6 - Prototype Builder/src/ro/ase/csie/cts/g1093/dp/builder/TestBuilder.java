package ro.ase.csie.cts.g1093.dp.builder;

import ro.ase.csie.cts.g1093.dp.builder.SuperHero.SuperHeroBuilder;

public class TestBuilder {

	public static void main(String[] args) {

		// 1.Create the object
//		SuperHero superHero = new SuperHero();
		// 2. Init
//
//		SuperHero superHero2 = new SuperHero("SuperMan", 100,
//				false, false, new Weapon(), null, new Flying(), null);
		
		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 0).build();
		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.isWounded()
				.setRightWeapon(new Weapon())
				.build();
		
	}

}
