package ro.ase.csie.cts.g1092.dp.FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {

	public static void main(String[] args) {

		List<NPCCoordinates> soliders = new ArrayList<>();
		soliders.add(new NPCCoordinates(10, 10, 10, "red"));
		soliders.add(new NPCCoordinates(50, 10, 10, "Green"));
		soliders.add(new NPCCoordinates(100, 10, 10, "Yellow"));

		Model3DFlyweightInterface soliderModel =
				Model3DFactory.getModel(ModelType.SOLIDER);
		for (NPCCoordinates solider : soliders)
			soliderModel.display(solider);

	}

}
