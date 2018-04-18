(ns prime-matrix.square-matrix
  (:require [clojure.core.matrix :as m]))

(defn square-matrix[v]
  (let [vm [v]]
    (m/emap
      #(int %)
        (m/mmul (m/transpose vm) vm))))
