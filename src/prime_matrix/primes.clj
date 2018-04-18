(ns prime-matrix.primes
  (:require [clojure.math.numeric-tower :as math]))

(defn- factor-before-limit?[n i]
  (if (<= i 1)
    false
    (if (= 0 (mod n i))
      true
      (factor-before-limit? n (- i 1)))))

(defn is-prime?[n]
  (if
    (not (or (= n 0) (= n 1)))
    (or
      (= n 2)
      (= n 3)
      (not (factor-before-limit? n (int (math/sqrt n)))))))

(defn- next-prime[n]
  (if (is-prime? n)
    n
    (next-prime (inc n))))

(defn- primes[n acc]
    (if (= (count acc) n)
      acc
      (primes n
        (cons
          (next-prime (inc (or (first acc) 0)))
          acc))))

(defn nprimes[n]
  (reverse (primes n '())))
