package ro.ase.csie.cts.g1092.dp.simplefactory;

public class Pistol extends AbstractWeapon {

	@Override
	public void pewPew() {
		System.out.println("Pew pew -> -> ->");
		
	}

	public Pistol(String description, int power) {
		super();
		this.description = description;
		this.powerLevel = power;
	}

}
