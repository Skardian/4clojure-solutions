(defn __
  [x]
  (
   ;; Begin code
   (fn count-ocurrecnes [s]
     (let [m (group-by identity s)]
       (zipmap (keys m) (map count (vals m)))))
   ;; End code
   x))
(__ [1 1 2 3 2 1 1])

(= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
(= (__ [:b :a :b :a :b]) {:a 2, :b 3})
(= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
