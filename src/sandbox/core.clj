(ns sandbox.core
  (:require [tupelo.base64 :as base64]
            [clojure.data.codec.base64 :as b64]
            [clojure.java.io :as io])
  (:gen-class))

(defn get-file
  "opens file for"
  []
  (with-open [in (io/input-stream "resources/rsz_carrots.jpg")
              out (io/output-stream "output.b64")]
   (b64/encoding-transfer in out)))




(defn -main

  "I don't do a whole lot ... yet."
  [& args]
  (get-file)
  (println "Hello, World!"))
