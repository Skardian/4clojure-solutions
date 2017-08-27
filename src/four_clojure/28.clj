(= ((fn [x]
      (reduce
        (fn my-flatten
          [acc x]
          (if (coll? x)
            (reduce my-flatten acc x)
            (conj acc x)))
        []
        x
        )) '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= ((fn [x]
      (reduce
        (fn my-flatten
          [acc x]
          (if (coll? x)
            (reduce my-flatten acc x)
            (conj acc x)))
        []
        x
        )) ["a" ["b"] "c"]) '("a" "b" "c"))
(= ((fn [x]
      (reduce
        (fn my-flatten
          [acc x]
          (if (coll? x)
            (reduce my-flatten acc x)
            (conj acc x)))
        []
        x
        )) '((((:a))))) '(:a))

(fn [x] filter #(not (coll? %)) (tree-seq coll? seq x))
