(defn __
  [x y]
  (
   ;; Begin code
   (fn rotate-seq [x n]
     (let
       [c (count n)]
       (take
         c
         (drop (mod % c) (cycle n) ))))
   ;; End code
   x y))
(__ 2 [1 2 3 4 5])
	
(= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
(= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
(= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
(= (__ 1 '(:a :b :c)) '(:b :c :a))
(= (__ -4 '(:a :b :c)) '(:c :a :b))
