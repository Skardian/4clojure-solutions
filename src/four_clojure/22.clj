(= (#(reduce (fn [x _] (inc x)) 0 %) '(0 2 3 3 1)) 5)
(= (#(reduce (fn [x _] (inc x)) 0 %) "Hello World") 11)
(= (#(reduce (fn [x _] (inc x)) 0 %) [[1 2] [3 4] [5 6]]) 3)
(= (#(reduce (fn [x _] (inc x)) 0 %) '(13)) 1)
(= (#(reduce (fn [x _] (inc x)) 0 %) '(:a :b :c)) 3)