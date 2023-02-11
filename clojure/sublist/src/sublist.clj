(ns sublist)

(defn classify [list1 list2] ;; <- arglist goes here
      ;; your code goes here
  (let [string1 (clojure.string/join "," list1)
        string2 (clojure.string/join "," list2)]
    (cond
      (= string1 string2) :equal
      (clojure.string/includes? string1 string2) :superlist
      (clojure.string/includes? string2 string1) :sublist
      :else :unequal)))

