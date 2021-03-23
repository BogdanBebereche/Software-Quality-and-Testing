package ro.ase.csie.cts.lab5.dp.singleton.enumeration;

public class TestEnum {

	public static void main(String[] args) {

        DbConnection conn1 = DbConnection.getInstance();
        DbConnection conn2 = DbConnection.getInstance();

        if (conn1 == conn2) {
            System.out.println("They are the same");
        }
	}

}
