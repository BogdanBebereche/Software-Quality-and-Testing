package ro.ase.csie.cts.g1092.dp.memento;

import java.util.Date;

public class HeroRestorePoint {

	String name;
	int lifePoints;
	private String magic;

	private Date timeStamp;

	public HeroRestorePoint(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timeStamp = new Date();
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public String getMagic() {
		return magic;
	}

}
