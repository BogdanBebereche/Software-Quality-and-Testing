package ro.ase.acs.cts.g1092.refactor.phase3;

import ro.ase.acs.cts.g1092.refactor.exceptions.InvalidValueException;

public class SalesStrategy {
	
	public static final int FIDELITY_YEARS_THRESHOLD = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	public static final float NORMAL_DISCOUNT = 0.1f;
	
	public static float getFidelityDiscount(int yearsSinceRegistration) {
		return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD)
	    		? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 
	}
	
	public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount) {
		return 0;
		//to complete
		
	}	
	public float computeFinalPrice(ProductType productType,
			float initialPrice, int yearsSinceRegistration) throws InvalidValueException
		{
		
		if(initialPrice <= 0 || yearsSinceRegistration < 0) {
			throw new InvalidValueException();
		}

		
	    float finalPrice = 0;
	    float fidelityDiscount = getFidelityDiscount(yearsSinceRegistration);
	    
	    switch(productType) {
	    case NEW:
	    	finalPrice = initialPrice;
	    	break;
	    case DISCOUNTED:
	    	finalPrice =
	    	(initialPrice - (ProductType.DISCOUNTED.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.DISCOUNTED.getDiscount() * initialPrice));
	    	break;
	    case LIMITED_STOCK:
	    	finalPrice =
	    	(initialPrice - (ProductType.LIMITED_STOCK.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LIMITED_STOCK.getDiscount() * initialPrice));
	    	break;
	    case LEGACY:
		    finalPrice =
		    (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice));
		    break;
		default:
			throw new UnsupportedOperationException("Type not managed");
	    }
	    
	    return finalPrice;
	  }
}