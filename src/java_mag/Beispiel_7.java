package java_mag;

import java.util.Arrays;

import clojure.java.api.Clojure;

public class Beispiel_7 {

	public static void main(String[] args) {
		for (String x : (Iterable<String>) Clojure.var("clojure.core/sort").invoke(Arrays.asList("Foo", "Bar", "Fred")))
			System.out.println(x);

		Clojure.var("clojure.core/load-string").invoke("(require 'beispiel-7)");
		System.out.println(Clojure.var("beispiel-7/my-fun").invoke("Clojure"));
	}
}