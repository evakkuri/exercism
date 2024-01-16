(ns collatz-conjecture)

(require 'clojure.tools.logging)

(defn collatz [num] ;; <- arglist goes here
  ;; your code goes here
  (loop [num-steps 0
         current-num num]
    ;; (info num-steps current-num)
    (cond
      (<= current-num 0) (throw (Exception. "Starting number must be 1 or higher"))
      (= current-num 1) num-steps
      (even? current-num) (recur (+ num-steps 1) (/ current-num 2))
      :else (recur (+ num-steps 1) (+ (* current-num 3) 1)))))
