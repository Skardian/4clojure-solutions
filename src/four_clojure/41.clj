(defn __
  [x y]
  (
   ;; Begin code
   (fn drop-nth [x n]
     (flatten (partition-all (dec n) n x)))
   ;; End code
   x y))
(__ [1 2 3 4 5 6] 4)

(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
