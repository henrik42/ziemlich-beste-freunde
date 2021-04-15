(ns beispiel-9
  (:import [org.springframework.boot.autoconfigure SpringBootApplication]
           [org.springframework.web.bind.annotation 
            RestController RequestMapping GetMapping PathVariable]))

(gen-class
 :name ^{SpringBootApplication []
         RestController ""
         RequestMapping ["/data"]} 
 beispiel_9.App
 :methods [[^{GetMapping ["/{id}"]} readData [^{PathVariable "id"} String] String]])

(defn -readData [_ id] 
  (format "Hello, %s" id))

(defn run []
  (org.springframework.boot.SpringApplication/run 
    beispiel_9.App (into-array String [])))
