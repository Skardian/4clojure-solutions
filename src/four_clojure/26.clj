(defn __
  [x]
  (
   ;; Begin code
   (fn [n]
     (take n
           (map first (iterate (fn [[x y]]
                                 [y (+ x y)])
                               [1 1]))))
   ;; End code
   x))
(__ 3)

(= (__ 3) '(1 1 2))
(= (__ 6) '(1 1 2 3 5 8))
(= (__ 8) '(1 1 2 3 5 8 13 21))
