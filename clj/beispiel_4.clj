(import java_mag.Beispiel_4)
(defn make-bsp-4 [p]
  (proxy [Beispiel_4] [(.toUpperCase p)]
    (toString [] 
      (format "CLJ-toString[]: '%s'\n  super.toString(): '%s'" 
              p
              (proxy-super toString)))
    (foo 
      ([x] (format "CLJ-foo[x]: %s:'%s'\n  super.foo: '%s'" 
                   (condp apply [x]
                     string? "STRING"
                     integer? "INTEGER") 
                   x
                   (proxy-super foo x)))
      ([s b] (format "CLJ-foo[s b]: '%s' '%s'\n  super.text: '%s'  this: '%s'" 
                     s b (proxy-super text) this)))))
(let [x (make-bsp-4 "foobar")]
  (println (str x))
  (println (.foo x "zweiundvierzig"))
  (println (.foo x 42))
  (println (.foo x "bar" true)))
