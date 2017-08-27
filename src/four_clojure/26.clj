(= ((fn [n] (take n (map first (iterate (fn [[x y]] [y (+ x y)]) [1 1])))) 3) '(1 1 2))
(= ((fn [n] (take n (map first (iterate (fn [[x y]] [y (+ x y)]) [1 1])))) 6) '(1 1 2 3 5 8))
(= ((fn [n] (take n (map first (iterate (fn [[x y]] [y (+ x y)]) [1 1])))) 8) '(1 1 2 3 5 8 13 21))

