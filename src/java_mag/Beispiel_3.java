package java_mag;

public class Beispiel_3 {

	public interface Foo {
		String bar();
	}

	public static String useFoo(Foo foo) {
		return "*" + foo.bar() + "*";
	}

}