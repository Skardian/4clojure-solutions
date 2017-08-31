(defn __
  [x]
  (
   ;; Begin code
   (fn [x]
     (map first (partition-by identity x)))
   ;; End code
   x))
(__ "Leeeeeerrroyyy")

(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
