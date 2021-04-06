package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.SuperHero;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponsFactory;

public class TestFactoryMethod {

	public static void main(String[] args) {
		SuperHero superman = new SuperHero("Superman");
		boolean kidsMode = true;

		AbstractWeaponsFactory abstractFactory = null;
		if (kidsMode) {
			abstractFactory = new WaterWeaponsFactory();
		}
		AbstractWeapon bazooka = abstractFactory.getWeapon(WeaponType.BAZOOKA, "BOOM");
		superman.setWeapon(bazooka);
		superman.setWeapon(abstractFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
	}

}
