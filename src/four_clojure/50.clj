(defn __
  [x]
  (
   ;; Begin code
   (fn split-by-type [x]
     (vals (group-by type x)))
   ;; End code
   x))
(__ [1 :a 2 :b 3 :c])

(= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
(= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
(= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})


