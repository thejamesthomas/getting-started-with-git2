(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))


(deftest test-mul-just-3
  (testing "test-mul"
    (is (= ((test-mul 3) 3) true))))


(deftest mul-3-test-rand-col
  (testing "mul-3?"
    (is (= #{true} (set (map mul-3? (repeatedly 1000 #(* 3 (rand-int 1000)))))))))


(deftest test-mul-just-5
  (testing "test-mul"
    (is (= ((test-mul 5) 5) true))))


(deftest mul-5-test-rand-col
  (testing "mul-5?"
    (is (= #{true} (set (map mul-5? (repeatedly 1000 #(* 5 (rand-int 1000)))))))))


(deftest mul-3-and-5
  (testing "mul-3-and-5?"
    (is (= (mul-3-and-5? 15) true))))


(deftest mul-3-and-5-test-rand-col
  (testing "mul-3-and-5?"
    (is (= #{true} (set (map mul-3-and-5? (repeatedly 1000 #(* 5 3 (rand-int 1000)))))))))


(deftest fizzbuzz-mul-3-and-5
 (testing "fizzbuzz"
   (is (= "fizzbuzz" (fizzbuzz 15)))))


(deftest fizzbuzz-mul-3
 (testing "fizzbuzz"
   (is (= "fizz" (fizzbuzz 3)))))


(deftest fizzbuzz-mul-three
 (testing "fizzbuzz"
   (is (= #{"fizz" "fizzbuzz"} (set (map fizzbuzz (map #(* 3 %) (range 1000))))))))


(deftest fizzbuzz-mul-5
 (testing "fizzbuzz"
   (is (= "buzz" (fizzbuzz 5)))))


(deftest fizzbuzz-mul-5
  (testing "fizzbuzz"
    (is (= #{"buzz" "fizzbuzz"} (set (map fizzbuzz (map #(* 5 %) (range 1000))))))))

(deftest fizzbuzz-mul-5-and-3
  (testing "fizzbuzz"
    (is (= #{"fizzbuzz"} (set (map fizzbuzz (map #(* 5 3 %) (range 1000))))))))
