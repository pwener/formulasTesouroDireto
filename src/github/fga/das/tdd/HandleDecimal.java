package github.fga.das.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HandleDecimal {
	public static double truncate(double number, int decimalPlaces) {
		return BigDecimal.valueOf(number).setScale(decimalPlaces, RoundingMode.FLOOR).doubleValue();
	}
	
	public static double round(double number, int decimalPlaces) {
		return BigDecimal.valueOf(number).setScale(decimalPlaces, RoundingMode.HALF_UP).doubleValue();
	}
}
