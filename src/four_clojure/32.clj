(= ((fn [x] (reduce (fn [acc x] (conj acc x x)) [] x)) [1 2 3]) '(1 1 2 2 3 3))
(= ((fn [x] (reduce (fn [acc x] (conj acc x x)) [] x)) [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= ((fn [x] (reduce (fn [acc x] (conj acc x x)) [] x)) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
(= ((fn [x] (reduce (fn [acc x] (conj acc x x)) [] x)) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
