(ns fizzbuzz.core
  (:gen-class)
  (:use [clojure.pprint :only (pprint)]))


(defn test-mul
  "Create function that tests if n is multiple of i."
  [i]
  (fn [n] (= (mod n i) 0)))


(def mul-3? (test-mul 3))
(def mul-5? (test-mul 5))
(def mul-3-and-5? #(and (mul-3? %) (mul-5? %)))


(defn fizzbuzz
  "It's fizzbuzz.
  Return:
  fizz - if multiple of 3
  fizz - if multiple of 5
  fizzbuzz - if multiple of 3 and 5
  else return n
  "
  [n]
  (cond 
    (mul-3-and-5? n) "fizzbuzz"
    (mul-3? n) "fizz"
    (mul-5? n) "buzz"
    :else n))


(defn -main
  "run fizzbuzz"
  [& args]
  (pprint (map fizzbuzz (range 1 101))))
