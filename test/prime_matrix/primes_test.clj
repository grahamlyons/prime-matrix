(ns prime-matrix.primes-test
  (:require [clojure.test :refer :all]
            [prime-matrix.primes :refer :all]))

(deftest prime-stream
  (testing "first 5 primes"
    (is (= (nprimes 5) '(2 3 5 7 11))))
  (testing "first 20 primes"
      (is (= (nprimes 20) '(2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71)))))

(deftest is-prime?-test
  (testing "zero is not prime"
    (is (not (is-prime? 0))))
  (testing "one is not prime"
    (is (not (is-prime? 1))))
  (testing "first prime number"
    (is (is-prime? 2)))
  (testing "second prime number"
    (is (is-prime? 3)))
  (testing "not a prime number"
    (is (not (is-prime? 4))))
  (testing "5 is prime"
    (is (is-prime? 5))))
