package Grade.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonUtil {
	public static String getUserInput() {
		String strKeyln = null;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			strKeyln = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return strKeyln;
	}

	public static double round(double input) {
		String buf = String.format("%.1f", input);

		return Double.parseDouble(buf);
	}

}