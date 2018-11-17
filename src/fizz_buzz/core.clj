(ns fizz-buzz.core
  (:require [clojure.string :as str]))

(def a 
  "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz")

(defn fizz-buzz 
  [n]
  (cond
      (and (= (mod n 3) 0) (= (mod n 5) 0)) "FizzBuzz" 
      (= (mod n 3) 0) "Fizz" 
      (= (mod n 5) 0) "Buzz"
      :else (str n)))

(defn fizz-buzz-list 
  [n]
  (->> n
      (+ 1)
      (range 1)
      (map fizz-buzz)
      (str/join ",")))  

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (fizz-buzz-list args)))
