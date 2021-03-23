package ro.ase.csie.cts.lab5.dp.singleton.enumeration;


//implement the singleton as an enum
public enum DbConnection {
	//use instance for enum
    INSTANCE("10.0.0.1:3306", "localDb");
    String socket;
    String schema;
    
    DbConnection(String socket, String schema) {
        this.socket = socket;
        this.schema = schema;
    }

    
    public static DbConnection getInstance() {
    	//just return the instance made earlier
        return INSTANCE;
    }
}
