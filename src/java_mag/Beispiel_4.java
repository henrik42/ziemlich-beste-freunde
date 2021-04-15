package java_mag;

public class Beispiel_4 {

	public final String text;

	protected Beispiel_4(String text) {
		this.text = text;
	}

	public String toString() {
		return "JAVA-toString():" + text;
	}

	public String foo(String s) {
		return "JAVA-foo(String):" + text + ":" + s;
	}

	public String foo(int i) {
		return "JAVA-foo(Integer):" + text + ":" + i;
	}

	public String foo(String s, boolean b) {
		return "JAVA-foo(String, boolean):" + text + ":" + s + "/" + b;
	}

}