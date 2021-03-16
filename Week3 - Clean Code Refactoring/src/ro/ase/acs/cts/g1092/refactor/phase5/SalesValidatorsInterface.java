package ro.ase.acs.cts.g1092.refactor.phase5;

import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidValueException;
import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;

public interface SalesValidatorsInterface {
	public abstract void validatePrice(float initialPrice) throws InvalidPriceException;
	public abstract void validateYearsSinceRegistration(int accountAge)
			throws InvalidYearsSinceRegistrationException;

}
