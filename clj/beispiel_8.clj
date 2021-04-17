(ns beispiel-8
  (import [javax.xml.bind.annotation 
           XmlRootElement XmlAccessorType XmlAccessType]))

(gen-class
 :name ^{XmlRootElement []
         XmlAccessorType XmlAccessType/PROPERTY} 
 beispiel_8.beispiel_8
 :init init
 :state state
 :constructors {[String int] [] 
                [] []}
 :methods [[getFoo [] String]
           [getBar [] int]
           [setFoo [String] void]
           [setBar [int] void]])

(defn -getFoo [x] (-> x .state deref :foo))
(defn -getBar [x] (-> x .state deref :bar))

(defn -setFoo [x foo] (-> x .state (swap! assoc :foo foo)))
(defn -setBar [x bar] (-> x .state (swap! assoc :bar bar)))

(defn -init [&[foo bar]]
  [[] (atom {:foo foo :bar bar})])

(defn -toString [s]
  (let [{:keys [foo bar]} (-> s .state deref)]
    (format "beispiel-8 [foo=%s, bar=%s]" foo bar)))
