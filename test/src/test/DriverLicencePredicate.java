package test;

import java.util.function.Predicate;

public class DriverLicencePredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t > 18;
	}

}
