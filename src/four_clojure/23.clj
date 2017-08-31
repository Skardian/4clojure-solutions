(defn __
  [x]
  (
   ;; Begin code
   (fn [s]
     (reduce (fn [l x] (conj l x)) '() s))
   ;; End code
   x))
(__ [1 2 3 4 5])

(= (__ [1 2 3 4 5]) [5 4 3 2 1])
(= (__ (sorted-set 5 7 2 7)) '(7 5 2))
(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
