
(= ((fn [v n] (if (= n 0) (first v) (recur (rest v) (- n 1)))) '(4 5 6 7) 2) 6)
(= ((fn [v n] (if (= n 0) (first v) (recur (rest v) (- n 1)))) [:a :b :c] 0) :a)
(= ((fn [v n] (if (= n 0) (first v) (recur (rest v) (- n 1)))) [1 2 3 4] 1) 2)
(= ((fn [v n] (if (= n 0) (first v) (recur (rest v) (- n 1)))) '([1 2] [3 4] [5 6]) 2) [5 6])


