(defn __
  [x]
  (
   ;; Begin code
   (fn find-distinct [s]
     (reduce (fn [acc x]
               (if (some #{x} acc)
                 acc
                 (conj acc x))) [] s))
   ;; End code
   x))
(__ '([2 4] [1 2] [1 3] [1 3]))

(= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
(= (__ [:a :a :b :b :c :c]) [:a :b :c])
(= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
(= (__ (range 50)) (range 50))
