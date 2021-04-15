package java_mag;

import java.util.Arrays;

public class Beispiel_5 {

	public interface Tier {
	}

	public static class Hund implements Tier {
	}

	public static class Katze implements Tier {
	}

	public static String istEin(Tier h) {
		return "Tier";
	}

	public static String istEin(Hund h) {
		return "Hund";
	}

	public static String istEin(Katze k) {
		return "Katze";
	}

	public static void main(String[] args) {
		System.out.println(istEin(new Hund()));
		System.out.println(istEin(new Katze()));
		for (Tier x : Arrays.asList(new Hund(), new Katze()))
			System.out.println(istEin(x));
	}
}
