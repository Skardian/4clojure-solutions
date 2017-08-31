(defn __
  [x]
  (
   ;; Begin code
   (fn [x]
     (reduce
       (fn my-flatten
         [acc x]
         (if (coll? x)
           (reduce my-flatten acc x)
           (conj acc x)))
       []
       x))
   ;; End code
   x))
(__ ["a" ["b"] "c"])

(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
(= (__ '((((:a))))) '(:a))
