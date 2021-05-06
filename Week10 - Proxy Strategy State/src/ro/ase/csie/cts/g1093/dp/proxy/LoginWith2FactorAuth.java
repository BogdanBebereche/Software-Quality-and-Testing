package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginWith2FactorAuth implements LoginInterface {

	LoginInterface loginModule = null;

	public LoginWith2FactorAuth(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}

	public boolean checkGeneratedCode(int code) {
		if (code == 1245) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean login(String name, String pass) {
		if (this.loginModule.login(name, pass)) {
			System.out.println("Please input the generated code received over SMS/Email");
			System.out.println("Check received code");
			if (checkGeneratedCode(1245)) {
				System.out.println("Hello " + name);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

}
