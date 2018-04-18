(ns prime-matrix.core
  (:require
    [clojure.core.matrix :as m]
    [prime-matrix.primes :refer [nprimes]]
    [prime-matrix.square-matrix :refer [square-matrix]]))

(defn- formatter [x]
  (if (number? x)
    (format "%s" (int x))
    (str x)))

(defn- top-chrome[v]
  (vector
    (vec v)
    (vec (repeat (count v) "---"))))

(defn- left-chrome[v]
  (into
    {0 [" " "|"] 1 ["---" "+"]}
    (map-indexed
      (fn[i n]
        (vector (+ i 2)
      [n "|"])) v)))

(defn display-data[v m]
  (let [
      top-decorated (into (top-chrome v) m)
      left-dec (left-chrome v)
    ]
    (vec (map-indexed
      (fn[i r] (into (get left-dec i) r))
      top-decorated))))

(defn -main
  "Application entry point"
  [& args]
  (println "Prime Matix")
  (let [
    p (nprimes (Integer. (first args)))
    sm (square-matrix p)]
      (m/pm (display-data p sm) {:formatter formatter})))
