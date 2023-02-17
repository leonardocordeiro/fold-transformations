(ns fold-transformations.core-test
  (:require [clojure.test :refer :all]
            [fold-transformations.core :refer :all]))

(deftest fold-based-transformations-test
  (testing "should reverse the list"
    (is (= (reverse [0 1 2 3 4]) [4 3 2 1 0])))

  (testing "should count the number of elements in the list"
    (is (= (len [0 1 2 3 4 5 6]) 7))))
