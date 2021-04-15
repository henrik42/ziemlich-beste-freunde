(ns beispiel-6)
(gen-class 
 :name "java_mag.with_clojure_bin.ClojureFoo"
 :implements [java_mag.Beispiel_3$Foo])
(defn -bar [_]
  "Hello, Clojure!")
