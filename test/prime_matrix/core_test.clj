(ns prime-matrix.core-test
  (:require [clojure.test :refer :all]
            [prime-matrix.core :refer :all]))

(deftest display-data-test
  (testing "matrix data gets display information added"
    (let [
      sm [[0 0 0][0 0 0][0 0 0]]
      v [1 2 3]
      expected [
        [" " "|" 1 2 3]
        ["---" "+" "---" "---" "---"]
        [1 "|" 0 0 0]
        [2 "|" 0 0 0]
        [3 "|" 0 0 0]
      ]]
      (is (= expected (display-data v sm)))))
  (testing "larger matrix data gets display information added"
    (let [
      sm [[0 0 0 0][0 0 0 0][0 0 0 0][0 0 0 0]]
      v [1 2 3 4]
      expected [
        [" " "|" 1 2 3 4]
        ["---" "+" "---" "---" "---" "---"]
        [1 "|" 0 0 0 0]
        [2 "|" 0 0 0 0]
        [3 "|" 0 0 0 0]
        [4 "|" 0 0 0 0]
      ]]
      (is (= expected (display-data v sm))))))
