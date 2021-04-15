package java_mag;

public class Beispiel_2 {
	public final static String HELLO = "Hello, ";
	String text;

	public Beispiel_2(String text) {
		this.text = text;
	}

	public String foo(String arg) {
		return text + arg;
	}
}