package ro.ase.csie.cts.g1092.dp.facade;

public class GameAPIFacade {

	public static void createProfileAndConnect() {
		PlayerProfile profile = new PlayerProfile();
		profile.login();
		profile.getUserSettings();

		// 2. check the subscription
		Subscription subscription = new Subscription();
		subscription.checkSubscription();

		// 3. get the main character
		SuperHero superHero = new SuperHero("Superman", new Helmet(), new SuperPower());
	}

}
