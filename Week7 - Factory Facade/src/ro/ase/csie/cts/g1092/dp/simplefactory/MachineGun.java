package ro.ase.csie.cts.g1092.dp.simplefactory;

public class MachineGun extends AbstractWeapon {

	int noBullents;

	public MachineGun(String description, int power, int ammo) {
		this.description = description;
		this.powerLevel = power;
		this.noBullents = ammo;
	}

	@Override
	public void pewPew() {
		System.out.println("tac tac ----------->");
	}

}
