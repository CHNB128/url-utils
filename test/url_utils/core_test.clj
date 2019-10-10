(ns url-utils.core-test
  (:require [clojure.test :refer :all]
            [url-utils.core :refer :all]))

(deftest encode-params-test
  (testing "Encode url params"
    (is (= "a=1&b=asd+dsa&c=false" (encode-params {:a 1 :b "asd dsa" :c false})))))
