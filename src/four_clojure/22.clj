(defn __
  [x]
  (
   ;; Begin code
   (fn [s]
     (reduce (fn [acc _] (inc acc)) 0 s))
   ;; End code
   x))
(__ '(0 2 3 3 1))

(= (__ '(0 2 3 3 1)) 5)
(= (__ "Hello World") 11)
(= (__ [[1 2] [3 4] [5 6]]) 3)
(= (__ '(13)) 1)
(= (__ '(:a :b :c)) 3)
