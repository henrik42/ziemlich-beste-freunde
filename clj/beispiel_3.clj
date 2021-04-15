(import (java_mag Beispiel_3 Beispiel_3$Foo))
(defn make-foo [x] 
  (reify Beispiel_3$Foo
    (bar [_] x)))

