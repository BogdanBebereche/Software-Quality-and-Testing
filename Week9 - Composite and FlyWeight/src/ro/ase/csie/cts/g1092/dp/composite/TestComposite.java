package ro.ase.csie.cts.g1092.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		AbstractNode group1 = new Group("red team");
		group1.addNode(new NPCCharacter("Solider1", 100));
		group1.addNode(new NPCCharacter("Solider2", 100));

		AbstractNode group2 = new Group("blue team");
		group2.addNode(new NPCCharacter("Solider2", 100));
		group2.addNode(new NPCCharacter("Demolition team", 100));
		
		AbstractNode levelGroup = new Group("level 2");
		levelGroup.addNode(new NPCCharacter("Level boss", 500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		levelGroup.getNode(0).move();
	}

}
