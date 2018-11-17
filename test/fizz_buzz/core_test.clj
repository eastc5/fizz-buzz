(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

(deftest fizz-buzz-test
  (testing "fizz-buzz function unit tests"
    (assert 
      (= (fizz-buzz 3) "Fizz"))

    (assert 
      (= (fizz-buzz 5) "Buzz"))    

    (assert 
      (= (fizz-buzz 15) "FizzBuzz"))

    (assert 
      (= (fizz-buzz 1) "1"))))    

(deftest fizz-buzz-list-test
  (testing "fizz buzz list test" 
  (let [a "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz"] 
    (assert 
      (= (fizz-buzz-list 15) a)))))
