(import (java_mag Beispiel_5 Beispiel_5$Hund Beispiel_5$Katze))
(println (Beispiel_5/istEin (Beispiel_5$Hund.)))
(println (Beispiel_5/istEin (Beispiel_5$Katze.)))
(doseq [x [(Beispiel_5$Hund.) (Beispiel_5$Katze.)]]
  (println (Beispiel_5/istEin x)))

