package ro.ase.csie.cts.g1092.dp.command;

public class TestCommand {

	public static void main(String[] args) {

		TaskManager manager = new TaskManager();

		manager.addAsyncTask(new AsyncCommand("Auto save", new BackupModule()));
		manager.addAsyncTask(new AsyncCommand("Update 3D modules", new UpdateModule()));

		System.out.println("Game is running");

		manager.execute();
		manager.execute();
		manager.execute();

		System.out.println("Game is running");

	}

}
