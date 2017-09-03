(defn __
  [& x]
  (apply
   ;; Begin code
   (fn my-reductions
     ([f coll]
      (my-reductions f (first coll) (rest coll)))
     ([f res coll]
      (cons
        res
        (lazy-seq (if (empty? coll)
           '()
           (my-reductions f (f res (first coll)) (rest coll)))))))
   ;; End code
   x))
(take 5 (__ + (range 100)))

(= (take 5 (__ + (range))) [0 1 3 6 10])
(= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
(= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)

