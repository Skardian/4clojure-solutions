(defn __
  [x y]
  (
   ;; Begin code
   (fn my-partition [n s]
     (remove
       #(not= (count %) n)
       (loop [x s
              acc []]
         (if (empty? x)
           acc
           (recur (drop n x) (conj acc (take n x)))))))
   ;; End code
   x y))
(__ 3 (range 9))

(= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
(= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
(= (__ 3 (range 8)) '((0 1 2) (3 4 5)))
