(ns clojure-language-server.core
    (:require [cljs.nodejs :as nodejs]))

(enable-console-print!)

(println "Hello world!")

(defn hello [] 
    "world")
(def m nodejs/module)
(def e (aget m "exports"))
(aset e "hello" hello)