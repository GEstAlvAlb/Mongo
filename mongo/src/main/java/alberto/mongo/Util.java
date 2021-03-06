package alberto.mongo;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Util {

	public static String formatMoneda(float cantidad) {
		DecimalFormat df = new DecimalFormat("####.00 €");
		return df.format(cantidad);
	}

	public static float parseMoneda(String cantidad) throws ParseException {
		DecimalFormat df = new DecimalFormat("####.00 €");
		return df.parse(cantidad).floatValue();
	}
}
