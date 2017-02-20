(ns clojure-language-server.core
    )

(enable-console-print!)

(println "Hello world!")

(defn hello [] 
<<<<<<< HEAD
    "world")
(def m nodejs/module)
(def e (aget m "exports"))
(aset e "hello" hello)
=======
    "world from clojurejs")
(aset js/exports "hello" hello)
>>>>>>> 5c0ee19f121ca8bf036b05e19bd53c4ed57f4b5f
