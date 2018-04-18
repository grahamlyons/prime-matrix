(ns prime-matrix.square-matrix-test
  (:require [clojure.test :refer :all]
            [prime-matrix.square-matrix :refer :all]))

(deftest matrix-test
  (testing "a vector returns a square matrix of squares"
    (is
      (=
        [[1 2 3][2 4 6][3 6 9]]
        (square-matrix [1 2 3]))))
  (testing "a list returns a square matrix of squares"
    (is
      (=
        [[1 2 3][2 4 6][3 6 9]]
        (square-matrix '(1 2 3)))))
  (testing "a bigger vector"
    (is
      (=
        [[25 20 15 10 5][20 16 12 8 4][15 12 9 6 3][10 8 6 4 2][5 4 3 2 1]]
        (square-matrix [5 4 3 2 1])))))
